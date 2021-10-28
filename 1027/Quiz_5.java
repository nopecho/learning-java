
public class Quiz_5 {

	public static void main(String[] args) {
		int[] arr1= {1,2,3,4,5,6,7,8,9};
		int[] arr2= new int[3];
		
		for (int i=0;i<arr1.length;i++) {
			int j =(int)(Math.random()*arr1.length);
			int temp=0;
			
			arr1[temp]=arr1[j];
			arr1[j]=arr1[i];
			arr1[i]=arr1[temp];			
		}
		
		for(int i =0;i<arr2.length;i++) {
			arr2[i]=arr1[i];
		}				
		for (int i =0;i<arr2.length;i++) {
			System.out.print(arr2[i]);
		}
	}
}
