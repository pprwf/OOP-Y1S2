import java.awt.*;
import javax.swing.*;

public class CalculatorOneGUI {
    private JFrame fr;
    private JPanel p;
    private JTextField txt1, txt2, txt3;
    private JButton b1, b2, b3, b4;
    public CalculatorOneGUI () {
        fr = new JFrame ("เครื่องคิดเลข");
        p = new JPanel ();
        txt1 = new JTextField ();
        txt2 = new JTextField ();
        txt3 = new JTextField ();
        b1 = new JButton ("บวก");
        b2 = new JButton ("ลบ");
        b3 = new JButton ("คูณ");
        b4 = new JButton ("หาร");
        
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
        fr.pack();
        fr.setVisible(true);
    }
}
