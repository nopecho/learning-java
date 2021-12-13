package command;

import util.Util;
import vo.SuperCom;

public class runCommand implements Command{
    @Override
    public void response(SuperCom com) {
        Util.superComAllMsg(com);
        Util.comResultMsg(com.getResult());
        com.getMemory().clear();
        com.setResultOfName(null);
        com.setResult(null);
    }
}
