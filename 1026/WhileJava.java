import java.util.Scanner;

public class WhileJava {

	public static void main(String[] args) {
		int count=0;
		int sum=0;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("정수 입력후 마지막에 -1을 입력하세요");
		
		int num=sc.nextInt();
		while(num!=-1) {
			sum+=num;
			count++;
			num=sc.nextInt();
		}
		if(count==0) {
			System.out.println("입력 된 정수가 없습니다.");
		}else {
			System.out.println("정수 갯수 : "+count);
			System.out.println("평균 : "+(double)sum/count);
		}
		sc.close();
	}

}
