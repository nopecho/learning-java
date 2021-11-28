package ui;

import java.util.Scanner;
import controller.MemberController;
import util.InputMismatchCheck;
import util.MemberDB;
import action.*;

public class MemberUi {
	public static void main(String[] args) {
		InputMismatchCheck menu = new InputMismatchCheck();
		MemberDB DB = new MemberDB();
		Scanner sc = new Scanner(System.in);
		MemberController memberController = new MemberController();
		boolean stop = true;
		while (stop) {
			Action action = null;
			System.out.println("========== ȸ�� ������ ���� ==========");
			System.out.println("1.ȸ������");
			System.out.println("2.ȸ�� ��� ����");
			System.out.println("3.ȸ�� ���� ����");
			System.out.println("4.ȸ�� ���� ����");
			System.out.println("5.ȸ�� ���� �˻�");
			System.out.println("6.���α׷� ����");
			System.out.print("�޴� ��ȣ : ");
			switch (menu.Check("MENU")) {
			case 1:
				action = new MemberRegistAction();
				break;
			case 2:
				action = new MemberListAction();
				break;
			case 3:
				action = new MemberUpdateAction();
				break;
			case 4:
				action = new MemberDeleteAction();
				break;
			case 5:
				action = new MemberSearchAction();
				break;
			case 6:
				System.out.println("���α׷� ����");
				sc.close();
				stop = false;
				break;
			default:
				System.out.println("1~6�� �Է�");
				break;
			}
			if (action != null) {
				memberController.processRequest(sc, action, DB);
			}
		}
	}
}