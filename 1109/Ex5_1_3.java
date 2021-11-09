class Point{ //슈퍼클래스
	private int x,y; //슈퍼클래스 멤버 변수(private)
	Point(){
		this.x=this.y=0;
	}
	Point(int x,int y){ //슈퍼클래스 생성자
		this.x=x;
		this.y=y;
	}
	public void set(int x,int y) { //슈퍼클래스 멤버 메소드
		this.x=x;
		this.y=y;
	}
	public void showPoint() { //슈퍼클래스 멤버 메소드
		System.out.println("( "+x+","+y+" )");
	}
}

class ColorPoint extends Point{ //슈퍼클래스 Point를 상속받은 ColorPoint 서브 클래스
	private String color; //서브클래스 멤버 변수
	ColorPoint(int x,int y,String color){ //서브클래스 생성자
		super(x,y); //super를 통해 슈퍼클래스의 생성자 초기화  //(순서)부모 생성자 초기화 -> 자식 생성자 초기화
		this.color=color; //서브클래스의 멤버 변수 초기화
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
		
		//업캐스팅 (Point)데이터 타입의 point는 (ColorPoint)의 메모리를 할당받는다. (ColorPoint의 데이터는 가지고 있으나 접근은 Point데이터 밖에 안됨 다운캐스팅으로 통해 다시 접근 가능)
		Point point = new ColorPoint(); 
		point.set(8, 8);
		point.showPoint();
		//다운캐스팅 (ColorPoint)데이터 타입으로 형 변환 할것이다 명시 해줘야함, Point데이터 타입으로 접근하지 못하는 ColorPoint의 데이터에 접근하기 위해 다운캐스딩 
		ColorPoint colorpoint = (ColorPoint)point; 
		colorpoint.setColor("Black");
		colorpoint.showColorPoint();
	}
}
