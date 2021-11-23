package ui;

import java.util.Scanner;
import vo.Member;
import controller.MemberController;
import action.Action;
import action.MemberRegistAction;
import action.MemberListAction;
import action.MemberUpdateAction;
import action.MemberDeleteAction;
import action.MemberSearchAction;


public class MemberUI {
	
	public static Member[] memberArray = new Member[0];
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		MemberController memberController = new MemberController();
		boolean stop = false;
		Action action = null;
		
		while(!stop){
			System.out.println("ȸ�� ������ ����");
			System.out.println("1.ȸ������");
			System.out.println("2.ȸ�� ��� ����");
			System.out.println("3.ȸ�� ���� ����");
			System.out.println("4.ȸ�� ���� ����");
			System.out.println("5.ȸ�� ���� �˻�");
			System.out.println("6.���α׷� ����");
			System.out.print("�޴� ��ȣ : ");
			switch (sc.nextInt()) {
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
				stop = true;
				break;
			default:
				System.out.println("1~6�� �Է�");
				break;
			}
			if (action != null) {
				memberController.processRequest(sc, action);
			}										
		}
	}
}
