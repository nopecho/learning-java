package ch7_Shape;

class Circle extends Shape {
	private double r;
	
	Circle(){ this.r=0; }	 
	
	Circle(double r){ this.r=r; }
	
	Circle(int r){ this.r=(double)r; }
			
	@Override
	double calcArea(){
		return Math.PI*r*r;
	}
}

