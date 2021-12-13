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
        Integer changeValue = Util.castingValue(com,commandValue);

        Memory memory = new Memory("add",changeKey,changeValue);
        memory.update(com);
        com.setMemory(memory);
    }
}
