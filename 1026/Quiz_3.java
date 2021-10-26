import java.util.Scanner;

public class Quiz_3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수를 입력 하세요 : ");
		int count=sc.nextInt();
		
		for(int i = 0;i<count;i++) {
			for(int j=count;j>i;j--) {
				System.out.print("*");
			}System.out.println();
		}
		sc.close();
	}
}
