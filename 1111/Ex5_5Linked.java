public class Ex5_5Linked {
	static void paint(Shape p) {
		p.draw();
	}
	public static void main(String[] args) {
		Shape start,last,obj; //Shape 타입의 레퍼런스변수 3개 생성 (각각은 객체가 아닌 Shape데이터를 담고있는 레퍼런스일 뿐!)
		start = new Line(); // Shape start = new Line() (업캐스팅)
		last = start; // Shape last = start
		obj = new Rect(); // Shape obj = new Rect() (업캐스팅)
		last.next=obj; // last.next 값은 obj를 가짐 (last.next 는 결국 new Line()객체의 맴버 변수 Shape next 레퍼런스)
		last=obj;
		obj=new Circle();
		last.next=obj;
		last=obj;
		obj=start;
		
		Shape p = start;
		while(p!=null) {
			p.draw();
			p=p.next;
		}
		obj.draw();
		
	}
}