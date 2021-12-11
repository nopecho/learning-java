import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class App {
    static final Scanner sc = new Scanner(System.in);
    private static final int MAX = 4;

    public static void main(String[] args) {
        Location[] locations = new Location[MAX];
        Map<String, Location> map = new HashMap<>();
        System.out.println("도시 경도 위도 를 입력하세요");
        insertMap(locations, map);
        showMap(map);
        serchMap(map);
    }

    private static void insertMap(Location[] arr, Map<String, Location> map) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(">>");
            String save = sc.nextLine();
            String[] insert = save.split(" ");
            arr[i] = new Location(insert[0], Integer.parseInt(insert[1]), Integer.parseInt(insert[2]));
            map.put(arr[i].getName(), arr[i]);
        }
    }

    private static void showMap(Map<String, Location> map) {
        System.out.println("----------------");
        for (Location location : map.values()) {
            System.out.println(location);
        }
        System.out.println("----------------");
    }

    private static void serchMap(Map<String, Location> map) {
        while (true){
            System.out.print("도시 이름 >>");
            String contry = sc.next();
            if (contry.equals("그만")) return;
            if (map.containsKey(contry)) {
                System.out.println(map.get(contry));
            }
            System.out.println(contry + " 는 없습니다");
        }
    }
}
