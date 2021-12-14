package ex8_2;

import javax.imageio.IIOException;
import java.io.*;

public class FileReadHangulSuccess {
    public static void main(String[] args) throws IOException {
        InputStreamReader in = null;
        FileInputStream fin = null;

        try{
           fin = new FileInputStream("d:/test.txt");
           in = new InputStreamReader(fin,"UTF-8");
           int c;
            System.out.println("인코딩 문자 집합은 "+in.getEncoding());
            while((c= in.read()) != -1){
                System.out.print((char) c);
            }
            in.close();
            fin.close();
        }catch (IIOException | UnsupportedEncodingException e ){
            System.out.println("입출력 오류");
        }
    }
}
