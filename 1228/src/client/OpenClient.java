package client;

import java.io.*;
import java.net.*;
import java.util.*;

public class OpenClient {
    public static void main(String[] args) {
        Socket socket;
        try {
            socket = new Socket("localhost",9999);
            inputThread in = new inputThread(socket);
            in.start();
            outputThread out = new outputThread(socket);
            out.start();
            
        } catch (IOException e){
            System.out.println(e.getMessage());
        }
    }
}
class inputThread extends Thread{
    private final Socket socket;
    inputThread(Socket socket){
        this.socket = socket;
    }
    @Override
    public void run(){
        try {
            BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            while(true){
                if(Thread.currentThread().isInterrupted()) return;
                String inputMsg = in.readLine();
                System.out.println("서버 : "+inputMsg);
            }
        } catch (IOException e){
            System.out.println(e.getMessage());
        }
    }
}

class outputThread extends Thread{
    private final Scanner sc = new Scanner(System.in);
    private final Socket socket;
    outputThread(Socket socket){
        this.socket = socket;
    }
    @Override
    public void run(){
        try {
            BufferedWriter out = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
            while(true){
                sc.nextLine();
                System.out.print("보내기 >>");
                String outMsg = sc.nextLine();
                if(outMsg.equalsIgnoreCase("bye")){
                    out.write(outMsg+"\n");
                    out.flush();
                    break;
                }
                out.write(outMsg+"\n");
                out.flush();
            }
        }catch (IOException e){
            System.out.println(e.getMessage());
        }finally {
            try {
                if(socket != null) socket.close();
            } catch (IOException e){
                System.out.println("오류");
            }
        }
    }
}