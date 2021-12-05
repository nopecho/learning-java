package dao;

import svc.ComPickSvc;
import svc.UserPickSvc;

import java.util.Scanner;

public class UserScissorsPickDao implements Dao {
    @Override
    public void execute(Scanner sc) {
        ComPickSvc comPick = new ComPickSvc();
        UserPickSvc pick = new UserPickSvc();
        pick.pickScissors();
        comPick.randPick();
    }
}
