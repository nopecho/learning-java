
public class HelloApp {
	public static int sum(int n,  int m) { //method����, �޼ҵ� �̸��� sum, �Ķ���ʹ� int n int m
		return n+m ; //sum �޼ҵ��� ��ȯ���� n+m
	}

	public static void main(String[] args) { //���� method
		
		var i =20; //���� ����(�ʱⰪ)
		int s ;	//���� ����
		char a; //���� ����
		
		s=sum(i,10); //������ ������ i, 10�� �Ķ���ͷ� sum�޼ҵ� ȣ��
		a='?';
		System.out.print(a);
		System.out.println("Hello");
		System.out.print(s);
	}

}