package svc;

import vo.Member;

public class MemberListService {
	public Member[] getMemberArray() {
		return ui.MemberUI.memberArray;
	}
}
