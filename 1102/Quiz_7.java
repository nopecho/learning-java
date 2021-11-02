import java.util.Scanner;

class Day{
	private String work;
	public void set(String work) {this.work=work;}
	public String get() {return work;}
	public void show() {
		if(work == null) System.out.println("�����ϴ�.");
		else System.out.println(work+" �Դϴ�.");
	}
}

class MonthS{
	Scanner sc = new Scanner(System.in);
	int day;
	Day[]d;
	
	public MonthS(int day) {		
		this.day=day;
		this.d=new Day[day];
		for(int i=0;i<d.length;i++) {
			d[i]=new Day();
		}
	}
	
	private void input() {
		System.out.print("��¥(1~"+this.day+") ? >>");
		int dayNum=sc.nextInt();
		if(1<=dayNum && dayNum<=this.day) {
			System.out.print("����(��ĭ���� �Է�) >>");
			String work = sc.next();
			d[dayNum-1].set(work);
		}else {
			System.out.println("��¥�� Ȯ�����ּ���");
		}

	}
	
	private void view() {
		System.out.print("��¥(1~"+this.day+") ? >>");
		int dayNum=sc.nextInt();
		if(1<=dayNum && dayNum<=this.day) {
			d[dayNum-1].get();
			System.out.print(dayNum+"���� ������ ");
			d[dayNum-1].show();
		}else {
			System.out.println("��¥�� Ȯ�����ּ���");
		}

	}
	
	private void finish() {
		System.out.println("���α׷��� �����մϴ�.");
	}
	
	void run() {
		System.out.println("�̹��� ������ ���� ���α׷�");
		while(true) {
			System.out.print("���� (�Է�:1, ����:2, ������:3) >>");
			int num = sc.nextInt();
			if(num==1) {
				input();
				continue;
			}else if(num==2){
				view();
				continue;
			}else {
				finish();
				break;
			}
		}
	}
}	

public class Quiz_7 {

	public static void main(String[] args) {
		MonthS april = new MonthS(30);
		april.run();
	}

}
