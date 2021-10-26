import java.util.Random;
import java.util.Scanner;

public class OpenChallenge {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random r = new Random();
		int count=0;
		String text;
		
		while(true) {
		int rannum = r.nextInt(100);
		System.out.println("0-99 랜덤 숫자 생성완료\n맞춰봐라");			
			while(true) {
				System.out.print(count+"번 도전, 입력값 : ");
				int num =sc.nextInt();
				if(num>rannum) {
					System.out.println("더 작지롱~ㅋㅋ");
					count++;
					continue;
				}else if(num < rannum) {
					System.out.println("더 크지롱~ㅋㅋ");
					count++;
					continue;
				}else {
					System.out.println(count+"번 만에 "+"정답!");
					break;
				}
			}
			System.out.print("또 해볼래요ㅋ? Y or N : ");
			text=sc.next();
			if (text.equals("Y")) {
				count=0;
				continue;
			}else if (text.equals("N")) {
				break;
			}
		}
		sc.close();
	}
}