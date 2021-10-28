
public class Class {
		static class Circle{
		public int radius;
		public String name;
		
		public Circle() {
		}
		
		public double getArea() {
			return 3.14*radius*radius;
		}
	}

	public static void main(String[] args) {
		Circle pizza=new Circle();

		pizza.radius=10;
		pizza.name="piiizak";	
		double area=pizza.getArea();	
		System.out.println(area+" "+pizza.name);
		
		Circle donut = new Circle();
		donut.radius=5;
		donut.name="dunkin";
		area=donut.getArea();
		System.out.println(area+" "+donut.name);
		
	}

}
