import java.util.Scanner;

public class Practice_12 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		System.out.print("ù��° �� �Է� : ");
		int num1 = sc.nextInt();
		System.out.print("������ �Է� ( + - * / ) : ");
		String op = sc.next();
		System.out.print("�ι�° �� �Է� : ");
		int num2 = sc.nextInt();
		
		if (op.equals("+")) {
			System.out.println(num1+"+"+num2+" = "+(num1+num2));
		}else if (op.equals("-")) {
			System.out.println(num1+"-"+num2+" = "+(num1-num2));
		}else if (op.equals("*")) {
			System.out.println(num1+"*"+num2+" = "+(num1*num2));
		}else if (op.equals("/")) {
			if (num2==0) {
				System.out.println("0���� ���� �� �����ϴ�.");
			}else {
			System.out.println(num1+"/"+num2+"= "+(num1/num2));
			}
		}else {
			System.out.println("������ ����� �Է��ϼ���");
		}
		sc.close();
	}

}
