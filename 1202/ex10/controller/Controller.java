package controller;

import dao.Dao;
import view.ConsoleMsg;
import java.util.Scanner;

public class Controller {
    public void request(Dao dao, Scanner sc, ConsoleMsg msg){
        dao.response(sc,msg);
    }
}