import java.util.Random;
import java.util.Scanner;

public class OpenChallenge {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random r = new Random();
		int count=0;
		String text;
		
		while(true) {
		int rannum = r.nextInt(100);
		System.out.println("0-99 ���� ���� �����Ϸ�\n�������");			
			while(true) {
				System.out.print(count+"�� ����, �Է°� : ");
				int num =sc.nextInt();
				if(num>rannum) {
					System.out.println("�� ������~����");
					count++;
					continue;
				}else if(num < rannum) {
					System.out.println("�� ũ����~����");
					count++;
					continue;
				}else {
					System.out.println(count+"�� ���� "+"����!");
					break;
				}
			}
			System.out.print("�� �غ����䤻? Y or N : ");
			text=sc.next();
			if (text.equals("Y")) {
				count=0;
				continue;
			}else if (text.equals("N")) {
				break;
			}
		}
		sc.close();
	}
}