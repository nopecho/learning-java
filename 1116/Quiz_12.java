import java.util.Scanner;

abstract class Shape{ //추상클래스
	private Shape next;
	public Shape() { next=null; } // Shape타입의 객체 생성시 해당 객체의 next=null
	public void setNext(Shape obj) { next=obj; } //링크 연결 시키는 메소드
	public Shape getNext() { return next; } //해당 객체의 Shape타입 next를 리턴 
	public abstract void draw();
}
class Line extends Shape{
	@Override
	public void draw() { System.out.println("ㅡ"); }	
}
class Rect extends Shape{
	@Override
	public void draw() { System.out.println("ㅁ"); }		
}
class Circle extends Shape{
	@Override
	public void draw() { System.out.println("ㅇ"); }		
}

class GraphicEditor{
	Scanner sc = new Scanner(System.in);
	private int count=0; //링크에 연결될때마다 count++
	private boolean f = true;
	private Shape start,last; //시작,마지막 주소 찾기 위한 Shape레퍼런스 변수 
	
	public void push() { //삽입 메소드
		Shape temp = null; //빈 Shape타입 레퍼런스 선언 (왜? 1,2,3 입력 받은 객체를 생성하고 담기위해)
		System.out.print("ㅡ ㅁ ㅇ Line(1), Rect(2), Circle(3) ㅇ ㅁ ㅡ :");
		switch(sc.next()) { // 스위치문 안에 바로 sc.next()해도 입력 가능!
		case "1": temp = new Line(); break;		
		case "2": temp = new Rect(); break;
		case "3": temp = new Circle(); break;
		default : System.out.println("1 ~ 3 만 입력");
		}
		if(count==0) { //count가 0일때 즉,첫번째 삽입할 경우에만 실행하는 if문
			start=temp; //start의 레퍼런스 값을 temp로
			last=start; //last의 레퍼런스 값을 start로 (왜? 첫번째 삽입 후 마지막에 계속 링크를 연결해야됨. last 레퍼런스를 지정 안해주면 다음 링크 불가) 
			count++; 
			return;
		}
		last.setNext(temp); //last의 'next'를 temp로 (연결)
		last=temp; //last 레퍼런스를 temp로 (왜? temp가 last 레퍼런스가 되야 또 링크 가능, 링크한다는 뜻은 마지막 레퍼런스에 계속 연결 시킨다는 의미)
		count++;
	}
	
	public void delete(){ //삭제 메소드
		System.out.print("삭제할 도형의 위치(시작 index=0) : ");
		int num = sc.nextInt();	
		if(num>count-1) {
			System.out.println("삭제할 도형이 없습니다.");
			return;
		}
		Shape p = start; //링크 시작 주소 p (0번째)
		if(num==0) { //0번째 연결 해제 if문
			start=start.getNext(); //start를 start.next의 레퍼런스로
			count--;
			return;
		}
		for(int i=0;i<num;i++) { //중간 or 마지막 연결 해제 for문
			if(i==num-1) { //i가 for문의 마지막까지 돈다면
				p.setNext(p.getNext().getNext()); //원하는 번째 -1 찾아가서 해당 next를 .다음.다음으로 넘김, ex) 0 1 2 3 4 5 에서 1번째를 지우고 싶다면 0번째의 next링크를 1번째 건너뛰고 2번째로 연결해줌. 
				count--;
				return;
			}p = p.getNext(); //if문 해당 안되면 for문돌면서 링크를 넘김
		}
	}
	
	public void show() { //모두보기 메소드
		Shape p = start;
		while(p!=null) {
			p.draw();
			p=p.getNext();
		}
	}
	
	public void finish() { //종료 메소드
		System.out.println("종료");
		f=false;
	}
	
	public void run() {
		System.out.println("그래픽 에디터 시작");
		while(f) {
			System.out.print("< Push(1), Delete(2), Show(3), Finish(4) > : ");
			switch(sc.next()) {
			case "1" : push(); break;
			case "2" : delete(); break;
			case "3" : show(); break;
			case "4" : finish(); break;
			default : System.out.println("1 ~ 4 만 입력");		
			}
		}
	}
}

public class Quiz_12 {
	public static void main(String[] args) {
		GraphicEditor g = new GraphicEditor();
		g.run();
	}
}
