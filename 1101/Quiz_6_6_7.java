class MyPoint{
	int x;
	int y;
	
	MyPoint(int x,int y){
		this.x=x;
		this.y=y;
	}	
	public double getDistance(int x,int y) {
		return Math.sqrt( ((this.x-x)*(this.x-x))+((this.y-y)*(this.y-y)) );
	}
}

public class Quiz_6_6_7 {
	
//	static double getDistance(int x,int y,int x1,int y1) { //클래스 매서드
//		return Math.sqrt( ((x1-x)*(x1-x))+((y1-y)*(y1-y)) );
//	}

	public static void main(String[] args) {
		MyPoint p = new MyPoint(1,1);
		
		System.out.println(p.getDistance(2,2));

	}

}
