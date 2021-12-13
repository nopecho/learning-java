package command;

import util.Util;
import vo.SuperCom;

public class runCommand implements Command{
    @Override
    public void response(SuperCom com) {
        Util.printComAllMemory(com);
        Util.printComResult(com.getResult());
        com.getMemory().clear();
        com.setResultOfName(null);
        com.setResult(null);
    }
}
