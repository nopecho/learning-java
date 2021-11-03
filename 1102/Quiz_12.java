import java.util.Scanner;

class Seat{
	private String seatClass; //좌석 구분
	private String[] seatNo=new String[10]; //좌석 번호
	Seat(int no){
		if(no==0) {
			this.seatClass="S";
		}else if(no==1) {
			this.seatClass="A";
		}else if(no==2) {
			this.seatClass="B";
		}
		for (int i=0;i<seatNo.length;i++) {
			seatNo[i]=" --- ";
		}
	}
			
	public void seatShow() { //좌석 보여주기
		System.out.print(this.seatClass+">>");
		for (int i=0;i<seatNo.length;i++) {
			System.out.print(seatNo[i]);
		}System.out.println();
	}
	
	public void setSeatNo(int num,String name) {
		if(this.seatNo[num-1].equals(" --- ")) {
			this.seatNo[num-1]=" "+name+" ";	
		}else{
			System.out.println("해당 좌석은 이미 예약이 된 좌석입니다.");	
		}
	}
	
	public void delSeatNo(String name) {
		int count=0;
		for(int i=0;i<seatNo.length;i++) {
			if(name.equals(seatNo[i])){
				this.seatNo[i]=" --- ";
			}else {
				count++;
			}
		}if(count==seatNo.length) {
			System.out.println("해당 좌석은 이미 빈 좌석입니다.");
		}
	}
}


class Reservation{
	Scanner sc = new Scanner(System.in);
	boolean f = true;	
	Seat[] seat = new Seat[3]; //seat[0]=S, seat[1]=A, seat[2]=B 좌석구분
	
	public Reservation(){
		for (int i=0;i<seat.length;i++) {
			seat[i]=new Seat(i);
		}
	}
	
	public void input() {
		System.out.println("<예약 메뉴>");
		System.out.print("[좌석] S:1, A:2, B:3 >>");
		int chk=sc.nextInt();
		seat[chk-1].seatShow();
		System.out.print("이름 >>");
		String name=sc.next();
		System.out.print("좌석 번호 >>");
		int seatNo = sc.nextInt();
		seat[chk-1].setSeatNo(seatNo,name);
	}
	
	public void view() {
		System.out.println("<조회 메뉴>");
		for (int i=0;i<seat.length;i++) {
			seat[i].seatShow();
		}
		System.out.println("<<<조회를 완료 했습니다.>>>");
	}
	
	public void reset() {
		System.out.println("<취소 메뉴>");
		System.out.print("[좌석] S:1, A:2, B:3 >>");
		int chk=sc.nextInt();
		seat[chk-1].seatShow();
		System.out.print("이름 >>");
		String name=sc.next();
		seat[chk-1].delSeatNo(name);
	}
	
	public boolean finish() {
		System.out.println("<-<-< 예약 시스템을 종료합니다. >->->");
		return f=false;
	}
	
	public boolean noCheck(int seatNo) {
		if(seatNo>10) {
			System.out.println("좌석 번호는 1~10번 까지 입니다. 다시 입력하세요");
			return true;
		}else {
			return f=false;
		}
	}
	
	public void run() {
		
		while(f) {
			System.out.print("예약:1, 조회:2, 취소:3, 끝내기:4 >> ");
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
				System.out.println("1~4를 입력하세요.");
			}
		}
	}	
}
public class Quiz_12 {

	public static void main(String[] args) {
		System.out.println("<-<-<명품콘서트홀 예약 시스템 입니다.>->->");
		Reservation x = new Reservation();
		x.run();
	}
}
