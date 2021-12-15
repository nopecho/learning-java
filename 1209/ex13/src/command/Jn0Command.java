package command;

import util.Util;
import vo.Memory;
import vo.SuperCom;

public class Jn0Command implements Command {
    @Override
    public void response(SuperCom com) throws Exception {
        String commandKey = Util.sc.next();
        int commandLine = Util.sc.nextInt();

        Memory memory = new Memory();
        com.setMemory(memory);
        String changeKey = Util.findMemoryKey(com, commandKey);
        int checkVar = Util.getMemoryValue(com,changeKey);
        while(checkVar!=0){
            loopMemory(com, commandLine);
            checkVar = Util.getMemoryValue(com,changeKey);
        }
    }

    private void loopMemory(SuperCom com, int commandLine) {
        for (int i = commandLine; i < com.getMemory().size(); i++) {
            com.getMemory().get(i).update(com);
        }
    }
}