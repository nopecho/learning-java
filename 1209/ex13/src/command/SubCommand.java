package command;

import util.Util;
import vo.Memory;
import vo.SuperCom;

public class SubCommand implements Command{
    @Override
    public void response(SuperCom com) throws Exception {
        String commandKey = Util.sc.next();
        String commandValue = Util.sc.next();

        String changeKey = Util.findMemoryKey(com, commandKey);
        Memory memory = new Memory("sub",changeKey,commandValue);
        memory.update(com);
        com.setMemory(memory);
    }
}