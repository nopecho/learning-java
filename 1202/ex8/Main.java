import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("문자열을 입력하세요.");
        String string = sc.nextLine();
        for (int i = 1; i < string.length(); i++) {
            System.out.print(string.substring(i));
            System.out.println(string.substring(0, i));
        }
        sc.close();
    }
}
