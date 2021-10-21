import java.util.Scanner;

public class Practice_1 {
	
	public static void main(String[] args) {
		System.out.print("원화를 입력하세요. : ");
		Scanner sc = new Scanner(System.in);
		int w = sc.nextInt();
		double d = w/1100;
		System.out.println(w+"원은 "+d+"$입니다.");
		sc.close();
	}
}
