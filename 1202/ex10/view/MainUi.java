package view;

import controller.Controller;
import dao.*;
import dto.Person;

import java.util.Scanner;

public class MainUi {
    private final Controller controller = new Controller();
    private final ConsoleMsg msg = new ConsoleMsg();
    private final Scanner sc = new Scanner(System.in);
    public static Person[] persons;
    public static int gameCount=0;
    public static boolean game = true;
    private Dao dao;

    public void run(){
        msg.aFewPersonMsg();
        dao = new PersonSettingDao();
        controller.request(dao,sc,msg);
        dao = new PersonNameDao();
        controller.request(dao,sc,msg);
        sc.nextLine();
        while(game){
            dao = new GamePlayDao();
            controller.request(dao,sc,msg);
            dao = new WinnerCheckDao();
            controller.request(dao,sc,msg);
            gameCount++;
        }
    }
}