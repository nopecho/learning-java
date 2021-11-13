import java.util.Scanner;
interface Stack{ //스택 인터페이스
	int length();
	int capacity();
	String pop();
	boolean push(String val);
}

class StringStack implements Stack{ //인터페이스를 상속받은 StringStack 클래스 (해당 클래스는 인터페이스의 모든 메소드 오버라이드 해야됨)
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
	public String pop() { //현재 스택의 0번째 문자열 리턴 메소드( 해당 메소드 실행하면 0번째 문자열이 리턴되고 1번 문자열이 0번 문자열이 됨)
		if(capacity()==0) {
			return null;
		}return s[0];
	}
	
	@Override
	public boolean push(String val) { //현재 스택에 문자열 추가 메소드(추가 된 문자열은 스택의 0번째에 추가)
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
