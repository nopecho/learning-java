package dto;

import java.util.Calendar;

public class Time {
    private final Calendar now = Calendar.getInstance();
    private final int nowSecond = now.get(Calendar.SECOND);

    public int getNowSecond(){
        return nowSecond;
    }
}