class Point{
	private int x=0;
	private int y=0;
	public Point() {}	
	public Point(int x,int y) {
		this.x=x;
		this.y=y;
	}
	public int getX() { return x; }	
	
	public int getY() { return y; }
	
	protected void move(int x,int y) {
		this.x=x;
		this.y=y;
	}		
}

class ColorPoint extends Point{
	private String color="BLACK";
	public ColorPoint(int x, int y, String color) {
		super(x,y);
		this.color=color;
	}
	public ColorPoint(int x, int y) { super(x,y); }
	
	public ColorPoint() { }

	public void setXY(int x, int y) { move(x,y); }	
	
	public void setColor(String color) { this.color=color; }
		
	public String toString() { return this.color+" ����"+"("+getX()+","+getY()+") �� ��"; }
	
}
class Point3D extends Point{
	private int z;
	Point3D(int x, int y,int z){
		super(x,y);
		this.z=z;
	}
	public void moveUp() { z++; }
	
	public void moveDown() { z--; }
	
	public int getZ() { return z; }
	
	protected void move(int x,int y,int z) {
		move(x,y);
		this.z=z;
	}	
	
	public String toString() { return "("+getX()+","+getY()+","+getZ()+") �� ��"; }		
}
class PositivePoint extends Point{
	public PositivePoint(int x,int y) {
		super(x,y);
		if(x<0 && y<0) {
			super.move(0, 0);
		}
	}
	public PositivePoint() {	
	}
	@Override
	public void move(int x,int y) {
		if(x>0 && y>0) {
			super.move(x, y);
		}return;
	}
	public String toString() { return "("+getX()+","+getY()+") �� ��"; }
}

public class Quiz_5_6_7_8 {
	public static void main(String[] args) {
//		Quiz_5
//		ColorPoint cp = new ColorPoint(5,5,"Blue");
//		cp.setXY(10, 20);
//		cp.setColor("red");
//		String str = cp.toString();
//		System.out.println(str+"�Դϴ�.");
		
//		Quiz_6
//		ColorPoint zp = new ColorPoint();
//		System.out.println(zp.toString()+"�Դϴ�.");
//		
//		ColorPoint sp = new ColorPoint(10,10);
//		sp.setXY(5, 5);
//		sp.setColor("RED");
//		System.out.println(sp.toString()+"�Դϴ�.");
		
//		Quiz_7
//		Point3D p = new Point3D(1,2,3);
//		System.out.println(p.toString()+"�Դϴ�.");
//		p.moveUp();
//		System.out.println(p.toString()+"�Դϴ�.");
//		p.moveDown();
//		p.move(10, 10);
//		System.out.println(p.toString()+"�Դϴ�.");
//		p.move(100, 200, 300);
//		System.out.println(p.toString()+"�Դϴ�.");		
		
		//Quiz_8
		
		PositivePoint p = new PositivePoint();
		p.move(10, 10);
		System.out.println(p.toString()+"�Դϴ�.");
		p.move(-5, 10);
		System.out.println(p.toString()+"�Դϴ�.");
		
		PositivePoint p2 = new PositivePoint(-10,-10);
		System.out.println(p2.toString()+"�Դϴ�.");
		
	}
}
