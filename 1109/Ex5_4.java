class Person3{} //���� Ŭ����
class Student3 extends Person3{} //Person3�� ��� �޴� ���� Ŭ����
class Researcher extends Person3{} //Person3�� ��� �޴� ���� Ŭ����
class Professor extends Researcher{} //Researcher�� ��� �޴� ���� Ŭ����


public class Ex5_4 {
	static void print(Person3 p) { //�Ű������� (Person3)Ÿ���� ���۷��� ������ ����
		if(p instanceof Student3) { //p�� Student3�� ��ü�ΰ�?
			System.out.print("Student ");
		}
		if(p instanceof Researcher) { //p�� Researcher�� ��ü�ΰ�?
			System.out.print("Researcher ");
		}
		if(p instanceof Professor) { //p�� Professor�� ��ü�ΰ�?
			System.out.print("Professor ");
		}
		if(p instanceof Person3) { //p�� Person3�� ��ü�ΰ�?, �ش� �޼ҵ尡 (Person3)Ÿ���� �Ű������� �ޱ� ������ �ش� if���� ������ true��ȯ
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
