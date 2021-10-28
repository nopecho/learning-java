
public class Quiz_8 {

	public static void main(String[] args) {
		int[] a={1,4,4,3,1,4,4,2,1,3,2};
		int[] c=new int[4];
		
		for (int i=0;i<a.length;i++) {
			if(a[i]==1) {
				c[0]++;
			}else if(a[i]==2) {
				c[1]++;
			}else if(a[i]==3) {
				c[2]++;
			}else if(a[i]==4) {
				c[3]++;
			}	
		}
		
		for(int i=0;i<c.length;i++) {
			System.out.print(c[i]);
			for(int j=0;j<c[i];j++)
				System.out.print("*");
			
			System.out.println();
		}

	}

}
