package server;

import java.io.*;
import java.net.*;
import java.util.*;

public class OpenServer {
    public static void main(String[] args) {
        ServerSocket listener = null;
        Socket socket = null;
        try{
            listener = new ServerSocket(9999);
            System.out.println("연결 준비중...");
            socket = listener.accept();
            System.out.println("<연결 성공>");
            inputThread in = new inputThread(socket);
            in.start();
            outputThread out = new outputThread(socket);
            out.start();
        }catch (IOException e ){
            System.out.println(e.getMessage());
        }
    }
}

class inputThread extends Thread{
    private final Socket socket;
    inputThread(Socket socket){
        this.socket=socket;
    }
    @Override
    public void run(){
        try {
            BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            while(true){
                String inputMsg = in.readLine();
                if(inputMsg.equalsIgnoreCase("bye")){
                    System.out.println("<연결 종료>");
                    Thread.currentThread().interrupt();
                    return;
                }
                System.out.println("클라이언트 : "+inputMsg);
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}

class outputThread extends Thread{
    private final Scanner sc = new Scanner(System.in);
    private final Socket socket;
    outputThread(Socket socket){
        this.socket=socket;
    }
    @Override
    public void run(){
        try {
            BufferedWriter out = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
            while (true){
                if(Thread.currentThread().isInterrupted()) return;
                System.out.print("보내기 >>");
                String outMsg = sc.nextLine();
                out.write(outMsg+"\n");
                out.flush();
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
