class TV{
	String name;
	int year;
	int inch;
	
	TV(String name,int year, int inch){
		this.name=name;
		this.year=year;
		this.inch=inch;		
	}
	void show() {
		System.out.println(this.name+"���� ���� "+this.year+"�� "+this.inch+"��ġ");
	}
}
public class Quiz_1 {

	public static void main(String[] args) {
		
		TV myTV = new TV("LG",2017,32);
		myTV.show();
	}

}
