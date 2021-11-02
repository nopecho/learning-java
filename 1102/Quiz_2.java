import java.util.Scanner;
class Grade{
	private int math,sic,eng;
	Grade(int math,int sic,int eng){
		this.math=math;
		this.sic=sic;
		this.eng=eng;
	}
	int avg() {
		return (math+sic+eng)/3;
	}
}

public class Quiz_2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("수학,과학,영어 순으로 3개의 점수 입력 >> ");
		int math = sc.nextInt();
		int sic = sc.nextInt();
		int eng = sc.nextInt();
		
		Grade me = new Grade(math,sic,eng);
		System.out.println("평균은 "+me.avg());
		
		sc.close();

	}

}
