package svc;

import ui.MemberUi;
import vo.Member;

public class MemberRegistService {

    public boolean registMember(Member newMember) throws Exception{
        boolean registSuccess=true;

        for(int i = 0; i< MemberUi.memberArray.length; i++) {
            if(MemberUi.memberArray[i].getId()==newMember.getId()) {
                registSuccess=false;
                break;
            }
        }
        if(registSuccess) {
            Member[] tempArray = MemberUi.memberArray;
            MemberUi.memberArray = new Member[MemberUi.memberArray.length+1];

            for(int i=0;i<tempArray.length;i++) {
                MemberUi.memberArray[i]=tempArray[i];
            }
            MemberUi.memberArray[MemberUi.memberArray.length-1]=newMember;
        }return registSuccess;
    }
}