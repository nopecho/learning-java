package ex3;

import java.net.*;
import java.io.*;
import java.util.*;

public class Client {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Socket socket = null;
        BufferedWriter out = null;
        BufferedReader in = null;

        try{
            socket = new Socket("localhost",9999);
            in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            out = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));

            while(true){
                System.out.print(">>>");
                String outMsg = sc.nextLine();
                if(outMsg.equalsIgnoreCase("bye")){
                    out.write(outMsg);
                    out.flush();
                    break;
                }
                out.write(outMsg+"\n");
                out.flush();
                String inputMsg = in.readLine();
                System.out.println("결과 : "+inputMsg);
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }finally {
            try {
                sc.close();
                if(socket != null) socket.close();
            } catch (IOException e){
                System.out.println("접속 오류");
            }
        }
    }
}

