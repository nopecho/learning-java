package action;

import java.util.Scanner;
import util.ConsoleUtil;
import svc.MemberDeleteService;

public class MemberDeleteAction implements Action{

    @Override
    public void execute(Scanner sc) throws Exception {
        ConsoleUtil consoleUtil = new ConsoleUtil();
        int id = consoleUtil.getId("삭제할", sc);
        MemberDeleteService memberDeleteService = new MemberDeleteService();

        boolean deleteSuccess = memberDeleteService.deleteMember(id);

        if(deleteSuccess) {
            consoleUtil.printDeleteSuccessMessage(id);
        }else {
            consoleUtil.printDeleteFailMessage(id);
        }
    }
}