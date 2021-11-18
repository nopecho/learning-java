package Domain;

import java.util.Scanner;
import Model.*;

class GraphicEditor {
	private Scanner sc = new Scanner(System.in);
	private String name;
	private Shape start=null,last=null;
	
	GraphicEditor(String name){ this.name=name; }
	
	private boolean push(int num,int index) { //삽입메소드
		Shape temp=null;
		Shape p = start;
		switch(num) {
		case 1: temp = new Line();
		case 2: temp = new Rect();
		case 3: temp = new Circle();
		}
		if(index==0) {
			start=last=temp;
			return true;
		}
		for(int i=0;i<index;i++) {
			p=p.getNext();
		}
		if(p==null)
		last.setNext(temp);
		last=temp;
		
		return true;	
	}
	private boolean delete(int index) { //삭제메소드
		Shape p = start;
		for(int i=0;i<index;i++) {
			p.getPrev();
			p=p.getNext();
		}
		return true;
	}
	
	
	void run() {
		System.out.println("그래픽 에디터 "+name+" 를 실행합니다.");
		int choice=0; //메뉴 선택용
		int num=0; //도형 삽입용
		int index=0; //인덱스용
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
				}System.out.println("삽입할 위치 입력 : ");
				index = sc.nextInt();
				if(!push(num,index)) {
					System.out.println("삽입할 수 없습니다.");
				}
				break;
			case 2:
				System.out.println("삭제할 도형 위치 입력 : ");
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
