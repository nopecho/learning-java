package ex13_1;

import java.awt.*;
import javax.swing.*;

//class TimerThread extends Thread{
//    private JLabel timerLabel;
//
//    public TimerThread(JLabel timerLabel){
//        this.timerLabel=timerLabel;
//    }
//
//    @Override
//    public void run(){
//        int n=0;
//        while(true){
//            n++;
//            timerLabel.setText(Integer.toString(n));
//            try{
//                Thread.sleep(500);
//            }catch(InterruptedException e){
//                timerLabel.setText("종료");
//                e.printStackTrace();
//                return;
//            }
//            if(n == 10){
//                Thread.currentThread().interrupt();
//            }
//        }
//    }
//}

public class ThreadTimerEx extends JFrame{
    public ThreadTimerEx(){
        setTitle("스레드 상속 받은 타이머 스레드 예제");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container c = getContentPane();
        c.setLayout(new FlowLayout());

        JLabel timerLabel = new JLabel();
        timerLabel.setFont(new Font("Gothic", Font.ITALIC, 70));
        c.add(timerLabel);

//        TimerThread th = new TimerThread(timerLabel);
        Thread th = new Thread(() ->{ //익명 함수 사용.
            int n = 0;
            while (true) {
                n++;
                timerLabel.setText(Integer.toString(n));
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    timerLabel.setText("종료");
                    e.printStackTrace();
                    return;
                }
                if (n == 10) {
                    Thread.currentThread().interrupt();
                }
            }
        });

        setSize(300,170);
        setVisible(true);

        th.start();
    }
    public static void main(String[] args) {
        new ThreadTimerEx();
    }
}
