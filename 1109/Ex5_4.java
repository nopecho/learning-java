class Person3{} //슈퍼 클래스
class Student3 extends Person3{} //Person3을 상속 받는 서브 클래스
class Researcher extends Person3{} //Person3을 상속 받는 서브 클래스
class Professor extends Researcher{} //Researcher을 상속 받는 서브 클래스


public class Ex5_4 {
	static void print(Person3 p) { //매개변수로 (Person3)타입의 레퍼런스 변수를 받음
		if(p instanceof Student3) { //p가 Student3의 객체인가?
			System.out.print("Student ");
		}
		if(p instanceof Researcher) { //p가 Researcher의 객체인가?
			System.out.print("Researcher ");
		}
		if(p instanceof Professor) { //p가 Professor의 객체인가?
			System.out.print("Professor ");
		}
		if(p instanceof Person3) { //p가 Person3의 객체인가?, 해당 메소드가 (Person3)타입을 매개변수로 받기 때문에 해당 if문은 무조건 true반환
			System.out.print("Person ");
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		System.out.print("new Student() ->\t");
		print(new Student3());
		System.out.print("new Researcher() ->\t");
		print(new Researcher());
		System.out.print("new Professor() ->\t");
		print(new Professor());
	}
}
