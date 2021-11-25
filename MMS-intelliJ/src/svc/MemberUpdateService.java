package svc;

import ui.MemberUi;
import vo.Member;

public class MemberUpdateService {
    public Member getOldMember(int id) {
        Member oldMember = null;
        for (int i = 0; i < MemberUi.memberArray.length; i++) {
            if (MemberUi.memberArray[i].getId() == id) {
                oldMember = MemberUi.memberArray[i];
                break;
            }
        }
        return oldMember;
    }

    public boolean updateMember(Member newMember) {
        boolean updateSuccess = false;

        for (int i = 0; i < MemberUi.memberArray.length; i++) {
            if (MemberUi.memberArray[i].getId() == newMember.getId()) {
                MemberUi.memberArray[i] = newMember;
                updateSuccess = true;
                break;
            }
        }
        return updateSuccess;
    }
}