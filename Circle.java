package com.iteso.motor;

public class Circle {
	
	private double radius;
	private Vector position;
	
	public Circle(double rad, double x, double y) {
		this.radius = rad;
		this.position.setX(x);
		this.position.setY(y);
	}
	
	public double getRadius() {
		return this.radius;
	}
	
	public double getX() {
		return position.getX();
	}
	
	public double getY() {
		return position.getY();
	}
	
	public void setRadius(double radius) {
		this.radius = radius;
	}
	
	public void setX(double x) {
		this.position.setX(x);
	}
	
	public void setY(double y) {
		this.position.setX(y);
	}
	
	public static boolean circleCollision(Circle c1, Circle c2) {
		return Math.pow(c1.position.getX() - c2.position.getX(),2) + 
			   Math.pow(c1.position.getY() - c2.position.getY(),2) <
			   c1.getRadius() + c2.getRadius();
	}
}
