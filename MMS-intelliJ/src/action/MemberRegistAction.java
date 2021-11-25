package action;

import java.util.Scanner;

import util.MemberDB;
import vo.Member;
import svc.MemberRegistService;
import util.ConsoleUtil;

public class MemberRegistAction implements Action {
    @Override
    public void execute(Scanner sc, MemberDB DB) throws Exception {
        ConsoleUtil consoleUtil = new ConsoleUtil();
        Member newMember = consoleUtil.getNewMember(sc);
        MemberRegistService memberRegistService = new MemberRegistService();
        boolean registSuccess = memberRegistService.registMember(newMember,DB);
        consoleUtil.printRegistMessage(newMember.getId(),registSuccess);
    }
}