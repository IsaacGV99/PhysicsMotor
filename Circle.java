package com.iteso.motor;

public class Circle extends Shapes2D{
	
	private int radius;
	
	
	public Circle(int rad, int x, int y) {
		super(x, y);
		this.radius = rad;
	}
	
	public Circle(int rad, int xPos, int yPos, int xSpeed, int ySpeed, int mass) {
		super(xPos, yPos, xSpeed, ySpeed, mass);
                this.radius = rad;
	}
	
	public int getRadius() {
		return this.radius;
	}
	
	public void setRadius(int radius) {
		this.radius = radius;
	}	
}
