package svc;

import vo.Member;
import ui.MemberUi;

public class MemberSearchService {
    public Member searchMemberById(String searchValue) {
        Member member = null;

        for(int i = 0; i< MemberUi.memberArray.length; i++) {
            if(MemberUi.memberArray[i].getId()==Integer.parseInt(searchValue)) {
                member = MemberUi.memberArray[i];
                break;
            }
        }
        return member;
    }

    public Member[] searchMemberByName(String searchValue) {
        Member[] searchMemberArray = null;
        Member[] tempArray = new Member[MemberUi.memberArray.length];
        int count=0;

        for(int i = 0; i< MemberUi.memberArray.length; i++) {
            if(searchValue.equals(MemberUi.memberArray[i].getName())){
                tempArray[count++]= MemberUi.memberArray[i];
            }
        }

        searchMemberArray = new Member[count];

        for(int i=0;i<count;i++) {
            searchMemberArray[i]=tempArray[i];
        }
        return searchMemberArray;
    }
}