package util;

import vo.Member;
import vo.SearchData;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ConsoleUtil {

    public Member getNewMember(Scanner sc) {
        Member newMember = new Member();
        while(true){
            try {
                System.out.println("========== new 회원 정보 등록 ==========");
                System.out.print("회원 아이디 : ");
                int id = sc.nextInt();
                System.out.print("회원 나이 : ");
                int age = sc.nextInt();
                System.out.print("회원 이름 : ");
                String name = sc.next();
                System.out.print("회원 이메일 :");
                String email = sc.next();
                System.out.print("회원 주소 : ");
                String addr = sc.next();
                System.out.print("회원 취미 : ");
                String hobby = sc.next();
                System.out.print("회원 전화번호 : ");
                String tel = sc.next();
                newMember.setId(id);
                newMember.setName(name);
                newMember.setEmail(email);
                newMember.setAddr(addr);
                newMember.setHobby(hobby);
                newMember.setTel(tel);
                newMember.setAge(age);
                break;
            }
            catch (InputMismatchException e) {
                System.out.println("[!]"+e.getClass().getSimpleName()+" : ID 또는 AGE는 숫자만 입력하세요");
                sc.next();
            }
        }
        return newMember;
    }

    public void printRegistSuccessMessage(int id) {
        System.out.println("* "+id+ " 회원 등록 성공 *");
    }

    public void printRegistFailMessage(int id) {
        System.out.println("* "+id+" 회원 등록 실패 *");
    }

    public void printMemberList(Member[] memberArray) {
        if (memberArray.length == 0) {
            System.out.println("[!] 추가 된 회원 정보가 없습니다.");
        }
        for (Member member : memberArray) {
            System.out.println(member);
        }
    }

    public int getId(String msgKind, Scanner sc){
        int id;
        while(true){
            try{
                System.out.print(msgKind + "아이디 : ");
                id = sc.nextInt();
                break;
            }
            catch (InputMismatchException e){
                System.out.println("[!]"+e.getClass().getSimpleName()+" : ID는 숫자로 입력하세요");
                sc.next();
            }
        }
        return id;
    }

    public Member getNewMember(Member oldMember, Scanner sc) {
        Member member = new Member();
        while(true){
            try{
                System.out.println("========== new 회원 정보 수정 ==========");
                System.out.println("회원 아이디 : " + oldMember.getId());
                System.out.print("new 회원 나이  : ");
                int age = sc.nextInt();
                System.out.println("이전 회원 이름 : " + oldMember.getName());
                System.out.print("new 회원 이름 : ");
                String name = sc.next();
                System.out.println("이전 회원 이메일 : " + oldMember.getEmail());
                System.out.print("new 회원 이메일 : ");
                String email = sc.next();
                System.out.println("이전 회원 주소 : " + oldMember.getAddr());
                System.out.print("new 회원 주소 : ");
                String addr = sc.next();
                System.out.println("이전 회원 취미 : " + oldMember.getHobby());
                System.out.print("new 회원 취미 : ");
                String hobby = sc.next();
                System.out.println("이전 회원 전화번호 : " + oldMember.getTel());
                System.out.print("new 회원 전화번호 : ");
                String tel = sc.next();
                System.out.println("이전 회원 나이 : " + oldMember.getAge());

                member.setId(oldMember.getId());
                member.setName(name);
                member.setEmail(email);
                member.setAddr(addr);
                member.setHobby(hobby);
                member.setTel(tel);
                member.setAge(age);
                break;
            }
            catch (Exception e){
                if(e instanceof NullPointerException){
                    System.out.println("[!]"+e.getClass().getSimpleName()+" : 해당 ID는 존재하지 않습니다.");
                    break;
                }
                else if(e instanceof InputMismatchException){
                    System.out.println("[!]"+e.getClass().getSimpleName()+" : AGE는 숫자로 입력하세요");
                    sc.next();
                }
            }
        }
        return member;
    }

    public void printUpdateSuccessMessage(int id) {
        System.out.println("* "+id + " 회원 정보 수정 성공 *");
    }

    public void printUpdateFailMessage(int id) {
        System.out.println("* "+id + " 회원 정보 수정 실패 *");
    }

    public void printDeleteSuccessMessage(int id) {
        System.out.println("* "+id + " 회원 정보 삭제 성공 *");
    }

    public void printDeleteFailMessage(int id) {
        System.out.println("* "+id + " 회원 정보 삭제 실패 *");
    }

    public SearchData getSearchData(Scanner sc) {
        System.out.println("========== 검색 조건 선택 ==========");
        System.out.println("아이디 or 이름");
        System.out.print("검색 조건 : ");

        String searchCondition = sc.next();
        String searchValue = null;

        if (searchCondition.equals("아이디")) {
            System.out.print("검색 할 아이디 : ");
            searchValue = sc.next();
        } else if (searchCondition.equals("이름")) {
            System.out.print("검색 할 이름 : ");
            searchValue = sc.next();
        }else{
            System.out.println("[!] 아이디 또는 이름으로만 검색 가능 합니다");
        }
        SearchData searchData = new SearchData();
        searchData.setSearchCondition(searchCondition);
        searchData.setSearchValue(searchValue);
        return searchData;
    }

    public void printSearchMember(Member member) {
        if (member == null) {
            System.out.println("[!] 검색 결과가 없습니다.");
        }
        else {
            System.out.println(member.getId() + "으로 검색 한 결과");
            System.out.println(member);
        }
    }

    public void printSearchMemberArray(Member[] memberArray) {
        if (memberArray == null) {
            System.out.println("[!] 해당 이름으로 검색한 결과가 없습니다.");
        }
        else {
            System.out.println("이름으로 검색 한 결과");
            for (Member member : memberArray) {
                System.out.println(member);
            }
        }
    }
}