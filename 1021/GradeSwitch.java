import java.util.Scanner;

public class GradeSwitch {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char grade;	
		
		System.out.print("������ �Է� ���ּ��� : ");
		int score = sc.nextInt();
		
		switch (score / 10) { //switch������ case�� ���� ���� �� �Ա��� ������
		case 10 : 
		case 9 :
			grade = 'A';
			break; // break�� ������ ���� �������� �������� �����.
		case 8 :
			grade = 'B';
			break;
		case 7 :
			grade = 'C';
			break;
		case 6 :
			grade = 'D';
			break;
		default :
			grade = 'F';
		}
		System.out.println(grade+"�����Դϴ�.");
		sc.close();
	}

}
