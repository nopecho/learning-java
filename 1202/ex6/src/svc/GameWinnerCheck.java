package svc;

import dto.Player;
import view.Main;

public class GameWinnerCheck {
    public Player gameEnd(int player1Sec,int player2Sec){
        int check1Sec = Math.abs(10-player1Sec);
        int check2Sec = Math.abs(10-player2Sec);

        if(check1Sec == check2Sec){
            return null;
        }else if(check1Sec > check2Sec){
            return Main.players[1];
        }else{
            return Main.players[0];
        }
    }

    public int playerSec(Player player){
        int playerSec = player.getOriTime()-player.getMyTime();
        if(playerSec>0) playerSec-=60;
        return Math.abs(playerSec);
    }
}
