package util;

import java.util.InputMismatchException;
import java.util.Scanner;

public class InputMismatchCheck implements ExceptionCheck {
    private final Scanner sc = new Scanner(System.in);
    private int num;

    @Override
    public int Check(String string) {
        try {
            num = sc.nextInt();
        } catch (InputMismatchException e) {
            sc.next();
            System.out.print("[!]" + e.getClass().getSimpleName() + ": " + string + "는(은) 숫자만 입력해주세요 >> ");
            Check(string);
        }
        return num;
    }
}
