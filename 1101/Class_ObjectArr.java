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
				System.out.print("���� �Է� : ");
				String title=sc.nextLine();
				if (title.equals("�׸�")) {
					break;
				}
				System.out.print("���� �Է� : ");
				String author = sc.nextLine();
				book[i]=new Book(title,author);
				System.out.println(book[i].title+"�� ���ڴ� "+book[i].author);
			}if (book[0]==null) {
				break;
			}
		}sc.close();
	}
}
