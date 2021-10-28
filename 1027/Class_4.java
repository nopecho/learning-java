class Book{
	String title;
	String name;
	
	void show() {
		System.out.println(title+"의 작가 :"+name);
	}
	public Book(){
		this("","");
		System.out.println("생성자가 호출 되었습니다.");
	}
	
	public Book(String title) {
		this(title,"작자미상");
	}
	public Book(String title,String name) {
		this.title=title;
		this.name=name;
	}
	
}
public class Class_4 {

	public static void main(String[] args) {
		Book A = new Book("춘향전");
		Book B = new Book("홍길동전","조현준");
		Book C = new Book();
		A.show();

	}

}
