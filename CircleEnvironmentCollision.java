public class CircleEnvironmentCollision extends EnvironmentCollision{

    public CircleEnvironmentCollision(Circle c, Environment env) {
        super(c, env);
    }

    @Override
    public void collisionManagment() {
        if(this.areColliding()){
            if(obj.getPosition().getY() + ((Circle)obj).getRadius() >= ((Environment)environment).getTopLimit()||
                    obj.getPosition().getY() - ((Circle)obj).getRadius() <= ((Environment)environment).getBottomLimit()){
                obj.setSpeed(obj.getSpeed().getX(), -obj.getSpeed().getY());
            }
            else if(obj.getPosition().getX() + ((Circle)obj).getRadius() >= ((Environment)environment).getRightLimit()||
                    obj.getPosition().getX() - ((Circle)obj).getRadius() <= ((Environment)environment).getLeftLimit()){
                obj.setSpeed(-obj.getSpeed().getX(), obj.getSpeed().getY());
            }
        }
    }

    @Override
    protected boolean areColliding() {
        return obj.getPosition().getY() + ((Circle)obj).getRadius() >= ((Environment)environment).getTopLimit()||
                obj.getPosition().getY() - ((Circle)obj).getRadius() <= ((Environment)environment).getBottomLimit()||
                obj.getPosition().getX() + ((Circle)obj).getRadius() >= ((Environment)environment).getRightLimit()||
                obj.getPosition().getX() - ((Circle)obj).getRadius() <= ((Environment)environment).getLeftLimit();
    }
    
    
}
