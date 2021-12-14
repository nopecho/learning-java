package ex8_3;

import javax.imageio.IIOException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileWriterEx {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        FileWriter fw = null;
        int c;
        try{
            fw = new FileWriter("d:/test.txt");
            while(true){
                String line = sc.nextLine();
                if(line.length() == 0) break;
                fw.write(line,0,line.length());
                fw.write("\r\n",0,2);
            }
            fw.close();
        }catch (IIOException e ){
            System.out.println("입출력 오류");
        }
        sc.close();
    }
}
