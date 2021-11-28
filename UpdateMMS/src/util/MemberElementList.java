package util;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

import vo.Member;

public class MemberElementList {
	private final ArrayList<String> element = new ArrayList<>(
			Arrays.asList("���̵�", "�̸�", "����", "��ȭ��ȣ", "�ּ�", "�̸���", "���"));
	private final InputMismatchCheck num = new InputMismatchCheck();

	ArrayList<String> getElement() {
		return element;
	}

	Object getMemberElement(String element, Member member) {
		switch (element) {
		case "���̵�":
			return member.getId();
		case "����":
			return member.getAge();
		case "��ȭ��ȣ":
			return member.getTel();
		case "�ּ�":
			return member.getAddr();
		case "�̸���":
			return member.getEmail();
		case "���":
			return member.getHobby();
		case "�̸�":
			return member.getName();
		default:
			return null;
		}
	}

	void setMemberElement(String element, Object obj, Member member) {
		if (obj instanceof Scanner) { // obj Ÿ�԰˻�
			if (element.equals("���̵�")) {
				obj = num.Check("ID");
			} else if (element.equals("����")) {
				obj = num.Check("AGE");
			} else {
				obj = ((Scanner) obj).next();
			}
		}
		switch (element) {
		case "���̵�":
			member.setId((Integer) obj);
			break;
		case "����":
			member.setAge((Integer) obj);
			break;
		case "��ȭ��ȣ":
			member.setTel((String) obj);
			break;
		case "�ּ�":
			member.setAddr((String) obj);
			break;
		case "�̸���":
			member.setEmail((String) obj);
			break;
		case "���":
			member.setHobby((String) obj);
			break;
		case "�̸�":
			member.setName((String) obj);
			break;
		}
	}

	ArrayList<String> checkList(String element) {
		ArrayList<String> newList = new ArrayList<>(Arrays.asList(element.split(" ")));

		for (String check : newList) {
			if (newList.contains("���̵�")) {
				System.out.println("[!]ID�� ���� �Ұ�");
				newList = null;
				break;
			} else if (!this.element.contains(check)) {
				System.out.println("[!]���� �׸��� ��Ȯ�� �Է��ϼ���");
				newList = null;
				break;
			}
		}
		return repetRemove(newList);
	}

	private ArrayList<String> repetRemove(ArrayList<String> arrayList) { // �ݺ� ����
		if (arrayList == null)
			return null;
		ArrayList<String> resultList = new ArrayList<>();

		for (String result : arrayList) {
			if (!resultList.contains(result)) {
				resultList.add(result);
			}
		}
		return resultList;
	}
}