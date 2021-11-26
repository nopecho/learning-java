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


    public Member getNewMember(Member oldMember, Scanner sc, MemberDB DB) {
        if (oldMember == null) throw new NullPointerException();
        Member member = new Member();
        MemberElementList List = new MemberElementList("new 회원 ");
        HashMap<String, String> map = new HashMap<>(5);

        System.out.println("========== new 회원 정보 수정 ==========");
        System.out.println(DB.getDB().get(oldMember.getId()));
//        for(int i=0;i<List.getNewElement().length;i++){
//            if(List.getElement()[i].equals("아이디")){
//                System.out.println("이전 회원 아이디 : "+oldMember.getId());
//                member.setId(oldMember.getId());
//            }else if(List.getElement()[i].equals("나이")){
//                System.out.print(List.getNewElement()[i]);
//                member.setAge(num.Check("AGE"));
//            }else{
//                System.out.print(List.getNewElement()[i]);
//                map.put(List.getElement()[i], sc.next());
//            }
//        }
//        member.setName(map.get("이름"));
//        member.setEmail(map.get("이메일"));
//        member.setAddr(map.get("주소"));
//        member.setHobby(map.get("취미"));
//        member.setTel(map.get("전화번호"));
        boolean ID = true;
        sc.nextLine();
        while(ID){
            System.out.print("수정 항목 입력(공백으로 구분) : ");
            String element = sc.nextLine();
            String[] elements = element.split(" ");
            if(map.containsKey("아이디")){
                System.out.println("[!]ID는 수정 불가");
            }else{
                ID=false;
            }
        }
        return member;
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

    public void printSearchMember(Member member,String value) {
        if (member != null) {
            System.out.println(value + "으로 검색 한 결과\n"+member);
        }else{
            System.out.println("[!]"+value+" 검색 결과가 없습니다.");
        }
    }

    public void printSearchMemberList(ArrayList<Member> memberList,String value){
        if(memberList.size()==0){
            System.out.println("[!]"+value+" 검색 결과가 없습니다.");
        }else{
            System.out.println(value + " 으로 검색 한 결과");
            for( Member member : memberList){
                System.out.println(member);
            }
        }
    }

    public void printRegistMessage(int id, boolean registSuccess) {
        if (!registSuccess) System.out.println("* " + id + " 회원 등록 실패 *");
        else System.out.println("* " + id + " 회원 등록 성공 *");
    }

    public void printUpdateMessage(int id) {
        System.out.println("* " + id + " 회원 정보 수정 성공 *");
    }

    public void printDeleteMessage(int id, boolean deleteSuccess) {
        if (!deleteSuccess) System.out.println("* " + id + " 회원 정보 삭제 실패 *");
        else System.out.println("* " + id + " 회원 정보 삭제 성공 *");
    }

    public int getId(String msgKind) {
        System.out.print(msgKind + " 아이디 : ");
        return num.Check("ID");
    }
}
