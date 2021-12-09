package ex7;

import java.util.HashMap;
import java.util.Scanner;

class Student {
    private int id;
    private String tel;

    Student(int id, String tel) {
        this.id = id;
        this.tel = tel;
    }

    public int getId(){
        return id;
    }

    public String getTel(){
        return tel;
    }

}

public class HashMapStudentEx {
    public static void main(String[] args) {
        HashMap<String,Student> map = new HashMap<>();
        Scanner sc = new Scanner(System.in);

        map.put("조현준",new Student(1,"010-1111-2222"));
        map.put("조현준1",new Student(2,"010-3333-4444"));
        map.put("조현준2",new Student(3,"010-5555-6666"));

        while(true) {
            String name = sc.next();
            if(name.equals("그만")){
                break;
            }
            if(map.containsKey(name)){
                Student find = map.get(name);
                System.out.println("id : "+find.getId()+" 전화번호 : "+find.getTel());
            }else{
                System.out.println("없는 사람ㅋㅋ");
            }
        }
    }
}
