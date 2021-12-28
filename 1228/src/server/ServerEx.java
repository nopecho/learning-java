package server;

import java.io.*;
import java.net.*;
import java.util.*;

public class ServerEx {
    public static void main(String[] args) {
        BufferedReader in = null;
        BufferedWriter out = null;
        ServerSocket listener = null;
        Socket socket = null;
        Scanner sc = new Scanner(System.in);

        try {
            listener = new ServerSocket(9999);
            System.out.println("연결 대기");
            socket = listener.accept();
            System.out.println("연결 완료");
            in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            out = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
            while (true) {
                String inputMessage = in.readLine();
                if (inputMessage.equalsIgnoreCase("bye")) {
                    System.out.println("연결 종료");
                    break;
                }
                System.out.println("클라이언트 : " + inputMessage);
                System.out.print("보내기 >>");
                String outMessage = sc.nextLine();
                out.write(outMessage + "\n");
                out.flush();
            }

        } catch (IOException e) {
            System.out.println(e.getMessage());
        } finally {
            try{
                sc.close();
                socket.close();
                listener.close();
            } catch (IOException e){
                System.out.println("채팅중 오류");
            }
        }
    }
}
