import java.util.Scanner;

public class Practice_7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("좌표 입력 : ");
		int x = sc.nextInt();
		int y = sc.nextInt();
		
		if(200>=x && 200>=y) {
			if(100<=x && 100<=y) {
				System.out.println("("+x+","+y+") 는 사각형 안에 있습니다.");	
			}	
		}else {
			System.out.println("("+x+","+y+") 는 사각형 안에 없습니다.");
		}
		sc.close();
	}

}
