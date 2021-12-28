package ex3;

import java.net.*;
import java.io.*;
import java.util.*;

public class Server {
    public static void main(String[] args) {
        ServerSocket serverSocket;
        Socket socket = null;
        BufferedReader in = null;
        try {
            serverSocket = new ServerSocket(9999);
            System.out.println("연결 준비중..");
            socket = serverSocket.accept();
            System.out.println(socket.getInetAddress()+" 클라이언트 접속\n연결 성공");
            in = new BufferedReader(new InputStreamReader(socket.getInputStream()));

        } catch (IOException e) {
            System.out.println(e.getMessage());
        } finally {
            try {
                if(socket != null) socket.close();
            } catch (IOException e){
                System.out.println("연결 오류");
            }
        }
    }

    public static String clac(String input){
        StringTokenizer st = new StringTokenizer(input," ");
        if(st.countTokens() != 3) return "입력 오류";
        return null;
    }
}
