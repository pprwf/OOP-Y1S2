import java.awt.*;
import java.awt.event.*;
import java.io.*;
import javax.swing.*;

public class StudentView implements ActionListener, WindowListener {
    private JFrame fr;
    private JPanel p1, p2;
    private JLabel li, ln, lm;
    private JTextField txt1, txt2, txt3;
    private JButton bd, bw;
    private Student s;
    public StudentView () {
        s = new Student();
        
        fr = new JFrame();
        p1 = new JPanel();
        p2 = new JPanel();
        li = new JLabel("ID :");
        ln = new JLabel("Name :");
        lm = new JLabel("Money :");
        txt1 = new JTextField();
        txt2 = new JTextField();
        txt3 = new JTextField("" + s.getMoney());
        bd = new JButton("Deposit");
        bw = new JButton("Withdraw");
        
        fr.setLayout(new BorderLayout());
        p1.setLayout(new GridLayout(3, 2));
        p2.setLayout(new FlowLayout());
        txt3.setEnabled(false);
        
        fr.addWindowListener(this);
        bd.addActionListener(this);
        bw.addActionListener(this);
        
        p1.add(li);
        p1.add(txt1);
        p1.add(ln);
        p1.add(txt2);
        p1.add(lm);
        p1.add(txt3);
        fr.add(p1);
        p2.add(bd);
        p2.add(bw);
        fr.add(p2, BorderLayout.SOUTH);
        
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fr.pack();
        fr.setVisible(true);
    }
    public void actionPerformed (ActionEvent ae) {
        try {
            s.setID(Integer.parseInt(txt1.getText()));
            s.setName(txt2.getText());
            if (ae.getSource().equals(bd)) {
                s.setMoney(s.getMoney() + 100);
                txt3.setText(String.valueOf(s.getMoney()));
            }
            else if (ae.getSource().equals(bw)) {
                    if (s.getMoney() >= 100) {
                    s.setMoney(s.getMoney() - 100);
                    txt3.setText(String.valueOf(s.getMoney()));
                }
            }
        }
        catch (NumberFormatException e) {
            System.out.println(e);
        }
    }

    public void windowOpened(WindowEvent we) {
        if (new File ("StudentM.dat").exists()) {
            try (FileInputStream fis = new FileInputStream("StudentM.dat");
                ObjectInputStream ois = new ObjectInputStream(fis);) {
            s = (Student) ois.readObject();
            txt1.setText(s.getID() + "");
            txt2.setText(s.getName() + "");
            txt3.setText(s.getMoney() + "");
            }
            catch (Exception e) {
                System.out.println(e);
            }
        }
    }

    public void windowClosing(WindowEvent we) {
        try (FileOutputStream fos = new FileOutputStream("StudentM.dat");
                ObjectOutputStream oos = new ObjectOutputStream(fos);) {
            oos.writeObject(s);
        }
        catch (Exception e) {
            System.out.println(e);
        }
    }

    public void windowClosed(WindowEvent e) {}

    public void windowIconified(WindowEvent e) {}

    public void windowDeiconified(WindowEvent e) {}

    public void windowActivated(WindowEvent e) {}

    public void windowDeactivated(WindowEvent e) {}
}
