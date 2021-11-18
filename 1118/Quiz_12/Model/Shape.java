package Model;

public abstract class Shape { //추상클래스
	private Shape next;
	public Shape() { next=null; } // Shape타입의 객체 생성시 해당 객체의 next=null
	public void setNext(Shape obj) { next=obj; } //링크 연결 시키는 메소드
	public Shape getNext() { return next; } //해당 객체의 Shape타입 next를 리턴 
	public abstract void draw();
}
