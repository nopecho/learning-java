package dao;

import dto.Time;
import svc.AfterTimeSaveSvc;
import java.util.Scanner;

public class AfterTimeSaveDao extends TimeSaveDao {

    @Override
    public void execute(Scanner sc) {
        AfterTimeSaveSvc timeSaveSvc = new AfterTimeSaveSvc();
        Time time = new Time();
        timeSaveSvc.afterSeconds(time);
    }
}
