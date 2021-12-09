package ex5;

import java.util.HashMap;
import java.util.Scanner;

public class HashMapEx {
    public static void main(String[] args) {
        HashMap<String,String> map = new HashMap<>();

        map.put("baby","아기");
        map.put("live","라이브");
        map.put("love","사랑");
        map.put("apple","사과");
        System.out.println(map.get("baby"));

        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.print("찾고 싶은 단어는??");
            String value = sc.next();
            if(value.equals("그만")){
                break;
            }else if(map.containsKey(value)){
                System.out.println(map.get(value));
            }else{
                System.out.println(value+"는 사전에 없습니다.");
            }
        }

        while (true){
            System.out.print("찾고 싶은 단어는??");
            String value = sc.next();
            if(value.equals("그만")){
                break;
            }
            String kor = map.get(value);
            if(kor == null){
                System.out.println(value+"는 없음 ㅋㅋ");
            }else{
                System.out.println(kor);
            }
        }
    }
}
