package dao;

import dto.Numbers;
import dto.Person;
import svc.GamePlaySvc;
import view.ConsoleMsg;
import view.MainUi;

import java.util.Scanner;

public class GamePlayDao implements Dao{
    @Override
    public void response(Scanner sc, ConsoleMsg msg) {
        GamePlaySvc playSvc = new GamePlaySvc();
        if (MainUi.gameCount == MainUi.persons.length) MainUi.gameCount=0;
        Person person = MainUi.persons[MainUi.gameCount];
        msg.continueGameMsg(person);
        sc.nextLine();
        Numbers numbers = new Numbers();
        playSvc.play(numbers,person,msg);
    }
}