package domain;
import java.util.Scanner;
import model.*;

class GraphicEditor {
	private Scanner sc = new Scanner(System.in);
	private String name;
	private Shape start=null,last=null;
	private int count=0;
	
	GraphicEditor(String name){ this.name=name; }
	
	private boolean push(int num,int index) { //삽입메소드
		Shape temp = null;
		Shape c = start;
		switch(num) {
		case 1: temp = new Line(); break;
		case 2: temp = new Rect(); break;
		case 3: temp = new Circle(); break;
		}
		if(index>count) {
			return false;
		}
		for(int i=0;i<index-1;i++) { //삽입할 위치까지 찾아감
			c=c.getNext();
		}
		if(start==null) { //최초 삽입
			start=last=temp;
		}
		else if(index==0) { //시작값이 있고 start에 삽입
			temp.setNext(start);
			start.setPrev(temp);
			start=temp;
		}
		else if(c==null) { //시작값이 있고 last에 삽입
			temp.setPrev(last);
			last.setNext(temp);
			last=temp;
		}
		else if(c!=null) { //시작값이 있고 중간에 삽입
			temp.setPrev(c.getPrev());
			temp.setNext(c.getNext());
			c.setPrev(temp);
			c.setNext(temp);		
		}
		count++;
		return true;
	}
		
	private boolean delete(int index) { //삭제메소드
		Shape p = start;
		for(int i=0;i<index;i++) {
			p=p.getNext();
		}
		return true;
	}
		
	void run() {
		System.out.println("그래픽 에디터 "+name+" 를 실행합니다.");
		int choice=0; //메뉴 선택용
		int num,index; //도형 삽입, 인덱스 용
		while(choice!=4) {
			System.out.print("삽입(1), 삭제(2), 모두보기(3), 종료(4) : ");
			choice = sc.nextInt();
			switch(choice) {
			case 1://push();
				System.out.print("Line(1), Rect(2), Circle(3) : ");
				num = sc.nextInt();
				if(num<1 || num>3) {
					System.out.println("1~3만 입력하세요");
					break;
				}System.out.print("삽입할 위치 입력 : ");
				index = sc.nextInt();
				if(!push(num,index)) {
					System.out.println("삽입할 수 없습니다.");
				}
				break;
			case 2:
				System.out.print("삭제할 도형 위치 입력 : ");
				index = sc.nextInt();
				if(!delete(index)) {
					System.out.println("삭제할 수 없습니다.");
				}break;
			case 3:
				Shape p = start;
				while(p!=null) {
					p.draw();
					p=p.getNext();
				}break;			
			case 4: System.out.println("그래픽 에디터 "+name+" 를 종료합니다.");break;
			default:System.out.println("1~4만 입력하세요");
			}
		}
	}
}
