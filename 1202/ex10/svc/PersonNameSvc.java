package svc;

import dto.Person;

public class PersonNameSvc {
    public void personNameSet(Person persons, String name) {
        persons.setName(name);
    }
}
