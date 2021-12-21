package ex13_3;

public class ThreadMainEx {
    public static void main(String[] args) {
        long id = Thread.currentThread().getId();
        String name = Thread.currentThread().getName();
        int priority = Thread.currentThread().getPriority();
        System.out.println(Thread.currentThread().getState());

        System.out.println("스레드 이름 : "+name);
        System.out.println("스레드 ID : "+id);
        System.out.println("스레드 우선순위 : "+priority);
    }
}
