import java.io.FileReader;
import java.io.IOException;

public class App {
    public static void main(String[] args) {
        try{
            System.out.println("d:/java/ex1.txt를 출력합니다.");
            FileReader fr = new FileReader("d:/java/ex1.txt");
            int c;
            while((c=fr.read()) != -1){
                System.out.print((char) c);
            }
        }catch (IOException e){
            System.out.println("실패");
        }
        
    }
}
