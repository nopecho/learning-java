class Marine{
	int x=0, y=0;
	int hp=60;
	static int weapon = 6; //weapon �տ� static�� ������ static�޼ҵ�(Ŭ���� �޼ҵ�)���� ȣ�� �����ؾ���
	static int armor=0; //���� ����
	
	static void weaponUp() {
		weapon++; //��� ������ ���ݷ��� static void �Լ��� ���� �ν��Ͻ������� �����Ǵ°� �ƴ϶� �ش� Ŭ������ ���ݷ��� �÷������
	}
	static void armorUp() {
		armor++; //���� ����
	}
	void move(int x,int y) {
		this.x=x;
		this.y=y;
	}
}
public class Quiz_6_9_10_11_12 {

	public static void main(String[] args) {
		//6_10 : b,e (b : ��ü�� �ʱ�ȭ�ϱ� ����)
		
		//6_11 : b,c (b : Ŭ�������������� ��� �������� , d : Ŭ���� ������ �ν��Ͻ�����)
		
		//6_12 : c,d (c : ���� Ÿ���� ���ƾ���, d : �Ű����� �̸��� ���x)

	}

}
