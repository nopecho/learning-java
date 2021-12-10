import java.util.HashMap;
import java.util.Scanner;

public class App {
    public static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        Nation n = new Nation();
        System.out.println("나라 이름, 인구 입력(공백 구분)");
        n.setNation();
        while(true){
            System.out.print("인구 검색 : ");
            String serch = sc.next();
            if(serch.equals("그만")) break;
            n.serchNation(serch);
        }
    }
}

class Nation{
    private final HashMap<String, Integer> nations = new HashMap<>();

    public void setNation(){
        while(true){
            System.out.print("[나라이름] [인구] >>");
            String insert = App.sc.nextLine();
            if(insert.equals("그만")) break;
            String[] nation = insert.split(" ");
            nations.put(nation[0],Integer.valueOf(nation[1]));
        }
    }

    public void serchNation(String serch){
        if(nations.containsKey(serch)){
            System.out.println(serch+"의 인구는 "+nations.get(serch)+" 입니다.");
        }else{
            System.out.println(serch+" 그딴 나라는 없습니다.");
        }
    }
}
