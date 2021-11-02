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
		System.out.print("환율을 설정해 주세요(1$) >>");
		double rate = sc.nextDouble();
		Cover.setRate(rate);
		System.out.print("확인 할 원화(KWR)를 설정해주세요 >>");
		double won = sc.nextDouble();
		System.out.println(won+"원 은 "+"$"+Cover.toDollar(won)+" 입니다!");
		System.out.print("확인 할 달러(USD)를 설정해주세요 >>");
		double dollar=sc.nextDouble();
		System.out.println(dollar+"$ 는"+Cover.toKWR(dollar)+"원 입니다!");
		sc.close();
	}
}
