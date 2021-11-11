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
	public String pop() {
		if(capacity()==0) {
			return null;
		}return s[0];
	}
	
	@Override
	public boolean push(String val) {
		if(capacity()==0) {
			System.out.println("[!] ������ ���� ���� Ǫ�� �Ұ�");
			return false;
		}s[capacity()-1]=val;
		return true;
	}
}

public class Quiz_9_StackApp {	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("�� ���� ���� ������ ũ�� �Է� : ");
		int length = sc.nextInt();
		StringStack app = new StringStack(length);	
		
		while(true) {
			System.out.print("���ڿ� �Է� : ");
			String str = sc.next();
			if(str.equals("�׸�")) {
				System.out.print("���ÿ� ����� ��� ���ڿ� �� : ");
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
