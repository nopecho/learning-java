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
		System.out.println("("+x+","+y+")에서 크기가 "+w+"x"+y+"인 사각형");
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
		System.out.println("s의 면적은 "+s.square());
		if(t.contains(r)) {
			System.out.println("t는 r을 포함합니다.");
		}
		if(t.contains(s)) {
			System.out.println("t는 s를 포함합니다.");
		}
	}

}
