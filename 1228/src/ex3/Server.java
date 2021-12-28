package ex3;

import java.net.*;
import java.io.*;
import java.util.*;

public class Server {
    public static void main(String[] args) {
        ServerSocket serverSocket;
        try {
            serverSocket = new ServerSocket(9999);
            System.out.println("연결 준비중..");
            Thread th = new Thread(new socketRunnable(serverSocket));
            th.start();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    public static String clac(String input) {
        StringTokenizer st = new StringTokenizer(input, " ");
        String result = "";

        if (st.countTokens() != 3) result = "입력 오류";

        int op1 = Integer.parseInt(st.nextToken());
        String del = st.nextToken();
        int op2 = Integer.parseInt(st.nextToken());

        switch (del) {
            case "+":
                result = Integer.toString(op1 + op2);
                break;
            case "-":
                result = Integer.toString(op1 - op2);
                break;
            case "*":
                result = Integer.toString(op1 * op2);
                break;
            default:
                result = "입력 오류";
        }
        return result;
    }
}

class socketRunnable implements Runnable {
    private final ServerSocket serverSocket;
    private Socket socket;

    socketRunnable(ServerSocket serverSocket) {
        this.serverSocket = serverSocket;
    }
    @Override
    public void run() {
        try {
            socket = serverSocket.accept();
            System.out.println(socket.getInetAddress() + " 클라이언트 접속\n연결 성공");
            BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            BufferedWriter out = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
            while (true) {
                String inputMsg = in.readLine();
                if (inputMsg.equalsIgnoreCase("bye")) {
                    System.out.println(socket.getInetAddress() + " <연결 종료>");
                    break;
                }
                String result = Server.clac(inputMsg);
                System.out.println(inputMsg+" = "+result+"\n");
                out.write(result+"\n");
                out.flush();
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        } finally {
            try{
                if(socket != null) socket.close();
            }catch (IOException e){
                System.out.println("연결 오류 !");
            }
        }
    }
}
