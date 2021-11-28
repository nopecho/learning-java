package util;

import vo.Member;

import java.util.HashMap;

public class MemberDB {
	private final HashMap<Integer, Member> DB = new HashMap<>();

	public HashMap<Integer, Member> getDB() {
		return DB;
	}
}