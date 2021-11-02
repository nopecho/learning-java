
public class Overloading {
	public static double get(double i,double j) {
		return i+j;
	}
	public static float get(float i,float j) {
		return i+j;
	}
	public static void main(String[] args) {
		
		double k;
		k=get(1.5,1.5);
		System.out.println(k);
		float a;
		a=(float) get(1.8,1.5);
		System.out.println(a);
	}
}
