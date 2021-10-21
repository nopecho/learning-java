import java.util.Scanner;

public class GradeSwitch {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char grade;	
		
		System.out.print("점수를 입력 해주세요 : ");
		int score = sc.nextInt();
		
		switch (score / 10) { //switch문에서 case는 식의 값이 들어갈 입구만 정해줌
		case 10 : 
		case 9 :
			grade = 'A';
			break; // break가 없으면 밑의 문장으로 내려가서 실행됨.
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
		System.out.println(grade+"학점입니다.");
		sc.close();
	}

}
