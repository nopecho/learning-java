import java.util.Scanner;

public class Practice_2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("2자리수 정수 입력(10~99) : ");
		int num = sc.nextInt();
		
		
		if (num/10 == num%10) {
			System.out.println("yes, 10의 자리와 1의 자리가 같음");
		}else {
			System.out.println("no, 10의 자리와 1의 자리가 다름");
		}
		sc.close();
	}

}
