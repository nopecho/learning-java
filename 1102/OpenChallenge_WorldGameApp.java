import java.util.Scanner;

class Player{
	Scanner sc =  new Scanner(System.in);
	String name;
	String word;	
	Player(String name){
		this.name=name;
	}
	
	void getUserWord() {	
		 System.out.print(this.name+">>");
		 String word = sc.next();
		 this.word=word;
	}
	
	boolean checkSuccess(String word) {
		int lastIndex = word.length()-1;
		char lastChar = word.charAt(lastIndex);	
		char firstChar = this.word.charAt(0);
		if(lastChar==firstChar) {
			return true;
		}else {			
			return false;
		}
	}
}

public class OpenChallenge_WorldGameApp {
	static Scanner sc =  new Scanner(System.in);
	

	OpenChallenge_WorldGameApp(){
		System.out.print("-----�����ձ� ����-----\n���� ���� �ο� �Է� >> ");	}
		
	void run(int count) {		
		Player[] player = new Player[count];		
		for(int i=0;i<count;i++) {
			System.out.print("������ �̸� �Է� >>");
			String name=sc.next();
			player[i]=new Player(name);
		}
		
		System.out.println("���� �ܾ�� �ƹ��� �Դϴ�.");
		
		String WORD= "�ƹ���";
		int i=0;
		while(true) {	
			player[i].getUserWord(); //player ��ü�� word �� �ʱ�ȭ
			if(player[i].checkSuccess(WORD)) {
				WORD=player[i].word;
				if(i==count-1) {
					i=0;
				}				
					i++;													
			}else {
				System.out.println(player[i].name+"�� Ʋ����");
				break;
			}		
		}	
	}
	
	public static void main(String[] args) {	
		OpenChallenge_WorldGameApp game = new OpenChallenge_WorldGameApp();
		int count = sc.nextInt();
		game.run(count);				
	}
}
