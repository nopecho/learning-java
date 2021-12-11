package view;

import util.Util;
import vo.Nation;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    private boolean game = true;

    public void run() {
        List<Nation> list = new ArrayList<>();
        System.out.println("수도 맞추기 퀴즈");
        while (game) {
            System.out.print("(1)입력, (2)퀴즈, (3)종료 : ");
            int menu = Util.sc.nextInt();
            switch (menu) {
                case 1:
                    Util.insert(list); break;

                case 2:
                    Util.quiz(list); break;

                case 3:
                    System.out.println("종료 합니다.");
                    game = false;
            }
        }
    }

    public void runHash() {
        Map<String, String> map = new HashMap<>();
        System.out.println("수도 맞추기 퀴즈2");
        while (game) {
            System.out.print("(1)입력, (2)퀴즈, (3)종료 : ");
            int menu = Util.sc.nextInt();
            switch (menu) {
                case 1:
                    Util.insert(map); break;
                case 2:
                    Util.quiz(map); break;
                case 3:
                    System.out.println("종료 합니다.");
                    game = false;
            }
        }
    }
}
