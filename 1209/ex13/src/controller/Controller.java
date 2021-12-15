package controller;

import command.Command;
import util.Util;
import vo.SuperCom;

import java.util.InputMismatchException;

public class Controller {
    public void request(Command command, SuperCom com){
        try{
            command.response(com);
        }catch (Exception e ){
            if(e instanceof InputMismatchException){
                Util.sc.nextLine();
                System.out.println("변수는 숫자만 가능");
            }else if(e instanceof NullPointerException){
                Util.sc.nextLine();
                Util.notFindKeyMsg();
            }
        }
    }
}