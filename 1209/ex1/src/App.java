import java.util.*;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> list = new Vector<>();
        int max=0;

        System.out.print("정수 입력(-1 입력될 때까지) >>");
        while (true){
            int elements = sc.nextInt();
            if(elements == -1) break;
            list.add(elements);
        }
        for (int check : list) {
            if (check > max) {
                max = check;
            }
        }
        System.out.println("가장 큰 수 : "+max);
    }
}
