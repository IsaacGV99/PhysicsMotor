
public abstract class Shapes2D{

	public Vector position = new Vector();//x, y  
	public Vector speed = new Vector();//dx, dy   
	public Vector gravity = new Vector(0,-9.81);//gravedad es un vector de velocidad 
	public int mass;//Masa del cuerpo sólido 
	 
	public Shapes2D(int xPos, int yPos, int xSpeed, int ySpeed ,int masa){  
	 	this.position.setX(xPos);     
	 	this.position.setY(yPos);  
	 	this.speed.setX(xSpeed);  
	 	this.speed.setY(ySpeed);  
	 	this.mass = mass; 
	}
	
	public Shapes2D(int xPos, int yPos) {
		this(xPos, yPos, 0, 0, 1);
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

