package svc;

import dto.Time;
import view.ConsoleMsg;
import view.Main;

public class TimeSaveSvc {
    public void nowSeconds(Time time){
        ConsoleMsg msg = new ConsoleMsg();
        msg.printNowSecMsg(time);
        Main.players[Main.timeCount].setOriTime(time.getNowSecond());
    }
}
