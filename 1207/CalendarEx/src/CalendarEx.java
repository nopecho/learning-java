import java.util.Calendar;

public class CalendarEx {
    public static void printCalendar(String msg,Calendar car){
        int year = car.get(Calendar.YEAR);
        int montg = car.get(Calendar.MONTH)+1;
        int day = car.get(Calendar.DAY_OF_MONTH);
        int dayOfWeek = car.get(Calendar.DAY_OF_WEEK);
        int h = car.get(Calendar.HOUR);
        int hOfDay = car.get(Calendar.HOUR_OF_DAY);
        int ampm = car.get(Calendar.AM_PM);
        int m = car.get(Calendar.MINUTE);
        int s = car.get(Calendar.SECOND);
        int ms = car.get(Calendar.MILLISECOND);
        System.out.print(msg+year+"/"+montg+"/"+day+"/");

        switch (dayOfWeek){
            case Calendar.SUNDAY:
                System.out.print("일요일");
                break;
            case Calendar.MONDAY:
                System.out.println("월요일");
                break;
            case Calendar.TUESDAY:
                System.out.print("화요일");
                break;
            case Calendar.WEDNESDAY:
                System.out.print("수요일");
                break;
            case Calendar.THURSDAY:
                System.out.print("목요일");
                break;
            case Calendar.FRIDAY:
                System.out.print("금요일");
                break;
            case Calendar.SATURDAY:
                System.out.print("토요일");
                break;
        }
        System.out.print("("+hOfDay+"시)");
        if(ampm == Calendar.AM){
            System.out.print("오전");
        }else {
            System.out.print("오후");
        }

        System.out.println(h+"시"+m+"분"+s+"초"+ms+"밀리초");
    }

    public static void main(String[] args) {
        Calendar now = Calendar.getInstance(); //싱글톤 패턴 (하나의 프로세스에서 단 하나의 객체만 생성)
        printCalendar("현재는 ",now);

        Calendar myBirthDay = Calendar.getInstance();
        myBirthDay.clear(); //해당 객체 초기화
        myBirthDay.set(2021,11,11);
        myBirthDay.set(Calendar.HOUR_OF_DAY,20);
        myBirthDay.set(Calendar.MINUTE,15);
        printCalendar("내 생일은 ",myBirthDay);

    }
}
