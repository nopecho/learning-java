package command;

import util.Util;
import vo.*;
import vo.SuperCom;

public class MovCommand implements Command{
    @Override
    public void response(SuperCom com) {
        String key = Util.sc.next();
        Integer value = Util.sc.nextInt();

        Memory memory = new Memory();
        memory.setMemoryAddr(key,value);
        com.setMemory(memory);
    }
}
