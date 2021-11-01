import java.util.Scanner;

class Book{
	String title;
	String author;
	public Book(String title,String author) {
		this.title=title;
		this.author=author;
	}
}

public class Class_ObjectArr {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);

		while (true) {		
			Book[] book=new Book[2];
			for (int i=0;i<book.length;i++) {
				System.out.print("제목 입력 : ");
				String title=sc.nextLine();
				if (title.equals("그만")) {
					break;
				}
				System.out.print("저자 입력 : ");
				String author = sc.nextLine();
				book[i]=new Book(title,author);
				System.out.println(book[i].title+"의 저자는 "+book[i].author);
			}if (book[0]==null) {
				break;
			}
		}sc.close();
	}
}
