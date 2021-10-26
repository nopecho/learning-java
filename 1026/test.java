import java.util.ArrayList;
import java.util.Scanner;

public class test {
	
	static Scanner sc = new Scanner(System.in);
	
	public static int getListLength() {	
		int listlength=sc.nextInt();
		return listlength;
	}
	
	public static ArrayList<Integer> getNumList(){
		ArrayList<Integer> numlist = new ArrayList<Integer>();
		for (int i=0;i<getListLength();i++) {
			int z = sc.nextInt();
			numlist.add(z);	
		}
		return numlist;
	}

	public static void main(String[] args) {
		
		System.out.print("리스트 길이를 설정해주세요 : ");
		getListLength();
		System.out.println("리스트 값을 입력하세요");
		getNumList();
		

	}

}
