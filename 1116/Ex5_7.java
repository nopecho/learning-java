abstract class Calculator{
	public abstract int add(int a,int b);
	public abstract int sub(int a,int b);
	public abstract double average(int[] a);
}
class GoodCal extends Calculator{
	@Override
	public int add(int a,int b) {
		return a+b;
	}
	@Override
	public int sub(int a,int b) {
		return a-b;
	}
	@Override
	public double average(int[] a) {
		double sum=0;
		for(int i=0;i<a.length;i++) {
			sum+= a[i];
		}return sum/a.length;
	}
}
public class Ex5_7 {
	public static void main(String[] args) {
		Calculator a= new GoodCal();
		int[] ab = {1,5,3,5,7,9};
		System.out.println(a.add(5, 9));
		System.out.println(a.sub(10, 5));
		System.out.println(a.average(ab));
		
	}
}
