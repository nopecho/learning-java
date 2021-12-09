package ex1;

import java.util.List;
import java.util.Vector;

public class VectorEx {
    public static void main(String[] args) {
        List<Integer> v = new Vector<>();
        v.add(5);
        v.add(4);
        v.add(-1);
        v.add(2,1000);
        System.out.println("백터 애늬 요소 객체 수 : "+v.size());
        System.out.println("백터의 현재 용량 : "+ ((Vector<Integer>) v).capacity());

        for(Integer i : v){
            System.out.println(i);
        }
        int sum=0;
        for(Integer i : v){
            sum+=i;
        }
        System.out.println("백터 내의 요소의 합 : "+sum);
    }
}
