class Point{ //����Ŭ����
	private int x,y; //����Ŭ���� ��� ����(private)
	Point(){
		this.x=this.y=0;
	}
	Point(int x,int y){ //����Ŭ���� ������
		this.x=x;
		this.y=y;
	}
	public void set(int x,int y) { //����Ŭ���� ��� �޼ҵ�
		this.x=x;
		this.y=y;
	}
	public void showPoint() { //����Ŭ���� ��� �޼ҵ�
		System.out.println("( "+x+","+y+" )");
	}
}

class ColorPoint extends Point{ //����Ŭ���� Point�� ��ӹ��� ColorPoint ���� Ŭ����
	private String color; //����Ŭ���� ��� ����
	ColorPoint(int x,int y,String color){ //����Ŭ���� ������
		super(x,y); //super�� ���� ����Ŭ������ ������ �ʱ�ȭ  //(����)�θ� ������ �ʱ�ȭ -> �ڽ� ������ �ʱ�ȭ
		this.color=color; //����Ŭ������ ��� ���� �ʱ�ȭ
	}
	ColorPoint(int x, int y){
		super(x,y);
	}
	ColorPoint(){
		this.color="not find color";
	}
	public void setColor(String color) {
		this.color=color;
	}
	public void showColorPoint() {
		System.out.print(color);
		showPoint();
	}
}

public class Ex5_1_3 {
	public static void main(String[] args) {
		Point p = new Point(5,4);
		p.showPoint();
		p.set(10, 8);
		p.showPoint();
		System.out.println("---------");
		
		ColorPoint cp = new ColorPoint(8,9,"red");
		cp.showColorPoint();
		cp.setColor("Blue");
		cp.showColorPoint();
		System.out.println("---------");
		
		ColorPoint cp2 = new ColorPoint(10,10);
		cp2.showColorPoint();
		System.out.println("---------");
		
		//��ĳ���� (Point)������ Ÿ���� point�� (ColorPoint)�� �޸𸮸� �Ҵ�޴´�. (ColorPoint�� �����ʹ� ������ ������ ������ Point������ �ۿ� �ȵ� �ٿ�ĳ�������� ���� �ٽ� ���� ����)
		Point point = new ColorPoint(); 
		point.set(8, 8);
		point.showPoint();
		//�ٿ�ĳ���� (ColorPoint)������ Ÿ������ �� ��ȯ �Ұ��̴� ��� �������, Point������ Ÿ������ �������� ���ϴ� ColorPoint�� �����Ϳ� �����ϱ� ���� �ٿ�ĳ���� 
		ColorPoint colorpoint = (ColorPoint)point; 
		colorpoint.setColor("Black");
		colorpoint.showColorPoint();
	}
}
