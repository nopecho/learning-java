package action;

import java.util.Scanner;

import svc.MemberSearchService;
import util.ConsoleUtil;
import vo.Member;
import vo.SearchDate;

public class MemberSearchAction implements Action {
    @Override
    public void execute(Scanner scan) {
        ConsoleUtil consoleUtil = new ConsoleUtil();

        SearchDate searchData = consoleUtil.getSearchData(scan);
        MemberSearchService memberSearchService = new MemberSearchService();

        if (searchData.getSearchCondition().equals("아이디")) ;
        {
            Member member = memberSearchService.searchMemberById(searchData.getSearchValue());
            consoleUtil.printSearchMember(member);
        }
        if (searchData.getSearchCondition().equals("이름")) {
            Member[] memberArray = memberSearchService.searchMemberByName(searchData.getSearchValue());
            consoleUtil.printSearchMemberArray(memberArray);

        }
    }
}