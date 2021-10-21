import java.util.Scanner;

public class Practice_6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("1~99 Á¤¼ö ÀÔ·Â : ");
		int num = sc.nextInt();
		int a = num/10;
		int b = num%10;
		
		if((a == 3 ||a == 6||a == 9)&&(b==3||b==6||b==9)) {
			System.out.println("Â¦!Â¦!");
		}else if(a == 3 ||a == 6||a == 9) {
			System.out.println("Â¦!");
		}else if(b==3||b==6||b==9) {
			System.out.println("Â¦!");
		}else {
			System.out.println("¹Ú¼öx");
		}
		sc.close();
	}
}
