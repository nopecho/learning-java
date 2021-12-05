package dao;

import java.util.Scanner;

import dto.Person;
import svc.PersonSettingSvc;
import view.*;

public class PersonSettingDao implements Dao{
    @Override
    public void response() {
        PersonSettingSvc settingSvc = new PersonSettingSvc();
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        MainUi.persons = new Person[num];
    }
}
