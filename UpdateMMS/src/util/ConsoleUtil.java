package util;

import vo.Member;
import vo.SearchData;
import java.util.*;

public class ConsoleUtil {
	private final InputMismatchCheck num = new InputMismatchCheck();

	public Member getNewMember(Scanner sc) {
		Member newMember = new Member();
		MemberElementList list = new MemberElementList();

		System.out.println("========== new ȸ�� ���� ��� ==========");
		for (String element : list.getElement()) {
			System.out.print("new ȸ�� " + element + " : ");
			list.setMemberElement(element, sc, newMember);
		}
		return newMember;
	}

	public Member getNewMember(Member oldMember, Scanner sc) {
		if (oldMember == null)
			throw new NullPointerException();
		Member member = new Member();
		MemberElementList list = new MemberElementList();
		ArrayList<String> updateList = null;

		System.out.println("========== new ȸ�� ���� ���� ==========");
		System.out.println(oldMember);
		sc.nextLine();
		while (updateList == null) { // ���� �׸� üũ while��
			System.out.print("���� �׸� �Է�(�������� ����) : ");
			String element = sc.nextLine();
			updateList = list.checkList(element);
		}
		for (String element : list.getElement()) { // ���� �׸� ������Ʈ
			if (updateList.contains(element)) {
				System.out.print("old ȸ�� " + element + " : ");
				System.out.println(list.getMemberElement(element, oldMember));
				System.out.print("new ȸ�� " + element + " : ");
				list.setMemberElement(element, sc, member);
			} else {
				list.setMemberElement(element, list.getMemberElement(element, oldMember), member);
			}
		}
		return member;
	}

	public SearchData getSearchData(Scanner sc) {
		System.out.println("========== �˻� ���� ���� ==========");
		System.out.print("���̵� or �̸�\n�˻� ���� �Է� : ");
		String searchCondition = sc.next();
		String searchValue = null;
		if (searchCondition.equals("���̵�")) {
			System.out.print("�˻� �� ���̵� : ");
			searchValue = String.valueOf(num.Check("ID"));
		} else if (searchCondition.equals("�̸�")) {
			System.out.print("�˻� �� �̸� : ");
			searchValue = sc.next();
		} else {
			System.out.println("[!] '���̵�' �Ǵ� '�̸�'���θ� �˻� ���� �մϴ�");
		}
		SearchData searchData = new SearchData();
		searchData.setSearchCondition(searchCondition);
		searchData.setSearchValue(searchValue);
		return searchData;
	}

	public void printMemberList(MemberDB DB, boolean listSuccess) {
		if (listSuccess) {
			for (Member member : DB.getDB().values()) {
				System.out.println(member);
			}
		} else {
			System.out.println("[!] ���� ȸ�� ������ �����ϴ�.");
		}
	}

	public void printSearchMember(Member member, String value) {
		if (member != null) {
			System.out.println(value + "���� �˻� �� ���\n" + member);
		} else {
			System.out.println("[!]" + value + " �˻� ����� �����ϴ�.");
		}
	}

	public void printSearchMemberList(ArrayList<Member> memberList, String value) {
		if (memberList.size() == 0) {
			System.out.println("[!]" + value + " �˻� ����� �����ϴ�.");
		} else {
			System.out.println(value + " ���� �˻� �� ���");
			for (Member member : memberList) {
				System.out.println(member);
			}
		}
	}

	public void printRegistMessage(int id, boolean registSuccess) {
		if (!registSuccess)
			System.out.println("* " + id + " ȸ�� ��� ���� *");
		else
			System.out.println("* " + id + " ȸ�� ��� ���� *");
	}

	public void printUpdateMessage(int id) {
		System.out.println("* " + id + " ȸ�� ���� ���� ���� *");
	}

	public void printDeleteMessage(int id, boolean deleteSuccess) {
		if (!deleteSuccess)
			System.out.println("* " + id + " ȸ�� ���� ���� ���� *");
		else
			System.out.println("* " + id + " ȸ�� ���� ���� ���� *");
	}

	public int getId(String msgKind) {
		System.out.print(msgKind + " ���̵� : ");
		return num.Check("ID");
	}
}