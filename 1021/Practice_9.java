import java.util.Scanner;

public class Practice_9 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("원의 중심점(x,y)를 입력하세요 : ");
		int x = sc.nextInt();
		int y = sc.nextInt();
		System.out.print("원의 반지름을 입력하세요 : ");
		double hl = sc.nextDouble();
		System.out.print("비교 할 점을 입력해주세요 : ");
		double x1 = sc.nextDouble();
		double y1 = sc.nextDouble();
		
		double r = Math.sqrt((x-x1)*(x-x1)+(y-y1)*(y-y1));
		
		if (hl>=r) {
			System.out.println("점 ("+x+","+y+")는 원 안에 있다.");
		}else {
			System.out.println("점 ("+x+","+y+")는 원 밖에 있다.");
		}
		sc.close();
	}

}
