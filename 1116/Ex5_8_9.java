interface PhoneInterface{ //interface 선언 (interface의 접근지정자는 public, 모든 인터페이스의 메소드는 기본으로 public이다.)
	public static final int TIMEOUT=10000; //상수
	void sendCall(); //public abstract 생략돼있음
	void receiveCall();
	default void printLogo() { //인터페이스의 default 메소드는 인터페이스 내에서 직접 구현
		System.out.println("***Phone***");
	}
}
interface MobilePhoneInterface extends PhoneInterface{
	void sendSMS();
	void receiveSMS();
}
interface MP3Interface{
	void play();
	void stop();
}
class PDA{
	public int calculate(int x,int y) {
		return x+y;
	}
}

class SamsungPhone implements PhoneInterface{
	//interface의 추상메소드 구현
	@Override
	public void sendCall() { // << interface는 기본적으로 public 접근제어, 그러므로 public보다 낮은 접근제한으로 사용 불가.(interface는'클래스의 설계도' 이기 때문에 public으로만 접근)
		System.out.println("Samsung Call brrrr");
	}
	@Override
	public void receiveCall() {
		System.out.println("전화 왔어용");
	}
		
	//SamsungPhone클래스의 메소드 구현
	public void flash() {
		System.out.println("전화기에 불켜짐");
	}
}
class SmartPhone extends PDA implements MobilePhoneInterface,MP3Interface{
	//MobilePhoneInterface 추상메소드 구현
	@Override
	public void sendCall() {
		System.out.println("brrrrrr");
	}
	@Override
	public void receiveCall() {
		System.out.println("전화 옴");
	}
	@Override
	public void sendSMS() {
		System.out.println("문자 보내기");
	}
	@Override
	public void receiveSMS() {
		System.out.println("문자옴 ");
	}
	//MP3Interface 추상메소드 구현
	@Override
	public void play() {
		System.out.println("음악 재생");
	}
	@Override
	public void stop() {
		System.out.println("음악 멈춰");
	}
	//SmartPhone메소드 구현
	public void schedule() {
		System.out.println("일정 관리");
	}
}

public class Ex5_8_9 {
	public static void main(String[] args) {
		SamsungPhone s = new SamsungPhone();
		s.printLogo();
		s.sendCall();
		s.receiveCall();
		s.flash();
		SmartPhone ss = new SmartPhone();
		ss.printLogo();
		ss.sendCall();
		ss.play();
		ss.receiveSMS();
		ss.stop();
		System.out.println("3+5="+ss.calculate(3,5));
	}
}
