import java.util.Scanner;

public class Practice_7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("��ǥ �Է� : ");
		int x = sc.nextInt();
		int y = sc.nextInt();
		
		if(200>=x && 200>=y) {
			if(100<=x && 100<=y) {
				System.out.println("("+x+","+y+") �� �簢�� �ȿ� �ֽ��ϴ�.");	
			}	
		}else {
			System.out.println("("+x+","+y+") �� �簢�� �ȿ� �����ϴ�.");
		}
		sc.close();
	}

}
