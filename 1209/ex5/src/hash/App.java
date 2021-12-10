package hash;

import java.util.HashMap;
import java.util.Scanner;

public class App {
    private static final Scanner sc = new Scanner(System.in);
    private static final int MAX = 4;

    public static void main(String[] args) {
        HashMap<String, Student> map = new HashMap<>();
        Student[] students = new Student[MAX];

        System.out.println("이름,학과,아이디,평균 입력");
        insertMap(students,map);
        printInfo(students);
        checkInfo(map);
    }

    public static void insertMap(Student[] arry, HashMap<String, Student> map) {
        for (int i = 0; i < arry.length; i++) {
            System.out.print(">>>");
            String info = sc.nextLine();
            String[] infos = info.split(" ");
            arry[i] = new Student(infos[0], infos[1], Integer.parseInt(infos[2]), Double.parseDouble(infos[3]));
            map.put(infos[0],arry[i]);
        }
    }

    public static void printInfo(Student[] arry){
        for(Student s : arry){
            s.info();
        }
    }

    public static void checkInfo(HashMap<String, Student> map){
        while (true) {
            System.out.print("학생 이름 >> ");
            String key = sc.next();
            if(key.equals("그만")) return;
            if(map.containsKey(key)){
                map.get(key);
            }else{
                System.out.println("그딴 학생 없습니다.");
            }
        }
    }
}
