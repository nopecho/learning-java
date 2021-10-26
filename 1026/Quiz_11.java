
public class Quiz_11 {

	public static void main(String[] args) {
		int result=0;
		for (int i = 0;i<args.length;i++) {
			result=Integer.parseInt(args[i]);
			result+=result;
		}System.out.println(result/3);
	}
}
