package ThreadEX;

public class ThreadEx {
    public static void main(String[] args) {
        Thread a = new Thread(() -> {
            int n = 0;
            while (true) {
                System.out.println("A스레드 : " + n);
                n++;
                try {
                    Thread.sleep(2000);
                } catch (Exception e) {
                    return;
                }
            }
        });

        Thread b = new Thread(() -> {
            int n = 0;
            while (true) {
                System.out.println("B스레드 : " + n);
                n++;
                try {
                    Thread.sleep(3000);
                } catch (Exception e) {
                    return;
                }
            }
        });

        InterruptRunnable ir = new InterruptRunnable();
        Thread c = new Thread(ir, "C");
        a.start();
        b.start();
        c.start();
    }
}

class InterruptRunnable implements Runnable {
    private int k = 0;

    @Override
    public void run() {
        while (true) {
            System.out.println("C 스레드 : " + k);
            k++;
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println(Thread.currentThread().getName() + "스레드 종료");
                return;
            }
            if (k == 5) {
                Thread.currentThread().interrupt();
            }
        }
    }

    public int getK() {
        return k;
    }
}
