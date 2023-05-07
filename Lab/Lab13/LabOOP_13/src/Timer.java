import java.awt.*;
import javax.swing.*;

public class Timer {
    public Timer () {
        JFrame fr = new JFrame ("Timer App");
        MyTimer tm = new MyTimer();
        Thread t = new Thread(tm);
        
        fr.setLayout(new FlowLayout());
        
        fr.add(tm);
        
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fr.setSize(250, 100);
        fr.setLocationRelativeTo(null);
        fr.setVisible(true);
        t.start();
    }
    public static void main(String[] args) {
        new Timer();
    }
}
