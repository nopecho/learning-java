package view;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while(true){
            System.out.print(">>");
            String string = sc.nextLine();
            if(string.equals("그만"))  {
                System.out.println("종료합니다.");
                break;
            }
            StringTokenizer st = new StringTokenizer(string," ");
            System.out.println("어절 개수 는 : "+st.countTokens());
        }

        while(true){
            System.out.println(">>");
            String string = sc.nextLine();
            if(string.equals("그만"))  {
                System.out.println("종료합니다.");
                break;
            }
            String[] count = string.split(" ");
            System.out.println("어절 개수는 : "+count.length);
        }
    }
}
