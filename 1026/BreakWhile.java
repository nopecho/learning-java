import java.util.Scanner;

public class BreakWhile {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
				
		while(true) {
			System.out.println("��� �Է��Ϸ��� Y, �׸� �Ϸ��� N �� �Է��ϼ��� : ");
			String text = sc.next();
			if(text.equals("Y")) {
				continue;
			}else if(text.equals("N")) {
				break;
			}else {
				System.out.println("Y �Ǵ� N�� �Է����ּ���.");
				continue;
			}
		}sc.close();
	}

}
