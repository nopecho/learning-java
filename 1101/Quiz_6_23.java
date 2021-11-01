
public class Quiz_6_23 {
	static int max(int[] arr) {
		int x=-999999;
		int max=0;	
		if(arr==null||arr.length==0){ //null check;
			return x;
		}
		for (int i =0; i<arr.length;i++) {
			if(arr[i]>max) {
				max=arr[i];
			}
		}return max;
	}

	public static void main(String[] args) {
		int[] data = {3,2,9,4,7};
		System.out.println(java.util.Arrays.toString(data));
		System.out.println("최대값 : "+max(data));
		System.out.println("최대값 : "+max(null));
		System.out.println("최대값 : "+max(new int[] {}));

	}
}
