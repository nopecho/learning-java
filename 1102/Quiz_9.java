class ArrayUtill{
	public static int[] concat(int[] a, int[] b) {
		int[] x= new int[a.length + b.length];
		for(int i=0;i<a.length;i++) {
			x[i]=a[i];
		}
		for(int i=0;i<b.length;i++) {
			x[i+a.length]=b[i];
		}
		return x;
	}
	public static void print(int[] a) {
		System.out.print("[ ");
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
		System.out.print("]");
	}
}
public class Quiz_9 {

	public static void main(String[] args) {
		int[] arr1= {1,5,7,9};
		int[] arr2= {3,6,-1,100,77};
		int[] arr3=ArrayUtill.concat(arr1, arr2);
		ArrayUtill.print(arr3);

	}

}
