import java.awt.*;
import javax.swing.*;

public class CalculatorTwoGUI {
    private JFrame fr;
    private JPanel p;
    private JButton b;
    private JTextField txt;
    private JButton b0, b1, b2, b3, b4, b5, b6, b7, b8, b9, b_del, b_plus, b_sub, b_mult, b_divide, b_equal;
    public CalculatorTwoGUI () {
        fr = new JFrame("My Calculator");
        p = new JPanel();
        txt = new JTextField();
        b0 = new JButton("0");
        b1 = new JButton("1");
        b2 = new JButton("2");
        b3 = new JButton("3");
        b4 = new JButton("4");
        b5 = new JButton("5");
        b6 = new JButton("6");
        b7 = new JButton("7");
        b8 = new JButton("8");
        b9 = new JButton("9");
        b_del = new JButton("c");
        b_plus = new JButton("+");
        b_sub = new JButton("-");
        b_mult = new JButton("x");
        b_divide = new JButton("/");
        b_equal = new JButton("=");
        
        fr.setLayout(new BorderLayout());
        p.setLayout(new GridLayout(4, 4));
        
        p.add(b7);
        p.add(b8);
        p.add(b9);
        p.add(b_plus);
        p.add(b4);
        p.add(b5);
        p.add(b6);
        p.add(b_sub);
        p.add(b1);
        p.add(b2);
        p.add(b3);
        p.add(b_mult);
        p.add(b0);
        p.add(b_del);
        p.add(b_equal);
        p.add(b_divide);
        fr.add(txt, BorderLayout.NORTH);
        fr.add(p);
        
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fr.setBounds(500, 200, 300, 300);
        fr.setVisible(true);
    }
}
