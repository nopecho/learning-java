package svc;

public class GameWinnerCheck {
    public boolean winnerCheck(int now, int after){
        int a=Math.abs(now-after);
        if(a>10){
            return true;
        }return false;
    }
}
