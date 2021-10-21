import java.util.Scanner;

public class Practice_10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("첫번째 원의 중심,반지름 입력 : ");
		int x1 = sc.nextInt();
		int y1 = sc.nextInt();
		double r1 = sc.nextDouble();
		
		System.out.print("두번째 원의 중심,반지름 입력 : ");
		int x2 = sc.nextInt();
		int y2 = sc.nextInt();
		double r2 = sc.nextDouble();
		
		double r =Math.sqrt((x1-x2)*(x1-x2)+(y1-y2)*(y1-y2));
		
		if (r>=r1+r2) {
			System.out.println("두 원은 겹치지 않는다!");
		}else {
			System.out.println("두 원은 겹친다!");
		}
		sc.close();
	}

}
