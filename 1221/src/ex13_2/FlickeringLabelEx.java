package ex13_2;

import javax.swing.*;
import java.awt.*;

public class FlickeringLabelEx extends JFrame {
    public FlickeringLabelEx(){
        setTitle("예제");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container c = getContentPane();
        c.setLayout(new FlowLayout());

        FlickeringLabel flickeringLabel = new FlickeringLabel(100,Color.MAGENTA);
        JLabel label = new JLabel("ㅋㅋ");
        label.setFont(new Font("Gothic", Font.ITALIC, 70));
        FlickeringLabel flickeringLabel1 = new FlickeringLabel(150,Color.RED);

        c.add(flickeringLabel);
        c.add(label);
        c.add(flickeringLabel1);

        setSize(1000,200);
        setVisible(true);
    }

    public static void main(String[] args) {
        new FlickeringLabelEx();
    }
}

class FlickeringLabel extends JLabel implements Runnable{
    private long delay;
    private Color color;

    public  FlickeringLabel(long delay, Color color){
        this.setFont(new Font("Gothic", Font.ITALIC, 50));
//        super(text);
        this.delay=delay;
        this.color=color;
        setOpaque(true);

        Thread th = new Thread(this,"th");
        th.start();
    }
    @Override
    public void run(){
        int n =0;
        int i = 0;
        while(true){
            i++;
            setText(String.valueOf(i));
            if(n==0){
                setBackground(color);
                n=1;
            }else{
                setBackground(Color.YELLOW);
                n=0;
            }
            try{
                Thread.sleep(delay);
            }catch (InterruptedException e){
                setBackground(null);
                setText(Thread.currentThread().getName()+"종료");
                return;
            }
            if(i==30){
                Thread.currentThread().interrupt();
            }
        }
    }
}
