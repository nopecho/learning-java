class Samp{
	int id;
	public Samp(int x) {
		this.id=x;
	}
	public Samp() {
		System.out.println("������ ȣ��");
	}
}
public class Check_1 {

	public static void main(String[] args) {
		Samp A = new Samp();
		Samp B = new Samp(10);
		System.out.println(B.id);
	}

}
