import java.util.Scanner;

abstract class Calc{
	protected int a,b;
	abstract void setValue(int a, int b);
	abstract int cal();
}
class Add extends Calc{	
	@Override
	int cal() {return a+b;}	
	@Override
	void setValue(int a,int b) {
		this.a=a;
		this.b=b;	
	}
}
class Sub extends Calc{
	@Override
	void setValue(int a,int b) {
		this.a=a;
		this.b=b;	
	}
	@Override
	int cal() {return a-b;}	
}
class Mul extends Calc{
	@Override
	void setValue(int a,int b) {
		this.a=a;
		this.b=b;	
	}
	@Override
	int cal() {return a*b;}
		
	
}
class Div extends Calc{
	@Override
	void setValue(int a,int b) {
		this.a=a;
		this.b=b;	
	}
	@Override
	int cal() {return a/b;}
}
public class Quiz_11 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("두 정수와 연산자를 입력하세요 >>");
		int a = sc.nextInt();
		int b = sc.nextInt();
		String op = sc.next();
		switch (op) {
		case "+":
			Add add = new Add();
			add.setValue(a,b);
			System.out.println(add.cal()); break;
		case "-":
			Sub sub = new Sub();
			sub.setValue(a,b);
			System.out.println(sub.cal()); break;
		case "*":
			Mul mul = new Mul(); 
			mul.setValue(a,b);
			System.out.println(mul.cal()); break;
		case "/":
			Div div = new Div(); 
			div.setValue(a,b);
			System.out.println(div.cal()); break;
		}sc.close();
	}
}
