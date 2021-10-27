import java.util.Scanner;

public class Quiz_14 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String[] course= {"Java","C++","HTML","Python","JSP"};
		int[] score= {95,88,76,62,55};
		
		while(true){
			System.out.print("과목 이름 : ");
			String name=sc.next();
			if(name.equals("멈춰")) {
				break;
			}else if( (!name.equals(course[0])) && (!name.equals(course[1])) && (!name.equals(course[2])) && (!name.equals(course[3])) && (!name.equals(course[4])) ) {
				System.out.println("그런 과목은 없다");
				continue;
			}
			for(int i=0;i<course.length;i++) {
				if(course[i].equals(name)) {
				System.out.println(course[i]+"는(은) "+score[i]+"점");
				}
			}
		}sc.close();
	}
}
