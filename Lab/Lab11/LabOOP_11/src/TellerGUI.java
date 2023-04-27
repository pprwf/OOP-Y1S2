import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class TellerGUI implements ActionListener{
    private JFrame fr;
    private JPanel p1, p2;
    private JLabel l1, l2;
    private JTextField txt1, txt2;
    private JButton b1, b2, b3;
    private Account acct;
    private double amount;
    public TellerGUI () {
        acct = new Account(6000, "Frank");
        fr = new JFrame("Teller GUI");
        p1 = new JPanel();
        p2 = new JPanel();
        l1 = new JLabel(" Balance");
        l2 = new JLabel(" Amount");
        txt1 = new JTextField(String.valueOf(acct.getBalance()));
        txt2 = new JTextField();
        b1 = new JButton("Deposit");
        b2 = new JButton("Withdraw");
        b3 = new JButton("Exit");
        
        fr.setLayout(new GridLayout(2, 1));
        p1.setLayout(new GridLayout(2, 2));
        p2.setLayout(new FlowLayout());
        txt1.setEnabled(false);
        
        p1.add(l1);
        p1.add(txt1);
        p1.add(l2);
        p1.add(txt2);
        p2.add(b1);
        p2.add(b2);
        p2.add(b3);
        fr.add(p1);
        fr.add(p2);
        
        b1.addActionListener(this);
        b2.addActionListener(this);
        
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fr.setBounds(500, 250, 300, 200);
        fr.setVisible(true);
    }
    public void actionPerformed (ActionEvent ae) {
        amount = Double.parseDouble(txt2.getText());
        if (ae.getSource().equals(b1)) {
            acct.setBalance(acct.getBalance() + amount);
        }
        else if (ae.getSource().equals(b2) && acct.getBalance() >= amount) {
            acct.setBalance(acct.getBalance() - amount);
        }
        txt1.setText(String.valueOf(acct.getBalance()));
    }
}
