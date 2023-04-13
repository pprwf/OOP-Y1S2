import java.awt.*;
import javax.swing.*;

public class MDIFromGUI {
      private JFrame fr;
      private JDesktopPane desk;
      private JInternalFrame in1;
      private JInternalFrame in2;
      private JInternalFrame in3;
      private JMenuBar bar;
      private JMenu m1;
      private JMenu m2;
      private JMenu m3;
      private JMenu sub;
      private JMenuItem i1;
      private JMenuItem i2;
      private JMenuItem i3;
      private JMenuItem si1;
      private JMenuItem si2;
      public MDIFromGUI () {
            fr = new JFrame("SubMenuItemDemo");
            desk = new JDesktopPane();
            in1 = new JInternalFrame("Application 01", true, true, true, true);
            in2 = new JInternalFrame("Application 02", true, true, true, true);
            in3 = new JInternalFrame("Application 03", true, true, true, true);
            
            bar = new JMenuBar();
            m1 = new JMenu("File");
            m2 = new JMenu("Edit");
            m3 = new JMenu("View");
            sub = new JMenu("New");
            i1 = new JMenuItem("Open");
            i2 = new JMenuItem("Save");
            i3 = new JMenuItem("Exit");
            si1 = new JMenuItem("Window");
            si2 = new JMenuItem("Message");
            
            fr.setJMenuBar(bar);
            bar.add(m1);
            bar.add(m2);
            bar.add(m3);
            
            m1.add(sub);
            m1.add(i1);
            m1.addSeparator();
            m1.add(i2);
            m1.addSeparator();
            m1.add(i3);
            
            sub.add(si1);
            sub.addSeparator();
            sub.add(si2);
            
            desk.setBackground(Color.BLACK);
            fr.add(desk);
            in1.setBounds(50, 240, 240, 140);
            in1.setVisible(true);
            in2.setBounds(200, 50, 220, 160);
            in2.setVisible(true);
            in3.setBounds(450, 180, 300, 220);
            in3.setVisible(true);
            desk.add(in1);
            desk.add(in2);
            desk.add(in3);
            
            fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            fr.setBounds(200, 60, 800, 500);
            fr.setVisible(true);
      }
}
