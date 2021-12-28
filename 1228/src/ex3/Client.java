package ex3;

import java.net.*;
import java.io.*;
import java.util.*;

public class Client {
    public static void main(String[] args) {
        Socket socket = null;
        try{
            socket = new Socket("localhost",9999);

        } catch (IOException e) {
            System.out.println(e.getMessage());
        } finally {

        }
    }
}
