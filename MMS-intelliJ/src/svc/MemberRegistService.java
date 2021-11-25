package svc;

import util.MemberDB;
import vo.Member;

public class MemberRegistService {

    public boolean registMember(Member newMember, MemberDB DB) {
        boolean registSuccess = true;
        if (!DB.getDB().containsKey(newMember.getId())) { //containsKey():해당 HashMap에 파라미터로 받은 변수 키가 존재 하는지
            DB.getDB().put(newMember.getId(), newMember);
        } else {
            registSuccess = false;
        }
        return registSuccess;
    }
}