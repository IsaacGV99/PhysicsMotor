package com.iteso.motor;

public class Rectangle {
	private double base, height;
	protected Vector position;
	
	public Rectangle(double base, double height, double x, double y) {
		this.base = base;
		this.height = height;
		this.position.setX(x);
		this.position.setY(y);
	}
	
	public double getBase() {
		return this.base;
	}
	
	public double getHeight() {
		return this.height;
	}
	
	public double getX() {
		return this.position.getX();
	}
	
	public double getY() {
		return this.position.getY();
	}
	
	public void setBase(double base) {
		this.base = base;
	}
	
	public void setHeight(double height) {
		this.height = height;
	}
	
	public void setX(double x) {
		this.position.setX(x);
	}
	
	public void setY(double y) {
		this.position.setY(y);
	}
	
}
