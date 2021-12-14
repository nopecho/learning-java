package ex8_1;

import javax.imageio.IIOException;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderEx {
    public static void main(String[] args) {
        FileReader fin = null;
        try{
            fin = new FileReader("c:\\windows\\system.ini");
            int c;
            while ((c = fin.read()) != -1){
                System.out.println((char) c);
            }
        }catch (IIOException | FileNotFoundException e){
            System.out.println("입출력 오류");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
