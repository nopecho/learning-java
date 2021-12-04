package view;

import dao.*;
import controller.*;
import dto.Player;
import java.util.Scanner;

public class Main {
    private static final int MAX_PLAYER_NUM = 2;
    public static int playerCount = 0;
    public static int timeCount = 0;
    public static Player[] players = new Player[MAX_PLAYER_NUM];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ConsoleMsg msg = new ConsoleMsg();
        Contoller contoller = new Contoller();
        Dao playerDao = new PlayerDao();
        Dao timeDao = new TimeSaveDao();
        Dao afterTimeDao = new AfterTimeSaveDao();
        Dao gameEnd = new GameEndDao();

        msg.printStartMsg();
        for (int i = 0; i < MAX_PLAYER_NUM; i++) {
            msg.printSetGamePlayerMsg();
            contoller.request(sc, playerDao);
        }
        sc.nextLine();
        for (Player player : players) {
            msg.printGameContinueMsg(player);
            sc.nextLine();
            contoller.request(sc, timeDao);
            msg.printTenSecAfterMsg(player);
            sc.nextLine();
            contoller.request(sc, afterTimeDao);
        }
        contoller.request(sc, gameEnd);
    }
}