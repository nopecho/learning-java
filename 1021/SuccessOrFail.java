import java.util.Scanner;

public class SuccessOrFail {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char grade;
		
		System.out.print("������ �Է��ϼ��� : ");
		int score = sc.nextInt();
		if (score >= 90) {
			grade ='A';
		}
		else if(score >= 80) {
			grade ='B';
		}
		else if(score >= 70) {
			grade ='C';
		}
		else if(score >= 60) {
			grade ='D';
		}
		else {
			grade ='F';
		}
		sc.close();	
		System.out.println(grade+" �����Դϴ�.");
	}
}
