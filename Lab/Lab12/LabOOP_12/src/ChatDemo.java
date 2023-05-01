import java.io.*;
import java.time.*;
import java.time.format.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class ChatDemo implements ActionListener, WindowListener {
    private JFrame fr;
    private JPanel p;
    private JTextArea ar;
    private JTextField txt;
    private JButton b1, b2;
    private String str;
    public ChatDemo () {
        fr = new JFrame();
        p = new JPanel();
        ar = new JTextArea(20, 45);
        txt = new JTextField(45);
        b1 = new JButton("Submit");
        b2 = new JButton("Reset");
        
        fr.setLayout(new BorderLayout());
        p.setLayout(new FlowLayout());
        ar.setEnabled(false);
        
        p.add(b1);
        p.add(b2);
        fr.add(ar, BorderLayout.NORTH);
        fr.add(txt);
        fr.add(p, BorderLayout.SOUTH);
        
        fr.addWindowListener(this);
        b1.addActionListener(this);
        b2.addActionListener(this);
        
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fr.pack();
        fr.setVisible(true);
    }
    public void actionPerformed (ActionEvent ae) {
        if (ae.getSource().equals(b1)) {
            DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
            ar.append(dtf.format(LocalDateTime.now()) + ": " + txt.getText() + "\n");
            txt.setText("");
            txt.requestFocus();
        }
        else if (ae.getSource().equals(b2)) {
            ar.setText("");
            txt.setText("");
        }
    }

    public void windowOpened(WindowEvent we) {
        if (new File ("ChatDemo.dat").exists()) {
            try (FileInputStream fr = new FileInputStream("ChatDemo.dat");) {
                int st = fr.read();
                while (st != -1) {
                    ar.setText(ar.getText() + (char) st);
                    st = fr.read();
                }
            }
            catch (Exception e) {
                System.out.println(e);
            }
        }
    }

    public void windowClosing(WindowEvent we) {
        try (FileOutputStream fw = new FileOutputStream("ChatDemo.dat");) {
            for (int st = 0; st < ar.getText().length(); st++) {
                fw.write(ar.getText().charAt(st));
            }
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
