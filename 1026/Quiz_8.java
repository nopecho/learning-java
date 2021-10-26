import java.util.Scanner;

public class Quiz_8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 입력해라 : ");
		int count=sc.nextInt();
		int[] numlist = new int[count];

		for (int i=0;i<count;i++) {
			numlist[i]=(int)(Math.random()*100+1);
				for (int j=0;j<i;j++) {
					if(numlist[i]==numlist[j]) {
						numlist[i]=(int)(Math.random()*100+1);
						j--;
					}
				}
		}for (int i=0;i<count;i++) {
			System.out.print(numlist[i]+" ");
		}sc.close();
	}
}
