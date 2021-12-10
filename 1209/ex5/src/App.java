import java.util.*;

public class App {
    private static final int MAX = 4;
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        Student[] students = new Student[MAX];
        List<Student> studentList = new ArrayList<>();
        System.out.println("이름,학과,아이디,평균 입력");
        insertList(students, studentList);
        for (Student s : studentList) {
            s.info();
        }
        while (true) {
            System.out.println("--------------------");
            System.out.print("학생 이름 >>");
            String name = sc.next();
            if (name.equals("그만")) break;
            for (Student s : studentList) {
                if (name.equals(s.getName())) {
                    System.out.println(s);
                }
            }
        }
    }

    public static void insertList(Student[] arry, List<Student> list) {
        for (int i = 0; i < arry.length; i++) {
            System.out.print(">>>");
            String info = sc.nextLine();
            String[] infos = info.split(" ");
            arry[i] = new Student(infos[0], infos[1], Integer.parseInt(infos[2]), Double.parseDouble(infos[3]));
            list.add(arry[i]);
        }
    }
}
