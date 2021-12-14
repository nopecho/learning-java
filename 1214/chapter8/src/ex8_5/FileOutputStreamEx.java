package ex8_5;

import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamEx {
    public static void main(String[] args) {
        byte[] b = {7,51,3,4,-1,24,97,15,4,9};
        
        try{
            FileOutputStream fout = new FileOutputStream("d:/test.txt");
            for(byte bt : b){
                fout.write(bt);
            }
            fout.close();
        }catch (IOException e ){
            System.out.println("저장 불가");
            return;
        }
        System.out.println("저장완료");
    
    }
}
