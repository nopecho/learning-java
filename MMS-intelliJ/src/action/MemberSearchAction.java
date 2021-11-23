package action;

import java.util.Scanner;
import util.ConsoleUtil;
import vo.Member;
import vo.SearchData;
import svc.MemberSearchService;

public class MemberSearchAction implements Action {
    @Override
    public void execute(Scanner sc) {
        ConsoleUtil consoleUtil = new ConsoleUtil();

        SearchData searchData = consoleUtil.getSearchData(sc);
        MemberSearchService memberSearchService = new MemberSearchService();

        if(searchData.getSearchCondition().equals("아이디")) {
            Member member = memberSearchService.searchMemberById(searchData.getSearchValue());
            consoleUtil.printSearchMember(member);
        }
        else if(searchData.getSearchCondition().equals("이름")) {
            Member[] memberArray = memberSearchService.searchMemberByName(searchData.getSearchValue());
            consoleUtil.printSearchMemberArray(memberArray);
        }
    }
}