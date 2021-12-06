package dao;

import java.util.Scanner;
import svc.PersonSettingSvc;
import view.ConsoleMsg;

public class PersonSettingDao implements Dao{
    @Override
    public void response(Scanner sc, ConsoleMsg msg) {
        PersonSettingSvc settingSvc = new PersonSettingSvc();
        int num = sc.nextInt();
        settingSvc.setPerson(num);
    }
}