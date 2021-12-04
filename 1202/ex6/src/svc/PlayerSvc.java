package svc;

import dto.Player;
import view.Main;

public class PlayerSvc {
    public void playerSetting(Player player, String playerName) {
        player.setName(playerName);
        Main.players[Main.playerCount++] = player;
    }
}
