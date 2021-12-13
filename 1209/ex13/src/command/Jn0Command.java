package command;

import util.Util;
import vo.Memory;
import vo.SuperCom;

public class Jn0Command implements Command {
    @Override
    public void response(SuperCom com) {
        String commandKey = Util.sc.next();
        int commanLine = Util.sc.nextInt();

        Memory memory = new Memory();
        com.setMemory(memory);
        String changeKey = Util.findMemoryKey(com, commandKey);
        int check = Util.findMemoryValue(com,changeKey);
        while(check!=0){
            loopMemory(com, commanLine);
            check = Util.findMemoryValue(com,changeKey);
        }
    }

    private void loopMemory(SuperCom com, int num) {
        for (int i = num; i < com.getMemory().size(); i++) {
            com.getMemory().get(i).update(com);
        }
    }
}
