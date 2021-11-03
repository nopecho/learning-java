import java.util.Scanner;

class Customer{
	private String name;
	
	public void setName(String name) {this.name=name;}
			
	public void inputName() {}
		
	
}
class Seat{
	private String seatClass;
	private static int seatNo=10;
	Seat(int no){
		if(no==0) {
			this.seatClass="S";
		}else if(no==1) {
			this.seatClass="A";
		}else if(no==2) {
			this.seatClass="B";
		}
	}
	public void setNo() {
		
	}
	public void getNo() {
		System.out.print(this.seatClass+">>");
		for (int i=0;i<seatNo;i++) {
			System.out.print("--- ");
		}System.out.println();
	}
	public static void seatShow() {
		System.out.print("�¼����� : S(1), A(2), B(3) >>");
	}
}
class Reservation{
	Scanner sc = new Scanner(System.in);
	boolean f = true;
	Seat[] seat = new Seat[3]; //seat[0]=S, seat[1]=A, seat[2]=B �¼�����
	
	public Reservation(){
		for (int i=0;i<seat.length;i++) {
			seat[i]=new Seat(i);
		}
	}
	
	public void input() {
		System.out.println("-----------���� �޴�-----------");
		Seat.seatShow();
		int chk=sc.nextInt();
		seat[chk-1].getNo();
	}
	
	public void view() {
		System.out.println("-----------��ȸ �޴�-----------");
		Seat.seatShow();
		String chk=sc.next();
	}
	
	public void reset() {
		System.out.println("-----------��� �޴�-----------");
	}
	
	public boolean finish() {
		System.out.println("<-<-< ���� �ý����� �����մϴ�. >->->");
		return f=false;
	}
	
	public void run() {
		
		while(f) {
			System.out.print("����:1, ��ȸ:2, ���:3, ������:4 >> ");
			int num=sc.nextInt();
			switch(num){
			case 1:
				input(); break;
			case 2:
				view(); break;
			case 3:
				reset(); break;
			case 4:
				finish(); break;
			default:
				System.out.println("1~4�� �Է��ϼ���.");
			}
		}
	}	
}
public class Quiz_12 {

	public static void main(String[] args) {
		System.out.println("<-<-<��ǰ�ܼ�ƮȦ ���� �ý��� �Դϴ�.>->->");
		Reservation x = new Reservation();
		x.run();
	}

}
