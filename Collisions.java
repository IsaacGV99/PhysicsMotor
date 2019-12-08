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

	     public static void ManejoColision_CIRCLE_CIRCLE(Shapes2D shape) { // maneja la colision   
		 double e = 1; // coeficiente restitucion
		 Vector new_direction;   
		 new_direction = this.Posicion.subVectors(shape.Posicion);
		 new_direction = new_direction.normalize();     

		 double velocity1 = this.Velocidad.dot(new_direction);
		 double velocity2 = shape.Velocidad.dot(new_direction);  

		 double new_velocity1 = ( ((this.masa - e*shape.masa)*velocity1) + ((1+e)*shape.masa*velocity2) ) / (this.masa + shape.masa); 
		 double new_velocity2 = ( ((shape.masa - e*this.masa)*velocity2) + ((1+e)*this.masa*velocity1) ) / (this.masa + shape.masa); 

		 Vector v1Final = this.Velocidad.suma(new_direction.escalar(new_velocity1 - velocity1));  
		 Vector v2Final = shape.Velocidad.suma(new_direction.escalar(new_velocity2-velocity2));   
		 this.Velocidad.x = v1Final.x;  
		 this.Velocidad.y = v1Final.y;  
		 shape.Velocidad.x = v2Final.x; 
		 shape.Velocidad.y = v2Final.y;     
		 } 
}
