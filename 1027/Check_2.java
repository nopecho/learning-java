class ConstructorExample{
	int x;
	
	public void setX(int x) {
		this.x=x;
	}
	public int getX() {
		return x;
	}
	public ConstructorExample(int x) {
		this.x=x;
	}
}
public class Check_2 {

	public static void main(String[] args) {
		ConstructorExample a = new ConstructorExample(5);
		int n = a.getX();
		System.out.println(n);
	}

}
