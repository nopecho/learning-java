import java.util.Scanner;

public class Practice_9 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���� �߽���(x,y)�� �Է��ϼ��� : ");
		int x = sc.nextInt();
		int y = sc.nextInt();
		System.out.print("���� �������� �Է��ϼ��� : ");
		double hl = sc.nextDouble();
		System.out.print("�� �� ���� �Է����ּ��� : ");
		double x1 = sc.nextDouble();
		double y1 = sc.nextDouble();
		
		double r = Math.sqrt((x-x1)*(x-x1)+(y-y1)*(y-y1));
		
		if (hl>=r) {
			System.out.println("�� ("+x+","+y+")�� �� �ȿ� �ִ�.");
		}else {
			System.out.println("�� ("+x+","+y+")�� �� �ۿ� �ִ�.");
		}
		sc.close();
	}

}
