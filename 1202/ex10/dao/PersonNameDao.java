package dao;

import dto.Person;
import svc.PersonNameSvc;
import view.ConsoleMsg;
import view.MainUi;

import java.util.Scanner;

public class PersonNameDao implements Dao {

    @Override
    public void response(Scanner sc, ConsoleMsg msg) {
        PersonNameSvc nameSvc = new PersonNameSvc();
        for (int i = 0; i < MainUi.persons.length; i++) {
            msg.insertNameMsg(i + 1);
            String name = sc.next();
            MainUi.persons[i] = new Person();
            nameSvc.personNameSet(MainUi.persons[i], name);
        }
    }
}
