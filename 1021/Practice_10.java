import java.util.Scanner;

public class Practice_10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("ù��° ���� �߽�,������ �Է� : ");
		int x1 = sc.nextInt();
		int y1 = sc.nextInt();
		double r1 = sc.nextDouble();
		
		System.out.print("�ι�° ���� �߽�,������ �Է� : ");
		int x2 = sc.nextInt();
		int y2 = sc.nextInt();
		double r2 = sc.nextDouble();
		
		double r =Math.sqrt((x1-x2)*(x1-x2)+(y1-y2)*(y1-y2));
		
		if (r>=r1+r2) {
			System.out.println("�� ���� ��ġ�� �ʴ´�!");
		}else {
			System.out.println("�� ���� ��ģ��!");
		}
		sc.close();
	}

}
