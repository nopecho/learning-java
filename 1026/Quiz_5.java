import java.util.Scanner;

public class Quiz_5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] numlist = new int[10];
		System.out.print("���� ���� 10�� �Է¤��� >>");	
		
		for (int i=0;i<numlist.length;i++) {
			numlist[i] = sc.nextInt();
		}
		System.out.print("3�� ��� = ");
		for (int i=0;i<numlist.length;i++) {
			if(numlist[i]%3==0) {
				System.out.print(numlist[i]+" ");
			}
		}sc.close();
	}
}


