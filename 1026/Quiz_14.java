import java.util.Scanner;

public class Quiz_14 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String[] course= {"Java","C++","HTML","Python","JSP"};
		int[] score= {95,88,76,62,55};
		
		while(true){
			System.out.print("���� �̸� : ");
			String name=sc.next();
			if(name.equals("����")) {
				break;
			}else if( (!name.equals(course[0])) && (!name.equals(course[1])) && (!name.equals(course[2])) && (!name.equals(course[3])) && (!name.equals(course[4])) ) {
				System.out.println("�׷� ������ ����");
				continue;
			}
			for(int i=0;i<course.length;i++) {
				if(course[i].equals(name)) {
				System.out.println(course[i]+"��(��) "+score[i]+"��");
				}
			}
		}sc.close();
	}
}
