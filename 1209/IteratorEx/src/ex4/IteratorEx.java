package ex4;

import java.util.Iterator;
import java.util.List;
import java.util.Vector;

public class IteratorEx {
    public static void main(String[] args) {
        List<Integer> v = new Vector<>();

        v.add(5);
        v.add(4);
        v.add(-1);
        v.add(1, 100000);

        Iterator<Integer> it = v.iterator();
        while (it.hasNext()) {
            int a = it.next();
            System.out.println(a);
        }
        int sum = 0;
        it = v.iterator();
        while (it.hasNext()) {
            int n = it.next();
            sum += n;
        }
        System.out.println(sum);
    }
}