package controller;

import command.Command;
import vo.SuperCom;

public class Controller {
    public void request(Command command, SuperCom com){
        try{
            command.response(com);
        }catch (Exception e ){
            e.printStackTrace();
        }
    }
}
