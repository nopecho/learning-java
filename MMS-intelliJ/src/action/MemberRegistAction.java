package action;

import java.util.Scanner;
import vo.Member;
import svc.MemberRegistService;
import util.ConsoleUtil;

public class MemberRegistAction implements Action {
    @Override
    public void execute(Scanner sc) throws Exception {
        ConsoleUtil consoleUtil = new ConsoleUtil();
        Member newMember = consoleUtil.getNewMember(sc);
        MemberRegistService memberRegistService = new MemberRegistService();
        boolean registSuccess = memberRegistService.registMember(newMember);
        consoleUtil.printRegistMessage(newMember.getId(),registSuccess);
    }
}