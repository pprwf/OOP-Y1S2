import java.awt.*;
import javax.swing.*;

public class CalculatorTwoGUI {
      public CalculatorTwoGUI () {
            JFrame fr = new JFrame("My Calculator");
            JPanel p = new JPanel();
            JTextField txt = new JTextField();
            JButton b1 = new JButton("1");
            JButton b2 = new JButton("2");
            JButton b3 = new JButton("3");
            JButton b4 = new JButton("4");
            JButton b5 = new JButton("5");
            JButton b6 = new JButton("6");
            JButton b7 = new JButton("7");
            JButton b8 = new JButton("8");
            JButton b9 = new JButton("9");
            JButton b0 = new JButton("0");
            JButton b_plus = new JButton("+");
            JButton b_minus = new JButton("-");
            JButton b_mult = new JButton("x");
            JButton b_divide = new JButton("/");
            JButton bc = new JButton("c");
            JButton b_equal = new JButton("=");
            
            fr.setLayout(new BorderLayout());
            p.setLayout(new GridLayout(4, 4));
            
            p.add(b7);
            p.add(b8);
            p.add(b9);
            p.add(b_plus);
            p.add(b4);
            p.add(b5);
            p.add(b6);
            p.add(b_minus);
            p.add(b1);
            p.add(b2);
            p.add(b3);
            p.add(b_mult);
            p.add(b0);
            p.add(bc);
            p.add(b_equal);
            p.add(b_divide);
            fr.add(txt, BorderLayout.NORTH);
            fr.add(p);
            
            fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            fr.setBounds(500, 200, 300, 300);
            fr.setVisible(true);
      }
}
