
public class CicleAreaApp {
	
	final static double PI = 3.14;
	static double radius = 18.15;
	
	public static double circleArea() {
		double circleArea = radius*radius*PI;
		return circleArea;
	}

	public static void main(String[] args) {
		System.out.println("원의 면적 = "+ circleArea());
	}

}
