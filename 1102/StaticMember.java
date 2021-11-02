import java.util.Scanner;

class Cover{
	private static double rate;
	public static double toDollar(double won) {
		return won/rate;
	}
	public static double toKWR(double dollar) {
		return dollar*rate;
	}
	public static void setRate(double r) {
		rate=r;
	}
}

public class StaticMember {

	public static void main(String[] args) {
		Scanner sc =  new Scanner(System.in);
		System.out.print("ȯ���� ������ �ּ���(1$) >>");
		double rate = sc.nextDouble();
		Cover.setRate(rate);
		System.out.print("Ȯ�� �� ��ȭ(KWR)�� �������ּ��� >>");
		double won = sc.nextDouble();
		System.out.println(won+"�� �� "+"$"+Cover.toDollar(won)+" �Դϴ�!");
		System.out.print("Ȯ�� �� �޷�(USD)�� �������ּ��� >>");
		double dollar=sc.nextDouble();
		System.out.println(dollar+"$ ��"+Cover.toKWR(dollar)+"�� �Դϴ�!");
		sc.close();
	}
}
