import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Stopwatch implements MouseListener{
    private JFrame fr;
    private MyTimer time;
    private Thread t;
    public Stopwatch() {
        fr = new JFrame("Stopwatch");
        time = new MyTimer();
        t = new Thread(time);
        
        fr.setLayout(new FlowLayout());
        
        fr.add(time);
        time.addMouseListener(this);
        
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fr.setSize(250, 100);
        fr.setLocationRelativeTo(null);
        fr.setVisible(true);
        t.start();
    }

    public void mouseClicked(MouseEvent me) {
        if (me.getSource().equals(time)) {
            if (! time.isPausing()) {
                time.pause();
            }
            else {
                time.resume();
            }
        }
    }

    public void mousePressed(MouseEvent e) {}

    public void mouseReleased(MouseEvent e) {}

    public void mouseEntered(MouseEvent e) {}

    public void mouseExited(MouseEvent e) {}
    
    public static void main(String[] args) {
        new Stopwatch();
    }
}
