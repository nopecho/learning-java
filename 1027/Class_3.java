class Circle{
	int radius;
	String name;
	public Circle() {
		radius=1;
		name="";
	}
	public Circle(String v1,int v2) {
		radius=v2;
		name=v1;
	}
	public double getArea() {
		return 3.14*radius*radius;
	}
}

public class Class_3 {

	public static void main(String[] args) {
	Circle pizza=new Circle("ÇÍÂ¥",20);
	double area=pizza.getArea();
	System.out.println(area);
	
	Circle a=new Circle();
	area=a.getArea();
	System.out.println(area);
	}
}
