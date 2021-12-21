package ex13_4;

import javax.swing.*;
import java.awt.*;

public class ThreadInterruptEx extends JFrame {
    private final String KILL = "Kill thread";
    private final String ALIVE = "Alive thread";
    private Thread th;
    private int i = 0;
    private JButton btn;

    public ThreadInterruptEx() {
        setTitle("예제");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container c = getContentPane();
        c.setLayout(new FlowLayout());

        JLabel timerLabel = new JLabel();
        timerLabel.setFont(new Font("Gothic", Font.BOLD, 80));

        th = setThread(timerLabel);
        c.add(timerLabel);

        btn = new JButton(KILL);
        btn.addActionListener(e -> {
            if (btn.getText().equals(ALIVE)) {
                btn.setText(KILL);
                th = setThread(timerLabel);
                th.start();
            } else {
                btn.setText(ALIVE);
                th.interrupt();
            }
        });
        c.add(btn);

        setSize(300, 170);
        setVisible(true);
        th.start();
    }

    public Thread setThread(JLabel timerLabel){
        return new Thread(() -> {
            while (true) {
                timerLabel.setText(String.valueOf(i));
                i++;
                try {
                    Thread.sleep(300);
                } catch (InterruptedException ei) {
                    return;
                }
            }
        });
    }

    public static void main(String[] args) {
        ThreadInterruptEx ti = new ThreadInterruptEx();
    }
}
