package kr.ac.kookmin.shape;


public abstract class Shape {
	
    protected Point center;
    
//Implement here
    
    
    
   public void getCenter(Point center){
	      
   }

   	public abstract Point getCenter();
   
   	public abstract Rectangle getBounds();
   	
   	public abstract void draw(Graphics g);
}
