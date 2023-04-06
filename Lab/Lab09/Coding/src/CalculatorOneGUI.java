import java.awt.*;
import javax.swing.*;

public class CalculatorOneGUI {
      public CalculatorOneGUI () {
            JFrame fr = new JFrame("เครื่องคิดเลข");
            JPanel p = new JPanel();
            JButton b1 = new JButton("บวก");
            JButton b2 = new JButton("ลบ");
            JButton b3 = new JButton("คูณ");
            JButton b4 = new JButton("หาร");
            JTextField txt1 = new JTextField();
            JTextField txt2 = new JTextField();
            JTextField txt3 = new JTextField();
            
            fr.setLayout(new GridLayout(4, 0));
            p.setLayout(new FlowLayout());
            
            p.add(b1);
            p.add(b2);
            p.add(b3);
            p.add(b4);
            fr.add(txt1);
            fr.add(txt2);
            fr.add(p);
            fr.add(txt3);
            
            fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            fr.setBounds(500, 250, 300, 150);
            fr.setVisible(true);
      }
}
