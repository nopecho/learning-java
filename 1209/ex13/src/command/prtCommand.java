package command;

import util.Util;
import vo.SuperCom;

public class prtCommand implements Command{
    @Override
    public void response(SuperCom com) {
        String command = Util.sc.next();
        String temp = Util.sc.next();

        String checkKey = Util.findMemoryKey(com,command);
        saveResult(com,checkKey);
    }
    public void saveResult(SuperCom com,String command){
        int result = Util.getMemoryValue(com,command);
        com.setResult(result);
        com.setResultOfName(command);
    }
}