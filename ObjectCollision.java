
public abstract class ObjectCollision {

	protected Shapes2D obj1, obj2;
	private boolean collision;

	public ObjectCollision(Shapes2D obj1, Shapes2D obj2) {
		this.obj1 = obj1;
		this.obj2 = obj2;
		updateStatus();
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
