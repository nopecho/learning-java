class Calc{
	/* static 멤버 클래스 활용
	public static int abs(int a) {
		return a>0?a:-a;
	}
	public static int max(int a,int b) {
		return a>b?a:b;
	}
	public static int min(int a,int b) {
		return a>b?b:a;
	}
	*/
	int a;
	int b;
	public Calc(int a,int b) {
		this.a=a;
		this.b=b;
	}
	public Calc(int a) {
		this.a=a;
	}
	int abs() {
		if(this.a>0) {
			return this.a;
		}else {
			return this.a=-a;
		}
	}
	int max() {
		if(this.a>this.b) {
			return this.a;
		}else {
			return this.b;
		}
	}
	int min() {
		if(this.a>this.b) {
			return this.b;
		}else {
			return this.a;
		}
	}
}

public class Static {
	public static void main(String[] args) {
		Calc num = new Calc(5,8);
		System.out.println(num.max());
		
		Calc num2=new Calc(-8);
		System.out.println(num2.abs());
	}
}
