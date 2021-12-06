package svc;

import dto.Person;
import view.MainUi;

public class PersonSettingSvc {
    public void setPerson(int num){
        MainUi.persons = new Person[num];
    }
}