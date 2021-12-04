package svc;

import dto.Time;
import view.ConsoleMsg;
import view.Main;

public class AfterTimeSaveSvc {
    public void afterSeconds(Time time){
        ConsoleMsg msg = new ConsoleMsg();
        msg.printNowSecMsg(time);
        Main.players[Main.timeCount++].setMyTime(time.getNowSecond());
    }
}
