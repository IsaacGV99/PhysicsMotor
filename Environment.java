
public class Environment {
    private int topLimit;
    private int bottomLimit;
    private int leftLimit;
    private int rightLimit;
    
    public Environment(int left, int right, int bottom, int top){
     this.leftLimit = left;
     this.rightLimit = right;
     this.bottomLimit = bottom;
     this.topLimit = top;
    }
    public int getLeftLimit(){
        return this.leftLimit;
    }
    
    public int getRightLimit(){
        return this.rightLimit;
    }
    
    public int getBottomLimit(){
        return this.bottomLimit;
    }
    
    public int getTopLimit(){
        return this.topLimit;
    }
}
