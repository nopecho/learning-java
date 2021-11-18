package Controler;
import java.util.Scanner;
import Model.*;

public class GraphicEditor {
	private Scanner sc = new Scanner(System.in);
	private String name;
	private Shape start=null, last=null;
	
	public GraphicEditor(String name) {
		this.name=name;
	}
	private void push(int num) {
		Shape obj = null;
		switch(num) {
		case 1:
			obj = new Line();
			break;
		case 2:
			obj = new Rect();
			break;
		case 3:
			obj = new Circle();
			break;
		}
		if(start==null) {
			start=last=obj;
		}else {
			last.setNext(obj);
			last=obj;
		}
	}
	private boolean delete(int num) {
		Shape cur=start; //�����ϰ��� �ϴ�
		Shape pre=start; // �����ϰ��� �ϴ� �� ����
		if(start == null) return false;
		for(int i=0;i<num;i++) {
			pre = cur;
			cur = cur.getNext();
			if(cur==null) return false;
		}
		if(start==last) { // �ϳ��϶� 
			start = last = null;
			return true;
		}
		if(cur==start) { //���۰� ���ﶧ
			start=start.getNext();
		}else if(cur==last) { //�������� ���ﶧ
			last=pre ;
			last.setNext(null);
		}else {
			pre.setNext(cur.getNext()); //�߰� ���ﶧ			
		}
		return true;
	}

	public void run() {
		System.out.println("�׷��� ������ "+name+" �� ���� �մϴ�.");
		int choice=0;
		int num=0;
		while(choice!=4) {
			System.out.print("����(1), ����(2), ��κ���(3), ����(4) >>");
			choice=sc.nextInt();
			switch(choice) {
			case 1:
				System.out.print("Line(1), Rect(2), Circle(3) : ");
				num = sc.nextInt();
				if(num<1 || num>3) {
					System.out.println("�ٽ� �Է�");
					break;
				}
				push(num);
				break;
			case 2:
				System.out.print("������ ���� ��ġ �Է� : ");
				num=sc.nextInt();
				if(!delete(num)) {
					System.out.println("������ �� �����ϴ�.");
				}
				break;
			case 3:
				Shape t = start;
				while(t!=null) {
					t.draw();
					t=t.getNext();
				}
				break;
			case 4:
				System.out.println("�׷��� ������ "+name+" �� ���� �մϴ�.");
				break;
			default :
				System.out.println("1 ~ 4���� �Է°���");
			}
		}
	}
}
