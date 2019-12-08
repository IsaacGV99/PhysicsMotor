public class CirclesCollision extends ObjectCollision{

	public CirclesCollision(Circle c1, Circle c2) {
		super(c1,c2);
	}
	
	protected void collisionManagment(){
		/*
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
		*/
		/*double e = 1; // coeficiente restitucion
		Vector new_direction;   
	 	new_direction = this.getPosicion.subVectors(shape.Posicion);
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
	 	shape.Velocidad.y = v2Final.y;*/
	}
	protected abstract boolean areColliding(){
		return Math.pow(c1.position.getX() - c2.position.getX(),2) + 
		   Math.pow(c1.position.getY() - c2.position.getY(),2) <
		   Matgh.pow(c1.getRadius() + c2.getRadius());	
	}
}
