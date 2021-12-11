package util;

import vo.Member;

import java.util.HashMap;
import java.util.Map;

public class DB {
    private final Map<String, Member> db = new HashMap<>();

    public Map<String,Member> getDB(){
        return db;
    }
}
