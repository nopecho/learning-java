package controller;

import java.util.Scanner;

import action.Action;

public class MemberController {
    public void processRequest(Scanner sc, Action action) {
        try {
            action.execute(sc);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
