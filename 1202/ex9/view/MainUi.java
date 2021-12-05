package view;

import controller.Controller;
import dao.*;
import dto.*;

import java.util.Scanner;

public class MainUi {
    private final Scanner sc = new Scanner(System.in);
    private final Controller controller = new Controller();
    public static final Spr SPR = new Spr();
    public static User user = new User();
    public static Com com = new Com();
    private boolean gameContinue = true;
    private Dao dao;

    public void run() {
        ConsoleMsg consoleMsg = new ConsoleMsg();
        consoleMsg.printUserSettingMsg();
        dao = new UserSettingDao();
        controller.request(dao,sc);

        while (gameContinue) {
            dao = null;
            consoleMsg.printUserPick(user);
            pickUi();
            if(dao!=null){
                controller.request(dao,sc);
                consoleMsg.printComparison(user,com);
                dao = new WinnerCheckDao();
                controller.request(dao,sc);
            }
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
                dao = null;
                System.out.println("게임을 종료 합니다.");
                gameContinue = false;
                break;
        }
    }
}
