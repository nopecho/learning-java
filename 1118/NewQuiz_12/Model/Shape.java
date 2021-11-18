package Model;

public abstract class Shape { 
	private Shape next;
	private Shape prev;
	public Shape() { prev=next=null; }	

	public void setNext(Shape obj) { next=obj; } 
	public Shape getNext() { return next; } 
	
	public void setPrev(Shape obj) { prev=obj; }
	public Shape getPrev() { return prev; }
	
	public abstract void draw();
}