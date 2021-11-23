package svc;

import ui.MemberUi;
import vo.Member;

public class MemberListService {
    public Member[] getMemberArray() {
        return MemberUi.memberArray;
    }
}