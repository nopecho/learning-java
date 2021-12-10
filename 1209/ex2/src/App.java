import java.util.*;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Score score = new Score();
        ArrayList<Character> list = new ArrayList<>();

        System.out.print("학점을 빈칸으로 분리 입력 : ");
        String insert = sc.nextLine();
        String[] grades = insert.split(" ");
        for(String grade : grades){
            list.add(grade.charAt(0));
        }
        double result=0;
        for(char grade : list){
            result+=score.getScore().get(grade);
        }
        System.out.println(result/list.size());
    }
}

class Score{
    private final HashMap<Character, Double> score = new HashMap<>(5);

    Score(){
        double maxScore = 4.0;
        for (int i = 'A'; i < 'E'; i++) {
            score.put((char) i, maxScore);
            maxScore--;
        }
        score.put('F',0.0);
    }
    public HashMap<Character,Double> getScore(){
        return score;
    }
}
