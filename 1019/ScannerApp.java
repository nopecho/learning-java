import java.util.Scanner;

public class ScannerApp {

	public static void main(String[] args) {
		System.out.println("이름, 도시, 나이, 체중, 독신여부를 빈칸 으로 분리하여 입력하세요.");
		Scanner input = new Scanner(System.in); //Scanner라는 클래스를 상속받는 input이라는 객체를 생성한다.
		
		String name = input.next(); //String데이터 타입의 변수 name = input(Scanner클래스)안의 next()메소드 호출
		System.out.print("이름은 "+name+",");
		
		String city = input.next();
		System.out.print("사는곳은 "+city+",");
		
		int age = input.nextInt();
		System.out.print("나이는 "+age+"세, ");
		
		double weight = input.nextDouble();
		System.out.print("체중은 "+weight+"kg,");
		
		boolean isSingle = input.nextBoolean();
		if (isSingle) {
			System.out.println("혼자 살고있습니다.");
		}
		else {
			System.out.println("독신이 아닙니다.");
		}

		input.close();

	}

}
