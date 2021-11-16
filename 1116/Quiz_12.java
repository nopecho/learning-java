import java.util.Scanner;

abstract class Shape{ //�߻�Ŭ����
	private Shape next;
	public Shape() { next=null; }
	public void setNext(Shape obj) { next=obj; } //��ũ ����
	public Shape getNext() { return next; }	//next
	public abstract void draw();
}
class Line extends Shape{
	@Override
	public void draw() { System.out.println("L I N E"); }	
}
class Rect extends Shape{
	@Override
	public void draw() { System.out.println("R E C T"); }		
}
class Circle extends Shape{
	@Override
	public void draw() { System.out.println("C I R C L E"); }		
}

class GraphicEditor{
	Scanner sc = new Scanner(System.in);
	private int count=0;
	private int index;
	private boolean f = true;
	private Shape start;
	private Shape last;
	
	public void push() {
		Shape temp = null;
		System.out.print("--------- Line(1), Rect(2), Circle(3) --------- : ");
		switch(sc.next()) {
		case "1": temp = new Line(); break;		
		case "2": temp = new Rect(); break;
		case "3": temp = new Circle(); break;
		default : System.out.println("1 ~ 3 �� �Է�");
		}
		if(count==0) {
			start=temp; 
			last=start; 
			count++; 
			return;
		}
		last.setNext(temp); 
		last=temp;
		temp=start;
		count++;
	}
	
	public void delete(){
		if(count==0) {
			System.out.println("������ ������ �����ϴ�.");
			return;
		}
		System.out.print("������ ������ ��ġ : ");
		int num = sc.nextInt();	
		if(num>count) {
			System.out.println("������ �� �����ϴ�.");
			return;
		}else if(num<=count){
			
		}	
	}
	
	public void show() {
		Shape p = start;
		while(p!=null) {
			p.draw();
			p=p.getNext();
		}
	}
	
	public void finish() {
		System.out.println("����");
		f=false;
	}
	
	public void run() {
		System.out.println("�׷��� ������ ����");
		while(f) {
			System.out.print("--------- Push(1), Delete(2), Show(3), Finish(4) --------- : ");
			switch(sc.next()) {
			case "1" : push(); break;
			case "2" : delete(); break;
			case "3" : show(); break;
			case "4" : finish(); break;
			default : System.out.println("1 ~ 4 �� �Է�");		
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
