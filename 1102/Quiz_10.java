import java.util.Scanner;

class Dic{
	private static String[] kor= {"���","�Ʊ�","��","�̷�","���"};
	private static String[] eng= {"love","baby","money","future","hope"};
	public static String kor2eng(String word) {
		for(int i=0;i<kor.length;i++) {
			if(word.equals(kor[i])) {
				return eng[i];
			}
		}return null;
	}
}

public class Quiz_10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("�ѿ� �ܾ� �˻� ���α׷� �Դϴ�.");
		while(true) {
			System.out.print("�ѱ� �ܾ� �Է� >>");
			String word = sc.next();
			if(word.equals("�׸�")) {
				System.out.println("�ܾ� �˻��� �����մϴ�.");
				break;
			}else if(Dic.kor2eng(word)==null) {
				System.out.println(word+"�� ���� ������ �����ϴ�.");				
			}else {
				System.out.println(word+"�� "+Dic.kor2eng(word)+" �Դϴ�.");
			}
		}sc.close();

	}

}
