
public class test {
	static class a{
		int b;
		public a(int b) {
			this.b=b;
		}
		public void s(int b) {
			this.b=b;
		}
		public void show() {
			System.out.println("�� �Լ��� ȣ���� ��ü�� b�� > "+this.b);
		}
	}

	public static void main(String[] args) {
		a text = new a(5);
		a text2 = new a(3);
		a text3;
		
		text.s(10);
		text3=text;
		text3.show();
		text3.s(15);
		text3.show();
		text=text2;
		text2.show();
		
	}

}
