interface Shape2{
	final double PI = 3.14;
	void draw();
	double getArea();
	default public void redraw() {
		System.out.print("--- �ٽ� �׸��ϴ�. ");
		draw();
	}
}
class Circle2 implements Shape2{
	private int r;
	
	Circle2(int r) { this.r=r; }
		 
	public int getR() { return r; }	
	
	@Override
	public void draw() { System.out.println("��������"+getR()+"�� ���Դϴ�."); }	
	 
	@Override
	public double getArea() { return PI*getR()*getR(); }		 
}

class Oval implements Shape2{
	private int x;
	private int y;
	
	Oval(int x,int y){
		this.x=x;
		this.y=y;
	}
	public int getX() { return x; }
	
	public int getY() { return y; }
	
	@Override
	public void draw() { System.out.println(getX()+"x"+getY()+"�� �����ϴ� Ÿ�� �Դϴ�."); }
		
	@Override
	public double getArea() { return PI*getX()*getY(); }	
}

class Rect2 implements Shape2{
	private int x;
	private int y;
	
	Rect2(int x,int y){
		this.x=x;
		this.y=y;
	}
	public int getX() { return x; }
	
	public int getY() { return y; }
		 
	@Override
	public void draw() { System.out.println(getX()+"x"+getY()+"ũ���� �簢�� �Դϴ�."); }
	
	@Override
	public double getArea() { return getX()*getY(); }	
}

public class Quiz_13_14 {
	public static void main(String[] args) {
		//Quiz_13
//		Shape2 d = new Circle2(10);
//		d.redraw();
//		System.out.println("������ "+ d.getArea());
		
		//Quiz_14
		Shape2[] list = new Shape2[3];
		list[0]=new Circle2(10);
		list[1]=new Oval(20,30);
		list[2]=new Rect2(10,40);
		
		for(int i=0;i<list.length;i++) {
			list[i].redraw();
		}
		for(int i=0;i<list.length;i++) {
			System.out.println("������ "+ list[i].getArea());
		}	
	}
}
