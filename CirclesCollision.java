package com.iteso.proyecto_prueba_1;

public class CirclesCollision extends ObjectCollision{

	public CirclesCollision(Circle c1, Circle c2) {
		super(c1,c2);
	}
	
	@Override
        public void collisionManagment(){
            if(this.areColliding()){
                //double d = Vector.distance(obj1.getPosition(), obj2.getPosition());
                Vector norm = Vector.normalize(Vector.subVectors(obj1.getPosition(),obj2.getPosition()));
                double p = 2*(Vector.dot(obj1.getSpeed(), norm) - Vector.dot(obj2.getSpeed(), norm))/(obj1.mass*obj2.mass);
                obj1.setSpeed(obj1.getSpeed().getX() - (p * obj1.mass * norm.getX()),
                                obj1.getSpeed().getY() - (p * obj1.mass * norm.getY()));
                obj2.setSpeed(obj2.getSpeed().getX() + (p * obj2.mass * norm.getX()),
                                obj2.getSpeed().getY() + (p * obj2.mass * norm.getY()));
               
            }
        }
        @Override
	protected boolean areColliding(){
		return Vector.distance2(obj1.getPosition(), obj2.getPosition()) <
		   Math.pow(((Circle)obj1).getRadius() + ((Circle)obj2).getRadius(), 2);
	}
}
