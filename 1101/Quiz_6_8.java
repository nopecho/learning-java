class PlayingCard{
	int kind; // 인스턴스 변수
	int num; // 인스턴스 변수
	
	static int width; //클래스 변수
	static int height; //클래스 변수
	
	PlayingCard(int k,int n){ 
		kind=k; // kind=인스턴스 변수, k=지역변수 
		num=n; // num=인스턴스 변수, n=지역변수
	}
}
public class Quiz_6_8 {

	public static void main(String[] args) {
		PlayingCard card = new PlayingCard(1,1);  //
	}

}
