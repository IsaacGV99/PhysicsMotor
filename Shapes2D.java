
public abstract class Shapes2D{

	 public Vector Posicion = new Vector();//x, y  
	 public Vector Velocidad = new Vector();//dx, dy   
	 public Vector gravedad = new Vector(0,-9.81);//gravedad es un vector de velocidad 
	 public int masa;//Masa del cuerpo sólido 
	 
     public Shapes2D(int x_pos, int y_pos, int x_vel, int y_vel ,int masa){  
    	 this.Posicion.x = x_pos;   
    	 this.Posicion.y = y_pos;  
    	 this.Velocidad.x = x_vel;  
    	 this.Velocidad.y = y_vel;  
    	 this.masa = masa;  
    	}
	
          public double getX_posicion() {
    	 	return Posicion.x;
     }
     
    	 public double getY_posicion() {
    		 return Posicion.y;
     }
       public void setX_posicion(double x) {
    	 	 Posicion.x = x;;
     }
     
     public void setY_posicion(double y) {
    	  	Posicion.y = y;
     }
     
}
