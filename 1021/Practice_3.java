import java.util.Scanner;

public class Practice_3 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int[] won= {50000,10000,5000,1000,500,100,50,10,1};
		
		System.out.print("�ݾ� �Է� : ");
		int num=sc.nextInt();	
		for( int i=0;i < won.length;i++ ) {
			System.out.println(won[i]+"�� �� "+ num/won[i]+"��");
			num%=won[i];
		}
		sc.close();
	}
}
