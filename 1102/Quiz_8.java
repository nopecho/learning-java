import java.util.Scanner;

class Phone{
	private String name,tel;
	
	public void setName(String name) {this.name=name;}			
	public void setTel(String tel) {this.tel=tel;}		
	public String getTel() {return this.tel;}
	public String getName() {return this.name;}
	public void show() {System.out.println(name+" 의 번호는 "+tel+" 입니다.");}
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
			System.out.println(name+"은 없는 사람입니다.");
		}
	}


	void input() {
		for (int i=0;i<p.length;i++) {
			System.out.print("이름, 전화번호(이름과 번호는 빈칸x) : ");
			String n = sc.next();
			p[i].setName(n);
			String t = sc.next();
			p[i].setTel(t);
		}System.out.println("저장 완료");
	}
	
	void run() {
		input();
		while(true) {
			System.out.print("검색 할 이름 >>");
			String name = sc.next();
			if(name.equals("그만")) {
				System.out.println("전화번호부를 닫습니다.");
				break;
			}checkName(name);
		}
	}
}
public class Quiz_8 {	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("인원 수 입력 >>");
		int count = sc.nextInt();
		PhoneBook p = new PhoneBook(count);	
		p.run();
		sc.close();
	}
}
