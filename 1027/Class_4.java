class Book{
	String title;
	String name;
	
	void show() {
		System.out.println(title+"�� �۰� :"+name);
	}
	public Book(){
		this("","");
		System.out.println("�����ڰ� ȣ�� �Ǿ����ϴ�.");
	}
	
	public Book(String title) {
		this(title,"���ڹ̻�");
	}
	public Book(String title,String name) {
		this.title=title;
		this.name=name;
	}
	
}
public class Class_4 {

	public static void main(String[] args) {
		Book A = new Book("������");
		Book B = new Book("ȫ�浿��","������");
		Book C = new Book();
		A.show();

	}

}
