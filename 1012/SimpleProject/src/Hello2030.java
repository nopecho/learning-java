/*
 자바 기본 구조
 1.프로젝트 폴더
-src/bin 폴더 생성
-src 폴더에는 .java파일 저장
-bin 폴더에는 .class파일 저장
 2.자바 프로그램이 실행 될땐 작성한 소스코드(.java)파일을 컴퓨터 언어인(.class)파일로 컴파일 후 JVM이 컴퓨터 언어(.class)파일을 해석해 프로그램을 실행시킨다.
 3.메소드 = 함수(기능)라고 생각한다.
 4.자바에서 클래스란? 해당 자바 프로그램을 실행시키기 위한 기본 개념, 모든 자바프로그램은 class를 기반으로 한다.
 */

public class Hello2030 {		

	public static void main(String[] args) {	//main메소드 = 자바 프로그램이 실행 될 때 반드시 main메소드 1개만 실행시킨다. 
		int n = 2030;	// int n 이라는 변수 생성 ;
		System.out.println("Hello "+n);
	}

}
