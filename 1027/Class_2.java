import java.util.Scanner;

class Rectangle {
	int w;
	int h;
	public int getArea() {
		return w*h;
	}
}
public class Class_2 {

	public static void main(String[] args) {
		Rectangle rect = new Rectangle();
		Scanner sc=new Scanner(System.in);
		System.out.print(">>");
		rect.w=sc.nextInt();
		rect.h=sc.nextInt();
		
		System.out.println("¸éÀû = "+rect.getArea());
		sc.close();
	}

}
