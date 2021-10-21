import java.util.Scanner;

public class Practice_12 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		System.out.print("첫번째 수 입력 : ");
		int num1 = sc.nextInt();
		System.out.print("연산자 입력 ( + - * / ) : ");
		String op = sc.next();
		System.out.print("두번째 수 입력 : ");
		int num2 = sc.nextInt();
		
		if (op.equals("+")) {
			System.out.println(num1+"+"+num2+" = "+(num1+num2));
		}else if (op.equals("-")) {
			System.out.println(num1+"-"+num2+" = "+(num1-num2));
		}else if (op.equals("*")) {
			System.out.println(num1+"*"+num2+" = "+(num1*num2));
		}else if (op.equals("/")) {
			if (num2==0) {
				System.out.println("0으로 나눌 수 없습니다.");
			}else {
			System.out.println(num1+"/"+num2+"= "+(num1/num2));
			}
		}else {
			System.out.println("연산자 제대로 입력하세용");
		}
		sc.close();
	}

}
