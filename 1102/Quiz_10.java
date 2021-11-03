import java.util.Scanner;

class Dic{
	private static String[] kor= {"사랑","아기","돈","미래","희망"};
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
		System.out.println("한영 단어 검색 프로그램 입니다.");
		while(true) {
			System.out.print("한글 단어 입력 >>");
			String word = sc.next();
			if(word.equals("그만")) {
				System.out.println("단어 검색을 종료합니다.");
				break;
			}else if(Dic.kor2eng(word)==null) {
				System.out.println(word+"는 저의 사전에 없습니다.");				
			}else {
				System.out.println(word+"는 "+Dic.kor2eng(word)+" 입니다.");
			}
		}sc.close();

	}

}
