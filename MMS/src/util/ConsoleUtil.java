package util;

import vo.Member;
import vo.SearchData;
import java.util.Scanner;

public class ConsoleUtil {
	
	public Member getNewMember(Scanner sc) throws Exception{
		Member newMember = new Member();
		System.out.println("========== new ȸ�� ���� ��� ==========");
		System.out.print("ȸ�� ���̵� : ");
		int id = sc.nextInt();
		System.out.print("ȸ�� �̸� : ");
		String name = sc.next();
		System.out.print("ȸ�� �̸��� :");
		String email = sc.next();
		System.out.print("ȸ�� �ּ� : ");
		String addr = sc.next();
		System.out.print("ȸ�� ��� : ");
		String hobby = sc.next();
		System.out.print("ȸ�� ��ȭ��ȣ : ");
		String tel = sc.next();
		System.out.print("ȸ�� ���� : ");
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
		System.out.println(id+"ȸ�� ��� ����");
	}
	
	public void printRegistFailMessage(int id) {
		System.out.println(id+"ȸ�� ��� ����");
	}
	
	public void printMemberList(Member[] memberArray) {
		if(memberArray.length==0) {
			System.out.println("�߰� �� ȸ�� ������ �����ϴ�.");
		}
		for (int i=0;i<memberArray.length;i++) {
			System.out.println(memberArray[i]);
		}
	}
	
	public int getId(String msgKind,Scanner sc) {
		System.out.print(msgKind+" ���̵� : ");
		return sc.nextInt();
	}
	
	public Member getNewMember(Member oldMember,Scanner sc){
		Member member = new Member();
		System.out.println("new ȸ�� ���� ����");
		System.out.println("ȸ�� ���̵� : "+oldMember.getId());
		System.out.println("���� ȸ�� �̸� : "+oldMember.getName());
		System.out.print("new ȸ�� �̸� : ");
		String name = sc.next();
		System.out.println("���� ȸ�� �̸��� : "+oldMember.getEmail());
		System.out.print("new ȸ�� �̸��� : ");
		String email = sc.next();
		System.out.println("���� ȸ�� �ּ� : "+oldMember.getAddr());
		System.out.print("new ȸ�� �ּ� : ");
		String addr = sc.next();
		System.out.println("���� ȸ�� ��� : "+oldMember.getHobby());
		System.out.print("new ȸ�� ��� : ");
		String hobby = sc.next();
		System.out.println("���� ȸ�� ��ȭ��ȣ : "+oldMember.getTel());
		System.out.print("new ȸ�� ��ȭ��ȣ : ");
		String tel = sc.next();
		System.out.println("���� ȸ�� ���� : "+oldMember.getAge());
		System.out.print("new ȸ�� ����  : ");
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
		System.out.println(id+" ȸ�� ���� ���� ����");
	}
	
	public void printUpdateFailMessage(int id) {
		System.out.println(id+" ȸ�� ���� ���� ����");
	}
	
	public void printDeleteSuccessMessage(int id) {
		System.out.println(id+" ȸ�� ���� ���� ����");
	}
	
	public void printDeleteFailMessage(int id) {
		System.out.println(id+" ȸ�� ���� ���� ����");
	}
	
	public SearchData getSearchData(Scanner sc) {
		System.out.println("�˻� ���� ����");
		System.out.println("���̵� or �̸�");
		System.out.print("�˻� ���� : ");
		
		String searchCondition = sc.next();
		String searchValue = null;
		
		if(searchCondition.equals("���̵�")) {
			System.out.print("�˻� �� ���̵� : ");
			searchValue = sc.next();
		}
		else if(searchCondition.equals("�̸�")) {
			System.out.print("�˻� �� �̸� : ");
			searchValue = sc.next();
		}
		SearchData searchData = new SearchData();
		searchData.setSearchCondition(searchCondition);
		searchData.setSearchValue(searchValue);
		
		return searchData;
	}
	
	public void printSearchMember(Member member) {
		if(member == null) {
			System.out.println("�˻� ����� �����ϴ�.");
		}
		else {
			System.out.println(member.getId()+"���� �˻� �� ���");
			System.out.println(member);
		}
	}
	
	public void printSearchMemberArray(Member[] memberArray) {
		if(memberArray == null) {
			System.out.println("�̸����� �˻��� ����� �����ϴ�.");
		}
		else {
			System.out.println("�̸����� �˻� �� ���");
			for(int i=0;i<memberArray.length;i++) {
				System.out.println(memberArray[i]);
			}
		}
	}
}
