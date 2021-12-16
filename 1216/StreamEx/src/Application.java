import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Application {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        Member a = new Member("hyunjun",26,"010-5478-4056");
//        Member b = new Member("none",0,"010-1234-5678");
//        Member c = new Member("o",10,"010-1111-2222");
        HashMap<String,Integer> map = new HashMap<>();
        List<Integer> a = new ArrayList<>();
        a.add(1);
        a.add(2);
        a.add(3);
        a.add(1);
        a.add(4);
        a.add(5);
        a.add(6);
        a.add(7);
        a.add(8);
        a.add(9);
        a.add(10);

        List<Integer> b = a.stream()
                .filter(integer -> integer > 3)
                .map(integer -> integer+20)
                .collect(Collectors.toList());

        b.stream().filter( integer -> integer>26).forEach(Integer -> map.put(String.valueOf(Integer),Integer));


        map.put(String.valueOf(b.get(0)), b.get(0));
        map.entrySet().stream()
                .map(entry-> entry.)

        List<String> c = map.keySet().stream()
                .map(s -> s+"변신")
                .collect(Collectors.toList());

        b.stream().forEach(integer -> System.out.println("="+integer));
        c.stream().forEach(System.out::println);
//        List<Member> memberList = new ArrayList<>();
//        memberList.add(a);
//        memberList.add(b);
//        memberList.add(c);
//
//        memberList.forEach(member -> System.out.println(member.getName()));
//        String insert= sc .next();
//        memberList.stream()
//                .filter(member -> member.getName().equals(insert))
//                .map(member -> member.getName()+"123")
//                .forEach(System.out::println);
    }
}
