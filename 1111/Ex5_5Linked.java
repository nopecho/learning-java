public class Ex5_5Linked {
	static void paint(Shape p) {
		p.draw();
	}
	public static void main(String[] args) {
		Shape start,last,obj; //Shape Ÿ���� ���۷������� 3�� ���� (������ ��ü�� �ƴ� Shape�����͸� ����ִ� ���۷����� ��!)
		start = new Line(); // Shape start = new Line() (��ĳ����)
		last = start; // Shape last = start
		obj = new Rect(); // Shape obj = new Rect() (��ĳ����)
		last.next=obj; // last.next ���� obj�� ���� (last.next �� �ᱹ new Line()��ü�� �ɹ� ���� Shape next ���۷���)
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