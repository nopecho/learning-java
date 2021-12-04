package view;

import controller.Controller;
import dao.*;

import java.util.Scanner;

public class MainUi {
    private final Scanner sc = new Scanner(System.in);
    private final Controller controller = new Controller();
    private boolean gameContinue = true;
    private Dao dao = null;

    public void run() {
        ConsoleMsg consoleMsg = new ConsoleMsg();
        consoleMsg.printUserSettingMsg();
        String name = sc.next();
        dao = new UserSettingDao();
        controller.request(dao);
        while (gameContinue) {
            pickUi();
            if (dao != null) controller.request(dao);
        }
    }

    public void pickUi() {
        int pick = sc.nextInt();
        switch (pick) {
            case 1:
                dao = new UserScissorsPickDao();
                break;
            case 2:
                dao = new UserRockPickDao();
                break;
            case 3:
                dao = new UserPaperPickDao();
                break;
            case 4:
                gameContinue = false;
                break;
        }
    }
}
