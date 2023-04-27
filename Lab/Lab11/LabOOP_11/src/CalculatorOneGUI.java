import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class CalculatorOneGUI implements ActionListener {
    private JFrame fr;
    private JPanel p;
    private JTextField txt1, txt2, txt3;
    private JButton b1, b2, b3, b4;
    private double result, num1, num2;
    public CalculatorOneGUI () {
        fr = new JFrame ("Calculator");
        p = new JPanel ();
        txt1 = new JTextField ();
        txt2 = new JTextField ();
        txt3 = new JTextField ();
        b1 = new JButton ("Plus");
        b2 = new JButton ("Minus");
        b3 = new JButton ("Multiply");
        b4 = new JButton ("Divide");
        
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
        
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fr.pack();
        fr.setVisible(true);
    }
    public void actionPerformed (ActionEvent ae) {
        num1 = Double.parseDouble(txt1.getText());
        num2 = Double.parseDouble(txt2.getText());
        if (ae.getSource().equals(b1)) {
            result = num1 + num2;
        }
        else if (ae.getSource().equals(b2)) {
            result = num1 - num2;
        }
        else if (ae.getSource().equals(b3)) {
            result = num1 * num2;
        }
        else {
            result = num1 / num2;
        }
        txt3.setText(String.valueOf(result));
    }
}
