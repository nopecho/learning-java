package command;

import util.Util;
import vo.Memory;
import vo.SuperCom;

public class AddCommand implements Command {
    @Override
    public void response(SuperCom com) {
        String commandKey = Util.sc.next();
        String commandValue = Util.sc.next();

        String changeKey = Util.findMemoryKey(com,commandKey);
        if(changeKey == null) {
            Util.notFindKeyMsg(commandKey);
            return;
        }
        Memory memory = new Memory("add",changeKey,commandValue);
        memory.update(com);
        com.setMemory(memory);
    }
}
