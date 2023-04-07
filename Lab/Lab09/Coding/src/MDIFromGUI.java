import java.awt.*;
import javax.swing.*;

public class MDIFromGUI {
      public MDIFromGUI () {
            JFrame fr = new JFrame("SubMenuItemDemo");
            JDesktopPane desk = new JDesktopPane();
            JInternalFrame in1 = new JInternalFrame("Application 01", true, true, true, true);
            JInternalFrame in2 = new JInternalFrame("Application 02", true, true, true, true);
            JInternalFrame in3 = new JInternalFrame("Application 03", true, true, true, true);
            
            JMenuBar bar = new JMenuBar();
            JMenu m1 = new JMenu("File");
            JMenu m2 = new JMenu("Edit");
            JMenu m3 = new JMenu("View");
            JMenu sub = new JMenu("New");
            JMenuItem i1 = new JMenuItem("Open");
            JMenuItem i2 = new JMenuItem("Save");
            JMenuItem i3 = new JMenuItem("Exit");
            JMenuItem si1 = new JMenuItem("Window");
            JMenuItem si2 = new JMenuItem("Message");
            
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
            
//            try {
//                  UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
//            }
//            catch (Exception e) {
//                  e.printStackTrace();
//            }
//            SwingUtilities.invokeLater(() -> {
//                  MDIFromGUI fr = new MDIFromGUI();
//            }
            
            fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            fr.setBounds(200, 60, 800, 500);
            fr.setVisible(true);
      }
}
