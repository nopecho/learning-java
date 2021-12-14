import javax.imageio.IIOException;
import java.io.FileReader;

public class App {
    public static void main(String[] args) {
        try{
            FileReader fr = new FileReader("c:/Windows/system.ini");
            int c;
            while ((c=fr.read()) != -1){
                c=Character.toUpperCase(c);
                System.out.print((char) c);
            }
        }catch (Exception e){
            System.out.println("읽기 실패");
        }
    }
}
