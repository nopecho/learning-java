import java.util.Scanner;

public class Practice_5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	
		System.out.print("정수 3개 입력 : ");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();	
		
		if (a+b>c || a+c>b || b+c>a) {
			System.out.println("삼각형 불가");
		}else {
			System.out.println("삼각형 가능");
		}
		sc.close();
	}

}
