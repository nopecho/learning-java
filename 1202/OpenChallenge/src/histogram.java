
import java.util.Scanner;
public class histogram {
    String readString(){
        StringBuffer sb = new StringBuffer();
        Scanner sc = new Scanner(System.in);
        while (true){
            String line = sc.nextLine();
            if(line.equals(";")) {
                break;
            }sb.append(line);
        }return sb.toString();
    }

    void run(){
        System.out.println("영문 텍스르를 입력하고 세미콜론을 입력하세요.");
        String insert = readString();
        System.out.println("히스토그램을 그립니다.");
        int count = 0 ;
        for(int i = 65;i<91;i++){
            String k = String.valueOf( (char) i );
            StringBuffer sb = new StringBuffer();
            for(int j=0;j<insert.length();j++){
                char[] arr = insert.toCharArray();
                if(String.valueOf(arr[j]).equals(k) || String.valueOf(arr[j]).equals(k.toLowerCase()) ){
                    sb.append("-");
                    count++;
                }
            }
            System.out.println(k+sb+" ("+count+"개)");
            count=0;
        }
    }
}
