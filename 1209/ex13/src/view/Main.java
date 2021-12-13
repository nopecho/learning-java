package view;

import command.*;
import controller.Controller;
import util.Util;
import vo.SuperCom;

public class Main {
    private final Controller controller = new Controller();

    public void run(){
        SuperCom superCom = new SuperCom();
        Command command;
        boolean game = true;
        Util.startMsg();
        while(game){
            command = null;
            Util.insertCommandMsg();
            String insertCommand = Util.sc.next();
            switch(insertCommand){
                case "mov":
                    command = new MovCommand(); break;
                case "add":
                    command = new AddCommand();  break;
                case "sub":
                    command = new SubCommand(); break;
                case "jn0":
                    command = new Jn0Command(); break;
                case "prt":
                    command = new prtCommand(); break;
                case "go":
                    command = new runCommand(); break;
                case "stop" :
                    Util.exitMsg();
                    game=false;
                    break;
                default :
                    Util.sc.nextLine();
                    Util.commandErrorMsg();
            }
           if(command!=null) controller.request(command,superCom);
        }
    }
}
