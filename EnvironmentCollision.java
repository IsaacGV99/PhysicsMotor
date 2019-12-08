
public abstract class EnvironmentCollision {

	protected Shapes2D obj; 
  	protected Object environment;
	private boolean collision;

	public EnvironmentCollision(Shapes2D obj, Object env) {
		this.obj = obj;
		this.environment = env;
		updateStatus();
	}
	
	public boolean isThereCollision(){
		return this.collision;
	}
	
	public boolean updateStatus(){
		this.collision = this.areColliding();
		return this.collision;
	}
	public abstract void collisionManagment();
	
	protected abstract boolean areColliding();	
	
}

