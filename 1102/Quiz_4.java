class R{
	int x,y,w,h;
	
	R(int x,int y,int w,int h){
		this.x=x;
		this.y=y;
		this.w=w;
		this.h=h;
	}
	int square() {
		return w*h;
	}
	void show() {
		System.out.println("("+x+","+y+")���� ũ�Ⱑ "+w+"x"+y+"�� �簢��");
	}
	boolean contains(R a) {
		if(a.square()>this.square()) {
			return true;
		}else {
			return false;
		}
	}
}
public class Quiz_4 {
	public static void main(String[] args) {
		R r = new R(2,2,11,11);
		R s = new R(5,5,6,6);
		R t = new R(1,1,10,10);
		
		r.show();
		System.out.println("s�� ������ "+s.square());
		if(t.contains(r)) {
			System.out.println("t�� r�� �����մϴ�.");
		}
		if(t.contains(s)) {
			System.out.println("t�� s�� �����մϴ�.");
		}
	}

}
