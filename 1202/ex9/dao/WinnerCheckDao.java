package dao;

import svc.WinnerCheckSvc;
import view.ConsoleMsg;

import java.util.Scanner;

public class WinnerCheckDao implements Dao {
    @Override
    public void execute(Scanner sc) {
        ConsoleMsg msg = new ConsoleMsg();
        WinnerCheckSvc winnerCheck = new WinnerCheckSvc();
        Object winner = winnerCheck.compare();
        msg.printGameResult(winner);
    }
}
