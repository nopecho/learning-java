import java.util.Scanner;

class Add{
	private int a,b;
	public void setValue(int a,int b) {this.a=a; this.b=b;}	
	public int cal() {
		return this.a+this.b;
	}
}
class Sub{
	private int a,b;
	public void setValue(int a,int b) {this.a=a; this.b=b;}
	public int cal() {
		return this.a-this.b;
	}
}
class Mul{
	private int a,b;
	public void setValue(int a,int b) {this.a=a; this.b=b;}
	public int cal() {
		return this.a*this.b;
	}
}
class Div{
	private int a,b;
	public void setValue(int a,int b) {this.a=a; this.b=b;}
	public double cal() {
		return this.a/this.b;
	}
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
