package ex3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ArrayListEx {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<String> a = new ArrayList<>();
        int MAX = 3;
        String[] name = new String[MAX];
        for(String s : name){
            System.out.print("이름 입력 : ");
            s=sc.next();
            a.add(s);
        }
        for(String s : a){
            System.out.print(s+"  ");
        }
        int longIndex=0;
        for(int i = 1 ; i<a.size();i++){
            if(a.get(longIndex).length() < a.get(i).length()){
                longIndex=i;
            }
        }
        System.out.println("\n가장 긴 이름은  : "+a.get(longIndex));
    }
}
