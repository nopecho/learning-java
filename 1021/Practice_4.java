import java.util.Scanner;

public class Practice_4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);	
		System.out.print("정수 3개를 입력해주세요 : ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int mid = 0;
		
		if (a>b) {
			if (a>c) {
				if(c>b) {
					mid=c;
				}else if(b>c) {
					mid=b;
				}
			}else if(a<c) {
				mid=a;
			}
		}else if(a<b) {
			if(a<c) {
				if(b<c) {
					mid=b;
				}else if (b>c) {
					mid=c;
				}
			}else if(a>c) {
				mid=a;
			}
		}
		sc.close();
		System.out.println("중간 값은 >> "+mid);
	}
}
