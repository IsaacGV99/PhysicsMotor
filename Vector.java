package com.iteso.motor;


public class Vector {
	
	private int x, y;
	
	public Vector() {
		this.x = 1;
		this.y = 1;
	}
	
	public Vector(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public int getX() {
		return x;
	}
	
	public int getY() {
		return y;
	}
	
	public void setX(int x) {
		this.x = x;
	}
	
	public void setY(int y) {
		this.y = y;
	}
	
	public double magnitude() {
		return (Math.sqrt(this.x*this.x + this.y*this.y));
	}
	
	public double angle() {
		return (Math.atan(this.y / this.x));
	}
	
	public void escalar(int esc) {
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
	
	/*public static Vector normalize(Vector v) {
		Vector norm = new Vector();
		norm.setX(v.getX()/v.magnitude());
		norm.setY(v.getY()/v.magnitude());
		return norm;
	}*/
	
	public static double distance(Vector v1, Vector v2) {
		return Math.sqrt(Math.pow(v1.getX() - v2.getX(), 2) +
						 Math.pow(v1.getY() - v2.getY(), 2));
	}
	public static double distance2(Vector v1, Vector v2) {
		return Math.pow(v1.getX() - v2.getX(), 2) +
						 Math.pow(v1.getY() - v2.getY(), 2);
	}
	
	public static int dot(Vector v1, Vector v2) {
		return v1.getX()*v2.getX() + v1.getY()*v2.getY();
 	}
        
        public  void scaling(double scalar){
            if (scalar != 0){
                this.x = (int)scalar*this.x;
                this.y = (int)scalar*this.x;
            }
        }
        @Override
        public Vector clone(){
            Vector v = new Vector(this.x, this.y);
            return v;    
        }
}

