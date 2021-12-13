package command;

import util.Util;
import vo.SuperCom;

public class prtCommand implements Command{
    @Override
    public void response(SuperCom com) {
        String command = Util.sc.next();
        String temp = Util.sc.next();
        saveResult(com,command);
    }
    public void saveResult(SuperCom com,String command){
        int result = Util.findMemoryValue(com,command);
        com.setResult(result);
        com.setResultOfName(command);
    }
}
