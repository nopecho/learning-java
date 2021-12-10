import java.util.*;

public class App {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        while (true){
            System.out.print("강수량 입력 >>");
            int rain = sc.nextInt();
            if(rain==0) break;
            list.add(rain);
            printList(list);
            printAverageRain(list);
        }
    }

    public static void printAverageRain(List<Integer> list){
        int result = 0;
        for(int rain : list){
            result+=rain;
        }
        System.out.println("\n현재 평균 : "+result/list.size());
    }

    public static void printList(List<Integer> list){
        for(int rain : list){
            System.out.print(rain+" ");
        }
    }
}
