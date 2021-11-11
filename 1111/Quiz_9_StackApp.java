import java.util.Scanner;
interface Stack{
	int length();
	int capacity();
	String pop();
	boolean push(String val);
}

class StringStack implements Stack{
	Scanner sc = new Scanner(System.in);
	public String[] s;
	StringStack(int length){ this.s = new String[length]; }
	
	@Override
	public int length() {
		int count=0;
		for(int i=0;i<s.length;i++) {
			if(s[i]!=null) count++;
		}
		return count;
	}
	@Override
	public int capacity() { return s.length-length(); }
	
	@Override
	public String pop() { //2 얘 호출해서 추가
		if(capacity()==0) {
			return null;
		}return s[0];
	}
	
	@Override
	public boolean push(String val) { //1 얘가 참이면
		if(capacity()==0) {
			System.out.println("[!] 스택이 가득 차서 푸시 불가");
			return false;
		}s[capacity()-1]=val;
		return true;
	}
}

public class Quiz_9_StackApp {	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("총 스택 저장 공간의 크기 입력 : ");
		int length = sc.nextInt();
		StringStack app = new StringStack(length);	
		
		while(true) {
			System.out.print("문자열 입력 : ");
			String str = sc.next();
			if(str.equals("그만")) {
				System.out.print("스택에 저장된 모둔 문자열 팝 : ");
				for(int i=0;i<length;i++) {
					System.out.print(app.s[i]+" ");
				}
				break;
			}
			if(!app.push(str)) {
				continue;
			}		
		}sc.close();		
	}
}
