import java.awt.*;
import javax.swing.*;

public class CalculatorOneGUI {
      JFrame fr;
      JPanel p;
      JButton b1;
      JButton b2;
      JButton b3;
      JButton b4;
      JTextField txt1 ;
      JTextField txt2;
      JTextField txt3;
      public CalculatorOneGUI () {
            fr = new JFrame("เครื่องคิดเลข");
            p = new JPanel();
            b1 = new JButton("บวก");
            b2 = new JButton("ลบ");
            b3 = new JButton("คูณ");
            b4 = new JButton("หาร");
            txt1 = new JTextField();
            txt2 = new JTextField();
            txt3 = new JTextField();
            
            fr.setLayout(new GridLayout(4, 1));
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
