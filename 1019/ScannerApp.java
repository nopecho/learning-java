import java.util.Scanner;

public class ScannerApp {

	public static void main(String[] args) {
		System.out.println("�̸�, ����, ����, ü��, ���ſ��θ� ��ĭ ���� �и��Ͽ� �Է��ϼ���.");
		Scanner input = new Scanner(System.in); //Scanner��� Ŭ������ ��ӹ޴� input�̶�� ��ü�� �����Ѵ�.
		
		String name = input.next(); //String������ Ÿ���� ���� name = input(ScannerŬ����)���� next()�޼ҵ� ȣ��
		System.out.print("�̸��� "+name+",");
		
		String city = input.next();
		System.out.print("��°��� "+city+",");
		
		int age = input.nextInt();
		System.out.print("���̴� "+age+"��, ");
		
		double weight = input.nextDouble();
		System.out.print("ü���� "+weight+"kg,");
		
		boolean isSingle = input.nextBoolean();
		if (isSingle) {
			System.out.println("ȥ�� ����ֽ��ϴ�.");
		}
		else {
			System.out.println("������ �ƴմϴ�.");
		}

		input.close();

	}

}
