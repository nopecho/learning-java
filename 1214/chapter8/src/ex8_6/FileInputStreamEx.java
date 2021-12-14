package ex8_6;

import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStreamEx {
    public static void main(String[] args) {
        byte[] b = new byte[10];
        try{
            FileInputStream fin = new FileInputStream("d:/test.txt");
            int n =0,c;
            while((c=fin.read())!=-1){
                b[n] = (byte)c;
                n++;
            }
            System.out.println("읽은 배열 출력");
            for(byte bt : b){
                System.out.print(bt+" ");
            }
            System.out.println();
            fin.close();
        }catch (IOException e ){
            System.out.println("실패");
        }
    }
}
