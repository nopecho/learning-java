package server;

import java.io.*;
import java.net.*;
import java.util.*;

public class CalcServerEx {
    public static String calc(String exp) {
        StringTokenizer st = new StringTokenizer(exp, " ");
        if (st.countTokens() != 3) return "error";

        String res = "";
        int op1 = Integer.parseInt(st.nextToken());
        String del = st.nextToken();
        int op2 = Integer.parseInt(st.nextToken());
        switch (del) {
            case "+":
                res = Integer.toString(op1 + op2);
                break;
            case "-":
                res = Integer.toString(op1 - op2);
                break;
            case "*":
                res = Integer.toString(op1 * op2);
                break;
            default:
                res = "error";
        }
        return res;
    }

    public static void main(String[] args) {
        BufferedWriter out = null;
        BufferedReader in = null;
        ServerSocket listener = null;
        Socket socket = null;

        try {
            listener = new ServerSocket(9999);
            System.out.println("연결을 기다리고 있습니다.");
            socket = listener.accept();
            System.out.println("연결 완료");
            in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            out = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));

            while (true) {
                String inputMsg = in.readLine();
                if (inputMsg.equalsIgnoreCase("bye")) {
                    System.out.println("클라이언트에서 연결 종료");
                    break;
                }
                System.out.println(inputMsg);
                String res = calc(inputMsg);
                out.write(res + "\n");
                out.flush();
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        } finally {
            try {
                if (socket != null) socket.close();
                if (listener != null) listener.close();
            } catch (IOException e) {
                System.out.println("채팅중 오류 발생");
            }
        }
    }
}
