package Model;

public abstract class Shape { //�߻�Ŭ����
	private Shape next;
	public Shape() { next=null; } // ShapeŸ���� ��ü ������ �ش� ��ü�� next=null
	public void setNext(Shape obj) { next=obj; } //��ũ ���� ��Ű�� �޼ҵ�
	public Shape getNext() { return next; } //�ش� ��ü�� ShapeŸ�� next�� ���� 
	public abstract void draw();
}
