package ch7_Shape;

abstract class Shape {
	Point p;
	
	Shape(){
		this(new Point(0,0));
	}
	Shape(Point p){
		this.p=p;
	}
	abstract double calcArea();
	void setPosition(Point p) {
		this.p=p;
	}
}

class Point{
	int x,y;
	
	Point(){
		this(0,0);
	}
	Point(int x,int y){
		this.x=x;
		this.y=y;
	}
	public String toString() {
		return "["+x+","+y+"]";
	}
}
