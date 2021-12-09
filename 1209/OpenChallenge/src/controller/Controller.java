package controller;

import dao.Dao;
import java.util.Scanner;

public class Controller {
    public void request(Dao dao, Scanner sc){
        dao.response(sc);
    }
}
