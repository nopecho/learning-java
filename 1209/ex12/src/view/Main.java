package view;

import controller.Controller;
import dao.*;
import util.*;

public class Main {
    private final DB db = new DB();
    private final Controller controller = new Controller();

    public void run() {
        boolean game = true;
        Util.insertWord(db.getWords());
        Util.printStartMsg();
        while (game) {
            Dao dao = null;
            Util.printChoseMenuMsg();
            int menu = Util.sc.nextInt();
            switch (menu) {
                case 1:
                    dao = new TestWordDao(); break;
                case 2:
                    dao = new InsertWordDao(); break;
                case 3:
                    Util.printExitMsg();
                    game = false;
            }
            if (dao != null) controller.request(dao, db);
        }
    }
}
