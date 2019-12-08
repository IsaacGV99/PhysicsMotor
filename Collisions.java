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
package com.iteso.motor;

public class Circle extends Shapes2D{
	
	private int radius;
	
	
	public Circle(int rad, int x, int y) {
		super(x, y);
		this.radius = rad;
	}
	
	public Circle(int rad, int x, int y, double x_vel, double y_vel, int mass) {
		this(rad, x, y);
		this.setX_vel(x_vel);
		this.setY_vel(y_vel);
		this.mass = mass;
	}
	
	public int getRadius() {
		return this.radius;
	}
	
	public int getX() {
		return (int)super.getX_position();
	}
	
	public int getY() {
		return (int)super.getY_position();
	}
	
	public void setRadius(int radius) {
		this.radius = radius;
	}
	
	public void setX(int x) {
		super.setX_position(x);
	}
	
	public void setY(int y) {
		super.setY_position(y);
	}
	
	public void frameCollision() {     
   	if((super.getY_position() + this.radius)> 400 || (super.getY_position() - this.radius) <=0 ) 
   		this.speed.y *= -1; 
   	if((super.getX_position() + this.radius) > 600 || (super.getX_position() - this.radius) <= 0) 
   		 this.speed.x *= -1;
    }
	
	public static void ManejoColision_CIRCLE_CIRCLE(Circle shape1, Circle shape2) { // maneja la colision  
		if(Collisions.circleCollision(shape1, shape2)) {
			double d = Math.sqrt(Math.pow(shape1.getX_position() - shape2.getX_position(), 2) + Math.pow(shape1.getY_position() - shape2.getY_position(), 2));
			Vector norm = new Vector();
			norm.setX((shape1.getX_position() - shape2.getX_position()) / d);
			norm.setY((shape1.getY_position() - shape2.getY_position()) / d);
			double p = 2 * (shape1.getX_vel() * norm.getX() + shape1.getY_vel() * norm.getY() - 
							shape2.getX_vel() * norm.getX() - shape2.getY_vel() * norm.getY()) / 
							(shape1.mass * shape2.mass);
			shape1.setX_vel(shape1.getX_vel() - (p * shape1.mass * norm.getX()));
			shape1.setY_vel(shape1.getY_vel() - (p * shape1.mass * norm.getY()));
			shape2.setX_vel(shape2.getX_vel() + (p * shape2.mass * norm.getX()));
			shape2.setY_vel(shape2.getY_vel() + (p * shape2.mass * norm.getY()));
		}
/*		 double e = 1; // coeficiente restitucion
		 Vector new_direction;   
		 new_direction = this.position.subVectors(, v2)   //Posicion.subVectors(shape.Posicion);
		 new_direction = new_direction.normalize();     

		 double velocity1 = this.Velocidad.dot(new_direction);
		 double velocity2 = shape.Velocidad.dot(new_direction);  

		 double new_velocity1 = ( ((this.masa - e*shape.masa)*velocity1) + ((1+e)*shape.masa*velocity2) ) / (this.masa + shape.masa); 
		 double new_velocity2 = ( ((shape.masa - e*this.masa)*velocity2) + ((1+e)*this.masa*velocity1) ) / (this.masa + shape.masa); 

		 Vector v1Final = this.Velocidad.suma(new_direction.escalar(new_velocity1 - velocity1));  
		 Vector v2Final = shape.Velocidad.suma(new_direction.escalar(new_velocity2-velocity2));   
		 this. = v1Final.x;  
		 this.Velocidad.y = v1Final.y;  
		 shape.Velocidad.x = v2Final.x; 
		 shape.Velocidad.y = v2Final.y;    */ 
	} 
	
}
