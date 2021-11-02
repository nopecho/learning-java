import java.util.Scanner;

class Day{
	private String work;
	public void set(String work) {this.work=work;}
	public String get() {return work;}
	public void show() {
		if(work == null) System.out.println("없습니다.");
		else System.out.println(work+" 입니다.");
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
		System.out.print("날짜(1~"+this.day+")  : ");
		int dayNum=sc.nextInt();
		if(1<=dayNum && dayNum<=this.day) {
			System.out.print("할일(빈칸없이 입력) : ");
			String work = sc.next();
			d[dayNum-1].set(work);
		}else {
			System.out.println("날짜를 확인해주세용");
		}

	}
	
	private void view() {
		System.out.print("날짜(1~"+this.day+")  : ");
		int dayNum=sc.nextInt();
		if(1<=dayNum && dayNum<=this.day) {
			d[dayNum-1].get();
			System.out.print(dayNum+"일의 할일은 ");
			d[dayNum-1].show();
		}else {
			System.out.println("날짜를 확인해주세용");
		}

	}
	
	private void finish() {
		System.out.println("스케쥴 관리 프로그램을 종료합니다.");
	}
	
	void run() {
		System.out.println("이번달 스케쥴 관리 프로그램");
		while(true) {
			System.out.print("할일 (입력:1, 보기:2, 끝내기:3) : ");
			int num = sc.nextInt();
			if(num==1) {
				input();
			}else if(num==2){
				view();
			}else if(num==3) {
				finish();
				break;
			}else {
				System.out.println("1~3을 입력하세요.");
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
