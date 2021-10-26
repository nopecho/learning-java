
public class CheckTime1 {

	public static void main(String[] args) {
//		//for
//		for(int i=5;i>0;i--) {
//			System.out.println("*".repeat(i));			
//		}
//		//while
//		int i =5;
//		while(i>0) {
//			System.out.println("*".repeat(i));
//			i--;
//		}
//		//do while
//		int i =5;
//		do {
//			System.out.println("*".repeat(i));
//			i--;
//		}while(i>0);
		
		//for
		for(int i=0;i<5;i++) {
			for(int j=5;j>i;j--) {
				System.out.print("*");
			}System.out.println();
		}
	}
}
