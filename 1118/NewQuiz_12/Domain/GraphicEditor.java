package Domain;

import java.util.Scanner;
import Model.*;

class GraphicEditor {
	private Scanner sc = new Scanner(System.in);
	private String name;
	private Shape start=null,last=null;
	
	GraphicEditor(String name){ this.name=name; }
	
	private boolean push(int num,int index) { //���Ը޼ҵ�
		Shape temp=null;
		Shape p = start;
		switch(num) {
		case 1: temp = new Line();
		case 2: temp = new Rect();
		case 3: temp = new Circle();
		}
		if(index==0) {
			start=last=temp;
			return true;
		}
		for(int i=0;i<index;i++) {
			p=p.getNext();
		}
		if(p==null)
		last.setNext(temp);
		last=temp;
		
		return true;	
	}
	private boolean delete(int index) { //�����޼ҵ�
		Shape p = start;
		for(int i=0;i<index;i++) {
			p.getPrev();
			p=p.getNext();
		}
		return true;
	}
	
	
	void run() {
		System.out.println("�׷��� ������ "+name+" �� �����մϴ�.");
		int choice=0; //�޴� ���ÿ�
		int num=0; //���� ���Կ�
		int index=0; //�ε�����
		while(choice!=4) {
			System.out.print("����(1), ����(2), ��κ���(3), ����(4) : ");
			choice = sc.nextInt();
			switch(choice) {
			case 1://push();
				System.out.print("Line(1), Rect(2), Circle(3) : ");
				num = sc.nextInt();
				if(num<1 || num>3) {
					System.out.println("1~3�� �Է��ϼ���");
					break;
				}System.out.println("������ ��ġ �Է� : ");
				index = sc.nextInt();
				if(!push(num,index)) {
					System.out.println("������ �� �����ϴ�.");
				}
				break;
			case 2:
				System.out.println("������ ���� ��ġ �Է� : ");
				index = sc.nextInt();
				if(!delete(index)) {
					System.out.println("������ �� �����ϴ�.");
				}break;
			case 3:
				Shape p = start;
				while(p!=null) {
					p.draw();
					p=p.getNext();
				}break;			
			case 4: System.out.println("�׷��� ������ "+name+" �� �����մϴ�.");break;
			default:System.out.println("1~4�� �Է��ϼ���");
			}
		}
	}
}
