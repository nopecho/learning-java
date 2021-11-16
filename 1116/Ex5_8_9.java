interface PhoneInterface{ //interface ���� (interface�� ���������ڴ� public, ��� �������̽��� �޼ҵ�� �⺻���� public�̴�.)
	public static final int TIMEOUT=10000; //���
	void sendCall(); //public abstract ����������
	void receiveCall();
	default void printLogo() { //�������̽��� default �޼ҵ�� �������̽� ������ ���� ����
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
	//interface�� �߻�޼ҵ� ����
	@Override
	public void sendCall() { // << interface�� �⺻������ public ��������, �׷��Ƿ� public���� ���� ������������ ��� �Ұ�.(interface��'Ŭ������ ���赵' �̱� ������ public���θ� ����)
		System.out.println("Samsung Call brrrr");
	}
	@Override
	public void receiveCall() {
		System.out.println("��ȭ �Ծ��");
	}
		
	//SamsungPhoneŬ������ �޼ҵ� ����
	public void flash() {
		System.out.println("��ȭ�⿡ ������");
	}
}
class SmartPhone extends PDA implements MobilePhoneInterface,MP3Interface{
	//MobilePhoneInterface �߻�޼ҵ� ����
	@Override
	public void sendCall() {
		System.out.println("brrrrrr");
	}
	@Override
	public void receiveCall() {
		System.out.println("��ȭ ��");
	}
	@Override
	public void sendSMS() {
		System.out.println("���� ������");
	}
	@Override
	public void receiveSMS() {
		System.out.println("���ڿ� ");
	}
	//MP3Interface �߻�޼ҵ� ����
	@Override
	public void play() {
		System.out.println("���� ���");
	}
	@Override
	public void stop() {
		System.out.println("���� ����");
	}
	//SmartPhone�޼ҵ� ����
	public void schedule() {
		System.out.println("���� ����");
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
