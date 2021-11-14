class Shape{
	public Shape next; //??�����ǹ�?
	public Shape() { //?? 
		next=null;
	}
	public void draw() {
		System.out.println("Shape");
	}
}
class Line extends Shape{
	@Override
	public void draw() {
		System.out.println("Line");
	}
}
class Rect extends Shape{
	@Override
	public void draw() {
		System.out.println("Rect");
	}
}
class Circle extends Shape{
	@Override
	public void draw() {
		System.out.println("Circle");
	}
}
public class Ex5_5 {
	static void paint(Shape p) {
		p.draw();
	}
	public static void main(String[] args) {
		Line l = new Line();
		l.draw();
		
		paint(new Line());
		paint(new Shape());
		paint(new Rect());
		paint(new Circle());		
	}
}