
public class HelloApp {
	public static int sum(int n,  int m) { //method선언, 메소드 이름은 sum, 파라미터는 int n int m
		return n+m ; //sum 메소드의 반환값은 n+m
	}

	public static void main(String[] args) { //메인 method
		
		var i =20; //변수 선언(초기값)
		int s ;	//변수 선언
		char a; //변수 선언
		
		s=sum(i,10); //변수로 지정한 i, 10을 파라미터로 sum메소드 호출
		a='?';
		System.out.print(a);
		System.out.println("Hello");
		System.out.print(s);
	}

}