package ex8_2;

import javax.imageio.IIOException;
import java.io.*;

public class FileReadHangulFail {
    public static void main(String[] args) throws IOException {
        InputStreamReader in = null;
        FileInputStream fin = null;
        try{
            fin = new FileInputStream("d:/test.txt");
            in = new InputStreamReader(fin,"US-ASCII");
            int c;
            System.out.println("인코딩 문자 집한은 "+in.getEncoding());
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

