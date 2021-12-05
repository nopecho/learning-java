package dao;

import svc.ComPickSvc;
import svc.UserPickSvc;

import java.util.Scanner;

public class UserPaperPickDao implements Dao {
    @Override
    public void execute(Scanner sc) {
        ComPickSvc comPick = new ComPickSvc();
        UserPickSvc pick = new UserPickSvc();
        pick.pickPaper();
        comPick.randPick();
    }
}
