import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class PoringConstructor implements ActionListener {
    private JFrame fr;
    private JButton b;
    private int num;
    public PoringConstructor () {
        fr = new JFrame();
        b = new JButton("Add");
        
        fr.setLayout(new FlowLayout());
        
        fr.add(b);
        b.addActionListener(this);
        
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fr.pack();
        fr.setLocationRelativeTo(null);
        fr.setVisible(true);
    }
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource().equals(b)) {
            num += 1;
            new Poring(num).start();
        }
    }
}
