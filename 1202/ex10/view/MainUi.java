package view;

import controller.Controller;
import dao.Dao;
import dao.PersonSettingDao;
import dto.Person;

public class MainUi {
    private final Controller controller = new Controller();
    private final ConsoleMsg msg = new ConsoleMsg();
    public static Person[] persons;

    public void run(){
        msg.aFewPersonMsg();
        Dao dao = new PersonSettingDao();
        controller.request(dao);
    }
}
