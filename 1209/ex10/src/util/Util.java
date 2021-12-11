package util;

import vo.*;
import java.util.List;
import java.util.Scanner;

public class Util {
    public static final Scanner sc = new Scanner(System.in);

    public static void insert(List<Shape> list){
        Shape shape;
        System.out.print("(1)Line, (2)Rect, (3)Circle : ");
        int menu = sc.nextInt();
        switch (menu){
            case 1:
                shape = new Line();
                list.add(shape);
                break;
            case 2:
                shape = new Rect();
                list.add(shape);
                break;
            case 3:
                shape = new Circle();
                list.add(shape);
                break;
        }
    }

    public static void delete(List<Shape> list){
        System.out.print("삭제 도형 위치 : ");
        int index = sc.nextInt();
        try{
            list.remove(index);
        }catch (Exception e){
            System.out.println("삭제할 수 없습니다.");
        }
    }

    public static void show(List<Shape> list){
        for(Shape shape : list){
            shape.draw();
        }
    }
}
