import java.util.Scanner;

class Circle{
	private double x,y;
	private int radius;
	
	public Circle(double x,double y,int radius) {
		this.x=x;
		this.y=y;
		this.radius=radius;
	}
	int getRadius() {
		return this.radius;	
	}
	public void show() {
		System.out.println("가장 면적이 큰 원은 ("+x+","+y+") "+radius);
	}
}
public class Quiz_5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Circle[] c = new Circle[3];
		for(int i=0;i<c.length;i++) {
			System.out.print("x, y, readius >>");
			double x = sc.nextDouble();
			double y = sc.nextDouble();
			int radius= sc.nextInt();
			c[i]=new Circle(x,y,radius);
		}
		for (int i=0;i<c.length;i++) {
			if( c[i].getRadius()  ) {
				continue;
			}else {
				c[i].show();
			}
		}sc.close();
	}

}
