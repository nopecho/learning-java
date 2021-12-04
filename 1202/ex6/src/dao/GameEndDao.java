package dao;

import java.util.Scanner;
import dto.Player;
import svc.GameWinnerCheck;
import view.*;


public class GameEndDao implements Dao {

    @Override
    public void execute(Scanner sc) {
        GameWinnerCheck check = new GameWinnerCheck();
        ConsoleMsg msg = new ConsoleMsg();
        int player1Sec = check.playerSec(Main.players[0]);
        int player2Sec = check.playerSec(Main.players[1]);

        Player winner = check.gameEnd(player1Sec, player2Sec);
        msg.printGameSetMsg(player1Sec, player2Sec, winner);
    }
}
