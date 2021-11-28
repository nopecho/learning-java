package controller;

import java.util.Scanner;
import action.Action;
import util.MemberDB;

public class MemberController {
	public void processRequest(Scanner sc, Action action, MemberDB DB) {
		try {
			action.execute(sc, DB);
		} catch (Exception e) {
			if (e instanceof NullPointerException) {
				System.out.println("[!]" + e.getClass().getSimpleName() + ": �ش� ID�� �������� �ʽ��ϴ�");
			}
		}
	}
}