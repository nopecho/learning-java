class Person{
	private int weight;
	int age;
	protected int height;
	public String name;
	
	public void setWeiht(int weight) {
		this.weight=weight;
	}
	public int getWeiht() {
		return weight;
	}
}
class Student extends Person{
	public void set() {
		age=30;
		name="ȫ�浿";
		height=180;
		setWeiht(120);
	}
}
public class Ex5_2 {
	public static void main(String[] args) {
		Student s = new Student();
		s.set();
	}
}
