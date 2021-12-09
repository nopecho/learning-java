package ex6;

import java.util.HashMap;
import java.util.Scanner;

public class HashMapScoreEx {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<String ,Integer> map = new HashMap<>();
        String[] names = new String[5];
        int[] scores = new int[5];
        for(int i =0; i < names.length;i++){
            System.out.print("이름 입력 : ");
            names[i] = sc.next();
            System.out.print("점수 입력 : ");
            scores[i] = sc.nextInt();
            map.put(names[i],scores[i]);
        }
        System.out.println("Map 에 저장된 요소 갯수  : "+map.size());

        for( String name : map.keySet() ){
            System.out.println(name+" : "+map.get(name));
        }
    }
}
