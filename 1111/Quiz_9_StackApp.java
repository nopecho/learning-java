import java.util.Scanner;
interface Stack{
	int length();
	int capacity();
	String pop();
	boolean push(String val);
}

class StringStack implements Stack{ //interface를 상속받은 class는 interface의 모든 메소드를 구현해야함(오버라이딩)
	Scanner sc = new Scanner(System.in);
	public String[] s; //스택이 들어갈 공간 할당
	StringStack(int length){
		this.s = new String[length];
	}
	
	@Override
	public int length() { //저장한 공간
		int count=0;
		for(int i=0;i<s.length;i++) {
			if(s[i]!=null) count++;
		}
		return count;
	}
	
	@Override
	public int capacity() { //저장 가능한 공간
		return s.length-length();
	}
	
	@Override
	public String pop() { // stack의 0번째 출력
		String temp;
		if(length()==0) {
			return null;
		}temp=s[capacity()];
		s[capacity()]=null;
		return temp;
	}
	
	@Override
	public boolean push(String val) { // 파라미터로 들어온 String타입 밸류를 stack의 0번째에 추가(추가 될때마다 0번째에 추가,기존 0번째는 1번째로 한칸씩 밀려남)
		if(capacity()==0) {
			System.out.println("스택이 가득차서 푸쉬 불가");
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
					System.out.print(app.pop()+" ");
				}
				break;
			}
			if(!app.push(str)) {
				continue;
			}		
		}sc.close();		
	}
}
