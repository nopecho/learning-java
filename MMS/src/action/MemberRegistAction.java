package action;

import java.util.Scanner;
import vo.Member;
import svc.MemberRegistService;
import util.ConsoleUtil;

public class MemberRegistAction implements Action {
	@Override
	public void execute(Scanner sc) throws Exception {
		try {
			ConsoleUtil consoleUtil = new ConsoleUtil();
			Member newMember = consoleUtil.getNewMember(sc);				
			MemberRegistService memberRegistService = new MemberRegistService();
			boolean registSuccess = memberRegistService.registMember(newMember);
			if(registSuccess) {
				consoleUtil.printRegistSuccessMessage(newMember.getId());
			}else {
				consoleUtil.printRegistFailMessage(newMember.getId());
			}					
		}catch(Exception e) {
			System.out.println("ID �� AGE�� ���ڸ� �Է��ϼ���");
			e.printStackTrace();
			throw new Exception();
		}
	}
}

