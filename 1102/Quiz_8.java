import java.util.Scanner;

class Phone{
	private String name,tel;
	
	public void setName(String name) {this.name=name;}			
	public void setTel(String tel) {this.tel=tel;}		
	public String getTel() {return this.tel;}
	public String getName() {return this.name;}
	public void show() {System.out.println(name+" �� ��ȣ�� "+tel+" �Դϴ�.");}
}

class PhoneBook{
	Scanner sc = new Scanner(System.in);
	private Phone[] p;
	
	PhoneBook(int count){
		p=new Phone[count];
		for(int i=0;i<p.length;i++) {
			p[i]=new Phone();
		}
	}
	
	void checkName(String name) {
		int count=0;
		for (int i=0;i<p.length;i++) {
			if(name.equals(p[i].getName())) {
				p[i].show();
			}else {
				count++;
			}
		}if(count==p.length) {
			System.out.println(name+"�� ���� ����Դϴ�.");
		}
	}


	void input() {
		for (int i=0;i<p.length;i++) {
			System.out.print("�̸�, ��ȭ��ȣ(�̸��� ��ȣ�� ��ĭx) : ");
			String n = sc.next();
			p[i].setName(n);
			String t = sc.next();
			p[i].setTel(t);
		}System.out.println("���� �Ϸ�");
	}
	
	void run() {
		input();
		while(true) {
			System.out.print("�˻� �� �̸� >>");
			String name = sc.next();
			if(name.equals("�׸�")) {
				System.out.println("��ȭ��ȣ�θ� �ݽ��ϴ�.");
				break;
			}checkName(name);
		}
	}
}
public class Quiz_8 {	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("�ο� �� �Է� >>");
		int count = sc.nextInt();
		PhoneBook p = new PhoneBook(count);	
		p.run();
		sc.close();
	}
}
