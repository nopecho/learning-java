import java.util.Scanner;

public class BreakWhile {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
				
		while(true) {
			System.out.println("계속 입력하려면 Y, 그만 하려면 N 를 입력하세요 : ");
			String text = sc.next();
			if(text.equals("Y")) {
				continue;
			}else if(text.equals("N")) {
				break;
			}else {
				System.out.println("Y 또는 N을 입력해주세요.");
				continue;
			}
		}sc.close();
	}

}
