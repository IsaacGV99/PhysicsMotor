package com.iteso.motor;

public class Circle extends Shapes2D{
	
	private double radius;
	
	
	public Circle(double rad, double x, double y) {
		this(rad,x,y,0,0,1);
	}
	
	public Circle(double rad, double xPos, double yPos, double  xSpeed, double ySpeed, double mass) {
		super(xPos, yPos, xSpeed, ySpeed, mass);
                this.radius = rad;
	}
	
	public double getRadius() {
		return this.radius;
	}
	
	public void setRadius(double radius) {
		this.radius = radius;
	}	
}
