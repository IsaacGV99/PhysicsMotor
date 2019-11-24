package com.iteso.motor;

public class Collisions {

	public static boolean circleCollision(Circle c1, Circle c2) {
		return Math.pow(c1.position.getX() - c2.position.getX(),2) + 
			   Math.pow(c1.position.getY() - c2.position.getY(),2) <
			   c1.getRadius() + c2.getRadius();
	}
	
	public static boolean rectangleCollision(Rectangle r1, Rectangle r2) {
		return r1.position.getX() < r2.position.getX() + r2.getBase() &&
		   r1.position.getX() + r1.getBase() > r2.position.getX() &&
		   r1.position.getY() < r2.position.getY() + r2.getHeight() &&
		   r1.getHeight() + r1.position.getY() > r2.position.getY();
	}

}
