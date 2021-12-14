
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        FileWriter fw = null;

        System.out.println("전화 번호 입력 프로그램");
        try{
            fw = new FileWriter("d:/java/ex1.txt");
            while(true){
                System.out.print("이름 전화번호 >>");
                String phoneBook = sc.nextLine();
                if(phoneBook.equals("그만")) break;
                fw.write(phoneBook);
                fw.write("\r\n");
            }
            fw.close();
            System.out.println("저장 완료");
        }catch(IOException e){
            System.out.println("저장 실패");
        }
    }
}
