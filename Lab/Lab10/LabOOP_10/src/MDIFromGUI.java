import java.awt.*;
import javax.swing.*;

public class MDIFromGUI {
    private JFrame fr;
    private JDesktopPane d;
    private JInternalFrame in1, in2, in3;
    private JMenuBar b;
    private JMenu m1, m2, m3, sub;
    private JMenuItem i1, i2, i3, si1, si2;
    public MDIFromGUI () {
        fr = new JFrame("SubMenuItem Demo");
        d = new JDesktopPane();
        in1 = new JInternalFrame("Application 01", true, true, true, true);
        in2 = new JInternalFrame("Application 02", true, true, true, true);
        in3 = new JInternalFrame("Application 03", true, true, true, true);
        
        b = new JMenuBar();
        m1 = new JMenu("File");
        m2 = new JMenu("Edit");
        m3 = new JMenu("View");
        sub = new JMenu("New");
        
        i1 = new JMenuItem("Open");
        i2 = new JMenuItem("Save");
        i3 = new JMenuItem("Exit");
        si1 = new JMenuItem("Window");
        si2 = new JMenuItem("Message");
        
        d.setBackground(Color.BLACK);
        in1.setBounds(50, 240, 240, 140);
        in2.setBounds(200, 50, 220, 160);
        in3.setBounds(450, 180, 300, 220);
        in1.setVisible(true);
        in2.setVisible(true);
        in3.setVisible(true);
        
        fr.setJMenuBar(b);
        b.add(m1);
        b.add(m2);
        b.add(m3);
        
        sub.add(si1);
        sub.addSeparator();
        sub.add(si2);
        
        m1.add(sub);
        m1.add(i1);
        m1.addSeparator();
        m1.add(i2);
        m1.addSeparator();
        m1.add(i3);
        
        d.add(in1);
        d.add(in2);
        d.add(in3);
        fr.add(d);
        
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fr.setBounds(380, 150, 800, 500);
        fr.setVisible(true);
    }
}
