import java.util.Scanner;

public class NestdIf {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("������ �Է��ϼ��� : ");
		int score = sc.nextInt();
		System.out.print("�г��� �Է��ϼ��� : ");
		int year = sc.nextInt();
		
		if (score >= 60 && year != 4){
			System.out.println("�հ��Դϴ�.");
		}
		else if (score >=70 && year==4) {
			System.out.println("�հ��Դϴ�.");
		}
		else {
			System.out.println("���հ� �Դϴ�.");
		}
		sc.close();
	}

}
