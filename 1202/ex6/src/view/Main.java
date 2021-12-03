package view;

import dto.*;
import controller.*;

public class Main {
    public static void main(String[] args) {
        ConsoleMsg msg = new ConsoleMsg();
        Time now = new Time();
        msg.printNowSecMsg(now);
    }
}
