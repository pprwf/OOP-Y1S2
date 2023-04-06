import java.awt.*;
import javax.swing.*;

public class TellerGUI {
      public TellerGUI() {
            JFrame fr = new JFrame("Teller GUI");
            JPanel p1 = new JPanel();
            JPanel p2 = new JPanel();
            JLabel l1 = new JLabel("Balance");
            JLabel l2 = new JLabel("Amount");
            JTextField txt1 = new JTextField("6000");
            JTextField txt2 = new JTextField();
            JButton b1 = new JButton("Deposit");
            JButton b2 = new JButton("Withdraw");
            JButton b3 = new JButton("Exit");
            
            fr.setLayout(new GridLayout(2, 0));
            p1.setLayout(new GridLayout(2, 2));
            p2.setLayout(new FlowLayout());
            
            txt1.setEnabled(false);
            
            p1.add(l1);
            p1.add(txt1);
            p1.add(l2);
            p1.add(txt2);
            fr.add(p1);
            p2.add(b1);
            p2.add(b2);
            p2.add(b3);
            fr.add(p2);
            
            fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            fr.setBounds(500, 250, 300, 200);
            fr.setVisible(true);
      }
}
