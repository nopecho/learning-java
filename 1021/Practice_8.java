import java.util.Scanner;

public class Practice_8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("사각형의 좌표 (x1,y1),(x2,y2) 를 입력하세요 : ");
		int x1 = sc.nextInt();
		int y1 = sc.nextInt();
		int x2 = sc.nextInt();
		int y2 = sc.nextInt();
		
		if ( (x1>=100 & x1<=200) && (y1>=100 & y1<=200) ) {
			System.out.println("충돌");
		}else if( (x2>=100 & x2<=200) && (y2>=100 & y2<=200) ) {
			System.out.println("충돌");
		}else if ( (x1<=100 & x2<=200) && (y1<=100 & y2<=200)) {
			System.out.println("충돌");
		}
		else {
			System.out.println("괜춘");
		}
		sc.close();
	}
}