
public class Quiz_6_22 {
	static boolean isNumber (String str) {
		for (int i=0; i<str.length()-1;i++) {
			int a = str.charAt(i);
			if(a>47 && a<59) {
				continue;
			}
			else{
				return false;
			}
		}return true;
	}
	public static void main(String[] args) {
		String str="123";
		System.out.println(str+"�� �����ϱ��?? "+isNumber(str));
		
		str="1234ojjdd";
		System.out.println(str+"�� �����ϱ��?? "+isNumber(str));
	}

}
