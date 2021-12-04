package dao;

import java.util.Scanner;
import dto.Player;
import svc.*;

public class PlayerDao implements Dao {

    @Override
    public void execute(Scanner sc) {
        Player player = new Player();
        PlayerSvc playerSvc = new PlayerSvc();
        String playerName = sc.next();
        playerSvc.playerSetting(player, playerName);
    }
}
