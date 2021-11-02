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
		System.out.print("-----끝말잇기 시작-----\n게임 참가 인원 입력 >> ");	}
		
	void run(int count) {		
		Player[] player = new Player[count];		
		for(int i=0;i<count;i++) {
			System.out.print("참가자 이름 입력 >>");
			String name=sc.next();
			player[i]=new Player(name);
		}
		
		System.out.println("시작 단어는 아버지 입니다.");
		
		String WORD= "아버지";
		int i=0;
		while(true) {	
			player[i].getUserWord(); //player 객체의 word 값 초기화
			if(player[i].checkSuccess(WORD)) {
				WORD=player[i].word;
				if(i==count-1) {
					i=0;
				}				
					i++;													
			}else {
				System.out.println(player[i].name+"이 틀렸음");
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
