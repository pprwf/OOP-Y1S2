import java.util.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Poring extends Thread implements MouseListener{
    private JFrame fr;
    private JPanel p;
    private JLabel l;
    private ImageIcon ic, scaled;
    private Random rand;
    private Dimension di;
    private Thread th;
    public Poring (int count) {
        fr = new JFrame();
        ic = new ImageIcon(getClass().getResource("RO_Poring.png"));
        scaled = new ImageIcon(ic.getImage().getScaledInstance(145, 95, Image.SCALE_SMOOTH));
        l = new JLabel();
        rand = new Random();
        di = Toolkit.getDefaultToolkit().getScreenSize();
//        th = new Thread((Runnable) fr);
        
        fr.setLayout(new FlowLayout());
        l.setIcon(scaled);
        l.setText(String.valueOf(count));
        fr.setResizable(false);
        
        fr.add(l);
        l.addMouseListener(this);
        
        fr.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        fr.pack();
        fr.setLocation(rand.nextInt(di.width - fr.getWidth()), rand.nextInt(di.height - fr.getHeight()));
        fr.setVisible(true);
//        th.start();
    }
    
    public void run () {
        while (true) {
            try {
                Thread.sleep(120);
                fr.setLocation(fr.getX() + 5, fr.getY() + 5);
                Thread.sleep(120);
                fr.setLocation(fr.getX() - 5, fr.getY() - 5);
            }
            catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
    
    public void mouseClicked(MouseEvent me) {
        if (me.getSource().equals(l)) {
            fr.dispose();
        }
    }

    public void mousePressed(MouseEvent e) {}

    public void mouseReleased(MouseEvent e) {}

    public void mouseEntered(MouseEvent e) {}

    public void mouseExited(MouseEvent e) {}
}
