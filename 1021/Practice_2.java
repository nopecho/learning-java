import java.util.Scanner;

public class Practice_2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("2�ڸ��� ���� �Է�(10~99) : ");
		int num = sc.nextInt();
		
		
		if (num/10 == num%10) {
			System.out.println("yes, 10�� �ڸ��� 1�� �ڸ��� ����");
		}else {
			System.out.println("no, 10�� �ڸ��� 1�� �ڸ��� �ٸ�");
		}
		sc.close();
	}

}
