import java.util.Calendar;

public class Main {
    public static void main(String[] args) {
        Calendar c = Calendar.getInstance();

        int hour = c.get(Calendar.HOUR);
        int mit = c.get(Calendar.MINUTE);
        int ampm = c.get(Calendar.AM_PM);
        System.out.println("현재 시각은 "+hour+"시 "+mit+"분 입니다");
        if(ampm==0 && hour>4 && hour<11 ){
            System.out.println("Good,Mornig");
        }else if(hour<6){
            System.out.println("Good,Afternoon");
        }else if(ampm==1 && hour>6 || hour<10){
            System.out.println("Good,Evening");
        }else{
            System.out.println("Good,Night");
        }
    }
}
