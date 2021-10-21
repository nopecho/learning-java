import java.util.Scanner;

public class NestdIf {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("점수를 입력하세요 : ");
		int score = sc.nextInt();
		System.out.print("학년을 입력하세요 : ");
		int year = sc.nextInt();
		
		if (score >= 60 && year != 4){
			System.out.println("합격입니다.");
		}
		else if (score >=70 && year==4) {
			System.out.println("합격입니다.");
		}
		else {
			System.out.println("불합격 입니다.");
		}
		sc.close();
	}

}
