package util;

import vo.Nation;

import java.util.*;

public class Util {
    public static final Scanner sc = new Scanner(System.in);

    public static void insert(List<Nation> list) {
        sc.nextLine();
        System.out.println("현재 " + list.size() + " 개의 나라정보가 입력 되어 있습니다.");
        while (true) {
            System.out.print("나라 수도 [" + (list.size() + 1) + "] : ");
            String insert = sc.nextLine();
            if (insert.equals("그만")) return;
            String[] info = insert.split(" ");
            if (!checkContry(list, info[0])) {
                System.out.println(info[0] + "은 이미 있습니다.");
                continue;
            }
            Nation nation = new Nation(info[0], info[1]);
            list.add(nation);
        }
    }

    public static void quiz(List<Nation> list) {
        while(true){
            Nation nation = list.get((int) (Math.random() * list.size()));
            System.out.println(nation.getContry()+"의 수도는 ? ");
            String answer = sc.next();
            if(answer.equals("그만")) return;
            if(!nation.getCapital().equals(answer)){
                System.out.println("정답!!");
                continue;
            }
            System.out.println("오답!!");
        }
    }

    private static boolean checkContry(List<Nation> list, String contry) {
        for (Nation nation : list) {
            if (nation.getContry().equals(contry)) {
                return false;
            }
        }
        return true;
    }

    public static void insert(Map<String, String> map){
        sc.nextLine();
        System.out.println("현재 " + map.size() + " 개의 나라정보가 입력 되어 있습니다.");
        while (true){
            System.out.print("나라 수도 [" + (map.size() + 1) + "] : ");
            String insert = sc.nextLine();
            String[] info = insert.split(" ");
            if(info[0].equals("그만")) return;
            if(map.containsKey(info[0])){
                System.out.println(info[0]+" 은 이미 있습니다.");
            }
            map.put(info[0],info[1]);
        }
    }
    public static void quiz(Map<String, String> map){
        while(true){
            String contry = radnContry(map);
            System.out.print(contry+"의 수도는 ? : ");
            String answer = sc.next();
            if(answer.equals("그만")) return;
            if(map.get(contry).equals(answer)){
                System.out.println("정답!");
                continue;
            }
            System.out.println("오답!");
        }
    }

    private static String radnContry(Map<String, String> map){
        int rand = (int)(Math.random()*map.size());
        List<String> list = new ArrayList<>();
        for(String key : map.keySet()){
            list.add(key);
        }
        return list.get(rand);
    }
}
