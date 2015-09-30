package kr.ac.kookmin.shape;

public class Rectangle extends Shape{
	//Implement here
	
	public int w,h;
	
	public Rectangle(Point R_center, int w, int h){
		
		this.center = R_center;
			this.w = w;
			this.h = h;
	}
	
	
	public Rectangle getBounds() {
		return this;
	}
	
	public int getWidth(){
		
		return w;
	}
	
	public int getHeight(){
		
		return h;
	}
	
	
	@Override
	public void draw(Graphics g) {
		g.draw(this);
	}
	
	public Point getCenter(){
		return this.center;
	}
	@Override
	public String toString() {
		return "Rectangle";
	}
}