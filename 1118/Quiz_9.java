import java.util.Scanner;

interface Stack{
	int length();
	int capacity();
	String pop();
	boolean push(String val);
}

class StringStack implements Stack{
	private String[] stk;
	private int tos;
	
	StringStack(int cap){
		stk=new String[cap];
		tos = -1; 
	}
	@Override
	public int length() {
		return tos+1;
	}

	@Override
	public int capacity() {
		return stk.length;
	}

	@Override
	public String pop() {
		if(tos==-1) {
			return null;
		}
		String s = stk[tos];
		tos--;
		return s;
	}

	@Override
	public boolean push(String val) {
		if(tos == stk.length-1) {
			return false;
		}
		tos++;
		stk[tos]=val;
		return true;
	}	
}
public class Quiz_9 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("�� ���� ������� ũ�� �Է� : ");
		int n = sc.nextInt();
	
		StringStack ss = new StringStack(n);
		while(true) {
			System.out.print("���ڿ� �Է� : ");
			String st = sc.next();
			if(st.equals("�׸�")) {
				break;
			}
			boolean result = ss.push(st);
			if(!result) {
				System.out.println("������ �� ���� Ǫ�� �Ұ�");
			}
		}
		System.out.print("���ÿ� ����� ��� ���ڿ� �� :");
		for(int i=0;i<n;i++) {
			System.out.print(ss.pop()+" ");
		}
		sc.close();
	}
}
