import java.util.Scanner;

public class Practice_5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	
		System.out.print("���� 3�� �Է� : ");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();	
		
		if (a+b>c || a+c>b || b+c>a) {
			System.out.println("�ﰢ�� �Ұ�");
		}else {
			System.out.println("�ﰢ�� ����");
		}
		sc.close();
	}

}
