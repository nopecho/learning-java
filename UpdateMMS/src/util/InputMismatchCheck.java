package util;

import java.util.InputMismatchException;
import java.util.Scanner;

public class InputMismatchCheck {
	private final Scanner sc = new Scanner(System.in);
	private int num;

	public int Check(String string) {
		try {
			num = sc.nextInt();
		} catch (InputMismatchException e) {
			sc.next();
			System.out.print("[!]" + e.getClass().getSimpleName() + ": " + string + "�� ���ڸ� �Է����ּ��� >> ");
			Check(string);
		}
		return num;
	}
}