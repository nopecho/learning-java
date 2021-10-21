import java.util.Scanner;

public class Practice_3 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int[] won= {50000,10000,5000,1000,500,100,50,10,1};
		
		System.out.print("금액 입력 : ");
		int num=sc.nextInt();	
		for( int i=0;i < won.length;i++ ) {
			System.out.println(won[i]+"원 권 "+ num/won[i]+"개");
			num%=won[i];
		}
		sc.close();
	}
}
