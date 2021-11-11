import java.util.Scanner;

abstract class Converter{
	abstract protected double convert(double src);
	abstract protected String getSrcString();
	abstract protected String getDestString();
	protected double ratio; //����
	
	public void run() {
		Scanner sc = new Scanner(System.in);
		System.out.println(getSrcString()+"�� "+getDestString()+"�� �ٲߴϴ�.");
		System.out.print(getSrcString()+"�� �Է��ϼ��� : ");
		double val=sc.nextDouble();
		double res=convert(val);
		System.out.println("��ȯ ��� : "+res+getDestString()+"�Դϴ�.");
		sc.close();
	}
}

class Won2Dollar extends Converter{
	private double dollar=1.0;
	Won2Dollar(int won){
		this.ratio=won*dollar;
	}
	@Override
	protected double convert(double src) {
		return src/ratio;
	}
	@Override
	protected String getSrcString() { return "��"; }	
	@Override
	protected String getDestString() { return " �޷�"; }
			
}

class Km2Mile extends Converter{
	private double Mile=1.0;
	Km2Mile(double Km){
		this.ratio=Km*Mile;
	}
	@Override
	protected double convert(double src) {
		return src/ratio;
	}
	@Override
	protected String getSrcString() { return "Km"; }	
	@Override
	protected String getDestString() { return " Mile"; }
			
}

public class Quiz_3_4 {
	public static void main(String[] args) {
//		Won2Dollar toDollar = new Won2Dollar(1200);
//		toDollar.run();
		
		Km2Mile toMile = new Km2Mile(1.6);
		toMile.run();
		
	}
}
