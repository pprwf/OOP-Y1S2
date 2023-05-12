import java.util.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class MemberAddView implements ActionListener {
    private JFrame fr;
    private JPanel p1, p2;
    private JLabel id, name, phone, detail;
    private JTextField txt1, txt2, txt3;
    private JTextArea ar;
    private JScrollBar sb;
    private JButton add;
    private int textcount;
    private Random rand;
    public MemberAddView () {
        fr = new JFrame();
        p1 = new JPanel();
        p2 = new JPanel();
        id = new JLabel("ID");
        txt1 = new JTextField();
        name = new JLabel("name");
        txt2 = new JTextField();
        phone = new JLabel("phone number");
        txt3 = new JTextField();
        detail = new JLabel("detail (" + textcount + "/150)");
        ar = new JTextArea();
        sb = new JScrollBar();
        add = new JButton("Add");
        rand = new Random();
        
        p1.setLayout(new GridLayout(7, 1));
        ar.setLineWrap(true);
        ar.setRows(10);
        ar.setColumns(30);
        txt1.setEditable(false);
        
        p1.add(id);
        p1.add(txt1);
        p1.add(name);
        p1.add(txt2);
        p1.add(phone);
        p1.add(txt3);
        p1.add(detail);
        fr.add(p1, BorderLayout.NORTH);
        sb.add(ar);
        fr.add(ar);
        p2.add(add);
        fr.add(p2, BorderLayout.SOUTH);
        
        add.addActionListener(this);
        
        fr.setSize(350, 400);
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fr.setVisible(true);
    }
    public void actionPerformed (ActionEvent ae) {
        if (ae.getSource().equals(add)) {
            if (txt2.getText().isBlank()) {
                new JOptionPane().showMessageDialog(null, "please insert your name", "", JOptionPane.ERROR_MESSAGE);
            }
            else if (txt3.getText().length() != 10) {
                new JOptionPane().showMessageDialog(null, "please enter a 10-digit phone number", "", JOptionPane.ERROR_MESSAGE);
            }
            else {
                try {
                    Integer.parseInt(txt3.getText());
                    new JOptionPane().showMessageDialog(null, "done", "", JOptionPane.PLAIN_MESSAGE);
                    txt2.setText("");
                    txt3.setText("");
                    ar.setText("");
                }
                catch (NumberFormatException e) {
                    new JOptionPane().showMessageDialog(null, "please insert number", "", JOptionPane.ERROR_MESSAGE);
                }
            }
        }
    }
}
