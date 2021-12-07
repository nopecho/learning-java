package view;

import java.util.Scanner;
import svc.changeStringSvc;

public class MainUi {
    public static StringBuffer sb = new StringBuffer();
    private final Scanner sc = new Scanner(System.in);
    private final ConsoleMsg msg = new ConsoleMsg();
    private final changeStringSvc changeSvc = new changeStringSvc();

    public void run() {
        msg.startMsg();
        String insertString = sc.nextLine();
        sb.append(insertString);
        msg.printString(sb);
        while (true) {
            msg.callCommandMsg();
            String command = sc.next();
            if (command.equals("그만")) {
                msg.exitProgramMsg();
                break;
            }
            if (!changeSvc.findCommand(command)) {
                msg.invalidCommandMsg();
            } else if (changeSvc.changeString(command)) {
                msg.printString(sb);
            } else {
                msg.notFindStringMsg();
            }
        }
    }
}
