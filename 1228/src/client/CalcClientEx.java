package client;

import java.io.*;
import java.net.*;
import java.util.*;

public class CalcClientEx {
    public static void main(String[] args) {
        BufferedWriter out = null;
        BufferedReader in = null;
        Socket socket = null;
        Scanner sc = new Scanner(System.in);
        try{
            socket = new Socket("localhost",9999);
            in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            out = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));

            while(true){
                System.out.print("계산식 입력(ex. 3 + 8) >>");
                String outputMsg = sc.nextLine();
                if(outputMsg.equalsIgnoreCase("bye")){
                    out.write(outputMsg);
                    out.flush();
                    break;
                }
                out.write(outputMsg+"\n");
                out.flush();
                String inputMsg = in.readLine();
                System.out.println("계산 결과 : "+inputMsg);
            }
        }catch (IOException e){
            System.out.println(e.getMessage());
        } finally {
            try{
                sc.close();
                if(socket !=null) socket.close();
            }catch (IOException e){
                System.out.println("서버와 채팅중 오류");
            }
        }
    }
}
