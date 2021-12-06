package dao;


import dto.Person;
import svc.WinnerCheckSvc;
import view.ConsoleMsg;
import view.MainUi;

import java.util.Scanner;

public class WinnerCheckDao implements Dao{
    @Override
    public void response(Scanner sc, ConsoleMsg msg) {
        WinnerCheckSvc checkSvc = new WinnerCheckSvc();
        Person person = MainUi.persons[MainUi.gameCount];
        if(checkSvc.checkWinner(person)){
            msg.successMsg(person);
            MainUi.game=false;
        }else{
            msg.failMsg();
        }
    }
}