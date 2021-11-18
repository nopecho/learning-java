package ch7_Shape;

class Rect extends Shape {
	private double w;
	private double h;
	
	Rect(){
		this.w=0;
		this.h=0;
	}
	Rect(int w,int h){
		this.w=w;
		this.h=h;
	}
	
	@Override
	double calcArea() {
		return w*h;
	}
	
	boolean isSquare() {
		if(w==h) {
			return true;
		}return false;
	}
}
