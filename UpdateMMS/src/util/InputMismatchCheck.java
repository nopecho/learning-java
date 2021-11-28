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
			System.out.print("[!]" + e.getClass().getSimpleName() + ": " + string + "은 숫자로 입력하세요 >> ");
			Check(string);
		}
		return num;
	}
}
