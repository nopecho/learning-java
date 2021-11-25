package util;

import vo.Member;
import vo.SearchData;
import java.util.*;

public class ConsoleUtil {
    private final InputMismatchCheck num = new InputMismatchCheck();

    public Member getNewMember(Scanner sc) {
        Member newMember = new Member();
        MemberElementList list = new MemberElementList("new 회원 ");
        HashMap<String, String> map = new HashMap<>(5);

        System.out.println("========== new 회원 정보 등록 ==========");
        for (int i = 0; i < list.getNewElement().length; i++) {
            System.out.print(list.getNewElement()[i]);
            if (list.getElement()[i].equals("아이디")) {
                newMember.setId(num.Check("ID"));
            } else if (list.getElement()[i].equals("나이")) {
                newMember.setAge(num.Check("AGE"));
            } else {
                map.put(list.getElement()[i], sc.next());
            }
        }
        newMember.setName(map.get("이름"));
        newMember.setEmail(map.get("이메일"));
        newMember.setAddr(map.get("주소"));
        newMember.setHobby(map.get("취미"));
        newMember.setTel(map.get("전화번호"));
        return newMember;
    }

    public void printRegistMessage(int id, boolean registSuccess) {
        if (!registSuccess) System.out.println("* " + id + " 회원 등록 실패 *");
        else System.out.println("* " + id + " 회원 등록 성공 *");
    }

    public void printMemberList(MemberDB DB, boolean listSuccess) {
        if (listSuccess) {
            for (Member member : DB.getDB().values()) {
                System.out.println(member);
            }
        } else {
            System.out.println("[!] 현재 회원 정보가 없습니다.");
        }
    }

    public int getId(String msgKind) {
        System.out.print(msgKind + "아이디 : ");
        return num.Check("ID");
    }

    public Member getNewMember(Member oldMember, Scanner sc) {
        if (oldMember == null) throw new NullPointerException();
        Member member = new Member();
        System.out.println("========== new 회원 정보 수정 ==========");
        System.out.println("<수정 항목 선택>");
        System.out.println("회원 아이디 : " + oldMember.getId());
        System.out.print("이전 회원 이름 : " + oldMember.getName() + "\nnew 회원 이름 : ");
        String name = sc.next();
        System.out.print("이전 회원 나이 : " + oldMember.getAge() + "\nnew 회원 나이  : ");
        int age = num.Check("AGE");
        System.out.print("이전 회원 이메일 : " + oldMember.getEmail() + "\nnew 회원 이메일 : ");
        String email = sc.next();
        System.out.print("이전 회원 주소 : " + oldMember.getAddr() + "\nnew 회원 주소 : ");
        String addr = sc.next();
        System.out.print("이전 회원 취미 : " + oldMember.getHobby() + "\nnew 회원 취미 : ");
        String hobby = sc.next();
        System.out.print("이전 회원 전화번호 : " + oldMember.getTel() + "\nnew 회원 전화번호 : ");
        String tel = sc.next();

        member.setId(oldMember.getId());
        member.setName(name);
        member.setEmail(email);
        member.setAddr(addr);
        member.setHobby(hobby);
        member.setTel(tel);
        member.setAge(age);

        return member;
    }

    public void printUpdateMessage(int id, boolean updateSuccess) {
        if (!updateSuccess) System.out.println("* " + id + " 회원 정보 수정 실패 *");
        else System.out.println("* " + id + " 회원 정보 수정 성공 *");
    }

    public void printDeleteMessage(int id, boolean deleteSuccess) {
        if (!deleteSuccess) System.out.println("* " + id + " 회원 정보 삭제 실패 *");
        else System.out.println("* " + id + " 회원 정보 삭제 성공 *");
    }

    public SearchData getSearchData(Scanner sc) {
        System.out.println("========== 검색 조건 선택 ==========");
        System.out.print("아이디 or 이름\n검색 조건 : ");
        String searchCondition = sc.next();
        String searchValue = null;

        if (searchCondition.equals("아이디")) {
            System.out.print("검색 할 아이디 : ");
            searchValue = String.valueOf(num.Check("ID"));
        } else if (searchCondition.equals("이름")) {
            System.out.print("검색 할 이름 : ");
            searchValue = sc.next();
        } else {
            System.out.println("[!] '아이디' 또는 '이름'으로만 검색 가능 합니다");
        }
        SearchData searchData = new SearchData();
        searchData.setSearchCondition(searchCondition);
        searchData.setSearchValue(searchValue);
        return searchData;
    }

    public void printSearchMember(Member member) {
        if (member != null) {
            System.out.println(member.getId() + "으로 검색 한 결과");
            System.out.println(member);
        }
        System.out.println("[!] 검색 결과가 없습니다.");
    }

    public void printSearchMemberArray(Member[] memberArray) {
        if (memberArray != null) {
            System.out.println(memberArray[0].getName() + " 으로 검색 한 결과");
            for (Member member : memberArray) {
                System.out.println(member);
            }
        }
        System.out.println("[!] 해당 이름으로 검색한 결과가 없습니다.");
    }
}