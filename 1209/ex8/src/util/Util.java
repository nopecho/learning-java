package util;

import vo.Member;

import java.util.Scanner;

public class Util {
    private static final Scanner sc = new Scanner(System.in);

    public static boolean insertInfo(DB db){
        System.out.print("회원이름 포인트 >>");
        String insert = sc.nextLine();
        if(insert.equals("그만")) return false;
        String[] info = insert.split(" ");
        Member member = new Member();
        member.setName(info[0]);
        member.setPoint(Integer.parseInt(info[1]));
        if (db.getDB().containsKey(info[0])) {
            member.setPoint(db.getDB().get(info[0]).getPoint() + Integer.parseInt(info[1]));
        }
        db.getDB().put(info[0],member);
        return true;
    }

    public static void showMember(DB db){
        for(Member member : db.getDB().values()){
            System.out.print(member+" ");
        }
        System.out.println();
    }
}
