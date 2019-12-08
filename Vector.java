package com.iteso.motor;

public class Vector {
	
	private double x, y;
	
	public Vector() {
		this.x = 1;
		this.y = 1;
	}
	
	public Vector(double x, double y) {
		this.x = x;
		this.y = y;
	}
	
	public double getX() {
		return x;
	}
	
	public double getY() {
		return y;
	}
	
	public void setX(double x) {
		this.x = x;
	}
	
	public void setY(double y) {
		this.y = y;
	}
	
	public double magnitude() {
		return (Math.sqrt(this.x*this.x + this.y*this.y));
	}
	
	public double angle() {
		return (Math.atan(this.y / this.x));
	}
	
	public void escalar(double esc) {
		this.x = this.x * esc;
		this.y = this.y * esc;
	}
	
	public static Vector sumVectors(Vector v1, Vector v2) {
		Vector res = new Vector();
		res.setX(v1.getX() + v2.getX());
		res.setY(v1.getY() + v2.getY());
		return res;
	}
	
	public static Vector subVectors(Vector v1, Vector v2) {
		Vector res = new Vector();
		res.setX(v1.getX() - v2.getX());
		res.setY(v1.getY() - v2.getY());
		return res;
	}
	
	public static Vector normalize(Vector v) {
		Vector norm = new Vector();
		norm.setX(v.getX()/v.magnitude());
		norm.setY(v.getY()/v.magnitude());
		return norm;
	}
	
	public static double distance(Vector v1, Vector v2) {
		return Math.sqrt(Math.pow(v1.getX() - v2.getX(), 2) +
						 Math.pow(v1.getY() - v2.getY(), 2));
	}
	public static double distance2(Vector v1, Vector v2) {
		return Math.pow(v1.getX() - v2.getX(), 2) +
			Math.pow(v1.getY() - v2.getY(), 2);
	}
	
	public static double dot(Vector v1, Vector v2) {
		return v1.getX()*v2.getX() + v1.getY()*v2.getY();
 	}
        
        public  void scaling(double scalar){
            if (scalar != 0){
                this.x = scalar*this.x;
                this.y = scalar*this.x;
            }
        }
        @Override
        public Vector clone(){
            Vector v = new Vector(this.x, this.y);
            return v;    
        }
}


