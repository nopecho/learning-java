package dao;

import dto.Time;
import svc.TimeSaveSvc;
import java.util.Scanner;

public class TimeSaveDao implements Dao {

    @Override
    public void execute(Scanner sc) {
        TimeSaveSvc timeSaveSvc = new TimeSaveSvc();
        Time time = new Time();
        timeSaveSvc.nowSeconds(time);
    }
}
