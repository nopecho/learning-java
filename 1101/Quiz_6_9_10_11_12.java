class Marine{
	int x=0, y=0;
	int hp=60;
	static int weapon = 6; //weapon 앞에 static을 붙혀서 static메소드(클래스 메소드)에서 호출 가능해야함
	static int armor=0; //이하 동문
	
	static void weaponUp() {
		weapon++; //모든 병사의 공격력은 static void 함수를 통해 인스턴스에서만 증가되는게 아니라 해당 클래스의 공격력을 올려줘야함
	}
	static void armorUp() {
		armor++; //이하 동문
	}
	void move(int x,int y) {
		this.x=x;
		this.y=y;
	}
}
public class Quiz_6_9_10_11_12 {

	public static void main(String[] args) {
		//6_10 : b,e (b : 객체를 초기화하기 위함)
		
		//6_11 : b,c (b : 클래스변수에서는 사용 하지못함 , d : 클래스 변수와 인스턴스변수)
		
		//6_12 : c,d (c : 리턴 타입이 같아야함, d : 매개변수 이름은 상관x)

	}

}
