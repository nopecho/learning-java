import java.util.Scanner;

public class Quiz_12 {

	public static void main(String[] args) {
		String[] words= {"television","computer","mouse","phone"};
		Scanner sc = new Scanner(System.in);
		
		for (int i=0;i<words.length;i++) {
			char[] q = words[i].toCharArray();
			
				for(int j=0;j<q.length;j++) {	
				char temp2;
				int random = (int)(Math.random()*q.length);
				temp2=q[i];
				q[i]=q[random];
				q[random]=temp2;
			}
				
			System.out.printf("Q%d. %s의 정답을 입력하세요.>>",i+1,new String (q));
			String a=sc.nextLine();
			
			if(words[i].equals(a.trim())) {
				System.out.printf("맞았습니당.%n%n");
			}else {
				System.out.printf("틀렸습니당.%n%n");
			}
			
		}sc.close();
	}
}
