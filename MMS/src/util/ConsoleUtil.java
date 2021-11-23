package util;

import vo.Member;
import vo.SearchData;
import java.util.Scanner;

public class ConsoleUtil {
	
	public Member getNewMember(Scanner sc) throws Exception{
		Member newMember = new Member();
		System.out.println("========== new 회원 정보 등록 ==========");
		System.out.print("회원 아이디 : ");
		int id = sc.nextInt();
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
		System.out.print("회원 나이 : ");
		int age = sc.nextInt();

		newMember.setId(id);
		newMember.setName(name);
		newMember.setEmail(email);
		newMember.setAddr(addr);
		newMember.setHobby(hobby);
		newMember.setTel(tel);
		newMember.setAge(age);

		return newMember;	
	}
	
	public void printRegistSuccessMessage(int id) {
		System.out.println(id+"회원 등록 성공");
	}
	
	public void printRegistFailMessage(int id) {
		System.out.println(id+"회원 등록 실패");
	}
	
	public void printMemberList(Member[] memberArray) {
		if(memberArray.length==0) {
			System.out.println("추가 된 회원 정보가 없습니다.");
		}
		for (int i=0;i<memberArray.length;i++) {
			System.out.println(memberArray[i]);
		}
	}
	
	public int getId(String msgKind,Scanner sc) {
		System.out.print(msgKind+" 아이디 : ");
		return sc.nextInt();
	}
	
	public Member getNewMember(Member oldMember,Scanner sc){
		Member member = new Member();
		System.out.println("new 회원 정보 수정");
		System.out.println("회원 아이디 : "+oldMember.getId());
		System.out.println("이전 회원 이름 : "+oldMember.getName());
		System.out.print("new 회원 이름 : ");
		String name = sc.next();
		System.out.println("이전 회원 이메일 : "+oldMember.getEmail());
		System.out.print("new 회원 이메일 : ");
		String email = sc.next();
		System.out.println("이전 회원 주소 : "+oldMember.getAddr());
		System.out.print("new 회원 주소 : ");
		String addr = sc.next();
		System.out.println("이전 회원 취미 : "+oldMember.getHobby());
		System.out.print("new 회원 취미 : ");
		String hobby = sc.next();
		System.out.println("이전 회원 전화번호 : "+oldMember.getTel());
		System.out.print("new 회원 전화번호 : ");
		String tel = sc.next();
		System.out.println("이전 회원 나이 : "+oldMember.getAge());
		System.out.print("new 회원 나이  : ");
		int age = sc.nextInt();
		
		member.setId(oldMember.getId());
		member.setName(name);
		member.setEmail(email);
		member.setAddr(addr);
		member.setHobby(hobby);
		member.setTel(tel);
		member.setAge(age);
		
		return member;
	}
	
	public void printUpdateSuccessMessage(int id) {
		System.out.println(id+" 회원 정보 수정 성공");
	}
	
	public void printUpdateFailMessage(int id) {
		System.out.println(id+" 회원 정보 수정 실패");
	}
	
	public void printDeleteSuccessMessage(int id) {
		System.out.println(id+" 회원 정보 삭제 성공");
	}
	
	public void printDeleteFailMessage(int id) {
		System.out.println(id+" 회원 정보 삭제 실패");
	}
	
	public SearchData getSearchData(Scanner sc) {
		System.out.println("검색 조건 선택");
		System.out.println("아이디 or 이름");
		System.out.print("검색 조건 : ");
		
		String searchCondition = sc.next();
		String searchValue = null;
		
		if(searchCondition.equals("아이디")) {
			System.out.print("검색 할 아이디 : ");
			searchValue = sc.next();
		}
		else if(searchCondition.equals("이름")) {
			System.out.print("검색 할 이름 : ");
			searchValue = sc.next();
		}
		SearchData searchData = new SearchData();
		searchData.setSearchCondition(searchCondition);
		searchData.setSearchValue(searchValue);
		
		return searchData;
	}
	
	public void printSearchMember(Member member) {
		if(member == null) {
			System.out.println("검색 결과가 없습니다.");
		}
		else {
			System.out.println(member.getId()+"으로 검색 한 결과");
			System.out.println(member);
		}
	}
	
	public void printSearchMemberArray(Member[] memberArray) {
		if(memberArray == null) {
			System.out.println("이름으로 검색한 결과가 없습니다.");
		}
		else {
			System.out.println("이름으로 검색 한 결과");
			for(int i=0;i<memberArray.length;i++) {
				System.out.println(memberArray[i]);
			}
		}
	}
}
