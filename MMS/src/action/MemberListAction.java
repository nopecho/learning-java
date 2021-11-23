package action;

import java.util.Scanner;
import vo.Member;
import svc.MemberListService;
import util.ConsoleUtil;

public class MemberListAction implements Action {

	@Override
	public void execute(Scanner sc) throws Exception {
		ConsoleUtil consoleUtil = new ConsoleUtil();
		MemberListService memberListService = new MemberListService();
		
		Member[] memberArray=memberListService.getMemberArray();
		consoleUtil.printMemberList(memberArray);
	}
}
