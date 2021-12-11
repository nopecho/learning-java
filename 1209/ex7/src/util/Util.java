package util;

import vo.Student;

import java.util.Scanner;

public class Util {
    public static  final int MAX_STUDENT = 5;
    private static final Scanner sc = new Scanner(System.in);

    public static void printStartMsg() {
        System.out.println("장학금 관리 시스템 입니다.");
    }

    public static void insertInfo(DB db) {
        Student[] students = new Student[Util.MAX_STUDENT];
        for (Student student : students) {
            System.out.print("이름 학점 >>");
            String insert = sc.nextLine();
            String[] info = insert.split(" ");
            student = new Student();
            student.setName(info[0]);
            student.setScore(Double.parseDouble(info[1]));
            db.getDB().put(student.getName(), student);
        }
    }

    public static double standardScoreSetting() {
        System.out.print("장학생 선발 기준 학점 >>");
        return sc.nextDouble();
    }

    public static void checkScore(DB db, double score) {
        System.out.print("장학생 명단 : ");
        for (Student student : db.getDB().values()) {
            if (student.getScore() >= score) {
                System.out.print(student.getName() + " ");
            }
        }
    }
}
