package view;

import util.Util;
import vo.Shape;
import java.util.ArrayList;
import java.util.List;

public class Main {
    private final List<Shape> list = new ArrayList<>();
    boolean game = true;

    public void run() {
        System.out.println("그래픽 에디터 실행");
        while (game) {
            System.out.print("(1)삽입, (2)삭제, (3)모두보기, (4)종료 : ");
            int menu = Util.sc.nextInt();
            switch (menu) {
                case 1: Util.insert(list); break;
                case 2: Util.delete(list); break;
                case 3: Util.show(list); break;
                case 4:
                    System.out.println("그래픽 에디터 종료");
                    game = false;
                    break;
            }
        }
    }
}
