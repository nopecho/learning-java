package controller;

import java.util.Scanner;

import dao.Dao;

public class Contoller {
    public void request(Scanner sc, Dao dao) {
        dao.execute(sc);
    }
}
