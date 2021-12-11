package view;

import util.DB;
import util.Util;

public class Main {
    public void run() {
        DB db = new DB();
        Util.printStartMsg();
        Util.insertInfo(db);
        double standardScore = Util.standardScoreSetting();
        Util.checkScore(db, standardScore);
    }
}
