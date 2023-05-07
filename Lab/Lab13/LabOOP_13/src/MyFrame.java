import java.awt.*;
import javax.swing.*;

public class MyFrame {
    private JFrame fr;
    private MyClock clock;
    private Thread t;
    public MyFrame () {
        fr = new JFrame("My Clock");
        clock = new MyClock();
        t = new Thread(clock);
        
        fr.setLayout(new FlowLayout());
        
        fr.add(clock);
        
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fr.setSize(250, 100);
        fr.setLocationRelativeTo(null);
        fr.setVisible(true);
        t.start();
    }
    public static void main(String[] args) {
        new MyFrame();
    }
}
