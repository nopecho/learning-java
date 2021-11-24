package action;

import java.util.Scanner;
import util.ConsoleUtil;
import svc.MemberUpdateService;
import vo.Member;

public class MemberUpdateAction implements Action {

    @Override
    public void execute(Scanner sc) {
        ConsoleUtil consoleUtil = new ConsoleUtil();
        int id = consoleUtil.getId("수정할 ",sc);
        MemberUpdateService memberUpdateService = new MemberUpdateService();

        Member oldMember = memberUpdateService.getOldMember(id);
        Member newMember = consoleUtil.getNewMember(oldMember,sc);

        boolean updateSuccess = memberUpdateService.updateMember(newMember);
        if(updateSuccess) {
            consoleUtil.printUpdateSuccessMessage(newMember.getId());
        }else {
            consoleUtil.printUpdateFailMessage(newMember.getId());
        }
    }
}