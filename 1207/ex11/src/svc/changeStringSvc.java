package svc;

import view.MainUi;

public class changeStringSvc {

    public boolean changeString(String command) {
        String[] commandString = command.split("!");
        String[] originString = new String(MainUi.sb).split(" ");
        for (String change : originString) {
            int index = MainUi.sb.indexOf(change);
            if (change.equals(commandString[0])) {
                MainUi.sb.replace(index, index + change.length(), commandString[1]);
                return true;
            }
        }return false;
    }

    public boolean findCommand(String command) {
        String[] commandString = command.split("!");
        return command.contains("!") && commandString.length > 1;
    }
}
