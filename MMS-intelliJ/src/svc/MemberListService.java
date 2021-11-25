package svc;

import util.MemberDB;

public class MemberListService {
    public boolean listMember(MemberDB DB) {
        boolean listSuccess = true;
        if (DB.getDB().isEmpty()) {
            listSuccess = false;
        }
        return listSuccess;
    }
}