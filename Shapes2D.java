
public abstract class Shapes2D{

	public Vector position = new Vector();//x, y  
	public Vector speed = new Vector();//dx, dy   
	public Vector gravity = new Vector(0,-9.81);//gravedad es un vector de velocidad 
	public int mass;//Masa del cuerpo sólido 
	 
	public Shapes2D(int x_pos, int y_pos, int x_speed, int y_speed ,int masa){  
	 	this.position.setX(x_pos);     
	 	this.position.setY(y_pos);  
	 	this.speed.setX(x_speed);  
	 	this.speed.setY(y_speed);  
	 	this.mass = mass; 
	}
	
	public Shapes2D(int x_pos, int y_pos) {
		this(x_pos, y_pos, 0, 0, 1);
	}
	
	public Vector getPosition() {
    	 	return this.position;
     	}
     
    	 public Vector getSpeed() {
    		return this.speed;
     	}
	
     	public void setPosition(int x, int y) {
    	 	this.position.setX(x);
		this.position.setY(y);
     	}
	
	public void setPosition(Vector newPosition) {
    	 	this.position.setX(newPosition.getX());
		this.position.setY(newPosition.getY());
     	}
     
	public void setSpeed(int x, int y) {
    	 	this.speed.setX(x);
		this.speed.setY(y);
     	}
	
	public void setSpeed(Vector newSpeed) {
    	 	this.speed.setX(newSpeed.getX());
		this.speed.setY(newSpeed.getY());
     	}
}
    
    public int getMass() {
    	return this.mass;
    }
    
    public void setMass(int mass) {
    	this.mass = mass;
    }
    
}

