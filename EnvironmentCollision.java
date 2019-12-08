public abstract class EnvironmentCollision {

	protected Shapes2D obj; 
  protected Environment env;
	private boolean collision;

	public EnvironmentCollision(Shape2D obj, Environment env) {
		this.obj = obj;
		this.env = env;
	}
	
	public boolean isThereCollision(){
		return this.collision;
	}
	
	public boolean updateStatus(){
		this.collision = this.areColliding();
		return this.collision;
	}
	protected abstract void collisionManagment();
	
	protected abstract boolean areColliding();	
	
}
