import java.util.Scanner;

public class WhileJava {

	public static void main(String[] args) {
		int count=0;
		int sum=0;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("���� �Է��� �������� -1�� �Է��ϼ���");
		
		int num=sc.nextInt();
		while(num!=-1) {
			sum+=num;
			count++;
			num=sc.nextInt();
		}
		if(count==0) {
			System.out.println("�Է� �� ������ �����ϴ�.");
		}else {
			System.out.println("���� ���� : "+count);
			System.out.println("��� : "+(double)sum/count);
		}
		sc.close();
	}

}
