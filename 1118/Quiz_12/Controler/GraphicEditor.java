package Controler;
import java.util.Scanner;
import Model.*;

public class GraphicEditor {
	private Scanner sc = new Scanner(System.in);
	private String name;
	private Shape start=null, last=null;
	
	public GraphicEditor(String name) {
		this.name=name;
	}
	private void push(int num) {
		Shape obj = null;
		switch(num) {
		case 1:
			obj = new Line();
			break;
		case 2:
			obj = new Rect();
			break;
		case 3:
			obj = new Circle();
			break;
		}
		if(start==null) {
			start=last=obj;
		}else {
			last.setNext(obj);
			last=obj;
		}
	}
	private boolean delete(int num) {
		Shape cur=start; //삭제하고자 하는
		Shape pre=start; // 삭제하고자 하는 값 이전
		if(start == null) return false;
		for(int i=0;i<num;i++) {
			pre = cur;
			cur = cur.getNext();
			if(cur==null) return false;
		}
		if(start==last) { // 하나일때 
			start = last = null;
			return true;
		}
		if(cur==start) { //시작값 지울때
			start=start.getNext();
		}else if(cur==last) { //마지막값 지울때
			last=pre ;
			last.setNext(null);
		}else {
			pre.setNext(cur.getNext()); //중간 지울때			
		}
		return true;
	}

	public void run() {
		System.out.println("그래픽 에디터 "+name+" 를 실행 합니다.");
		int choice=0;
		int num=0;
		while(choice!=4) {
			System.out.print("삽입(1), 삭제(2), 모두보기(3), 종료(4) >>");
			choice=sc.nextInt();
			switch(choice) {
			case 1:
				System.out.print("Line(1), Rect(2), Circle(3) : ");
				num = sc.nextInt();
				if(num<1 || num>3) {
					System.out.println("다시 입력");
					break;
				}
				push(num);
				break;
			case 2:
				System.out.print("삭제할 도형 위치 입력 : ");
				num=sc.nextInt();
				if(!delete(num)) {
					System.out.println("삭제할 수 없습니다.");
				}
				break;
			case 3:
				Shape t = start;
				while(t!=null) {
					t.draw();
					t=t.getNext();
				}
				break;
			case 4:
				System.out.println("그래픽 에디터 "+name+" 를 종료 합니다.");
				break;
			default :
				System.out.println("1 ~ 4까지 입력가능");
			}
		}
	}
}
