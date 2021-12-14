import java.io.FileReader;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        try{
            Scanner sc =  new Scanner(new FileReader("c:/Windows/system.ini"));
            int count = 1;
            while (sc.hasNext()){
                String line = sc.nextLine();
                System.out.println(count+": "+line);
                count++;
            }
        }catch (Exception e){
            System.out.println("실패");
        }
    }
}
