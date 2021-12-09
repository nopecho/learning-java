package ex8;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class CollectionsEx {
    static void printList(List<String> l){
        Iterator<String> it = l.iterator();
        while(it.hasNext()){
            String s = it.next();
            String del;
            if(it.hasNext()){
                del = "->";
            }else{
                del = "\n";
            }
            System.out.print(s+del);
        }
    }
    public static void main(String[] args) {
        List<String> link = new LinkedList<>();
        link.add("트렌스포머");
        link.add("스타워즈");
        link.add("매트릭스");
        link.add(0,"터미네이터");
        link.add(2,"아바타");
        Collections.sort(link);
        printList(link);
        Collections.reverse(link);
        printList(link);

        int index = Collections.binarySearch(link,"아바타")+1;
        System.out.println("아바타는 "+index+" 번째");
    }
}
