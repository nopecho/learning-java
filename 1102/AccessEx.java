class Sample{
	public int a;
	private int b;
	int c;
	static int k=100;
	
	public void getb(int b) {
		this.b=b;
	}
	public void show() {
		System.out.println("a´Â"+this.a+" b´Â"+this.b+" c´Â"+this.c);
	}
}
public class AccessEx {

	public static void main(String[] args) {
		Sample a = new Sample();
		a.a=10;
		a.c=8;
		a.getb(15);	
		a.show();
	}

}
