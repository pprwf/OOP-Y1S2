import java.awt.*;
import javax.swing.*;

public class MemberView {
    private JFrame fr;
    private JPanel p1, p2, p3;
    private JMenuBar bar;
    private JMenu fi;
    private JMenuItem op, sv, cla, ex;
    private JLabel id, name, phone, detail;
    private JTextField txt1, txt2, txt3;
    private JTextArea ar;
    private JComboBox cb;
    private JButton add, ed, upd, del;
    public MemberView () {
        fr = new JFrame();
        p1 = new JPanel();
        p2 = new JPanel();
        p3 = new JPanel();
        bar = new JMenuBar();
        fi = new JMenu("File");
        op = new JMenuItem("Open");
        sv = new JMenuItem("Save");
        cla = new JMenuItem("Clear All");
        ex = new JMenuItem("Exit");
        id = new JLabel("ID");
        txt1 = new JTextField();
        name = new JLabel("name");
        txt2 = new JTextField();
        phone = new JLabel("phone number");
        txt3 = new JTextField();
        detail = new JLabel("detail (0/150)");
        ar = new JTextArea();
        cb = new JComboBox();
        add = new JButton("Add");
        ed = new JButton("Edit");
        upd = new JButton("Update");
        del = new JButton("Delete");
        
        fr.setJMenuBar(bar);
        txt1.setEditable(false);
        txt2.setEditable(false);
        txt3.setEditable(false);
        ar.setEditable(false);
        ar.setSize(1, 20);
        ar.setBorder(BorderFactory.createLineBorder(Color.black));
        upd.setEnabled(false);
        del.setEnabled(false);
        cb.setEnabled(false);
        p1.setLayout(new GridLayout(7, 1));
        p2.setLayout(new BorderLayout());
        
        fi.add(op);
        fi.add(sv);
        fi.addSeparator();
        fi.add(cla);
        fi.addSeparator();
        fi.add(ex);
        bar.add(fi);
        
        p1.add(id);
        p1.add(txt1);
        p1.add(name);
        p1.add(txt2);
        p1.add(phone);
        p1.add(txt3);
        p1.add(detail);
        fr.add(p1, BorderLayout.NORTH);
        p2.add(ar);
        p2.add(cb, BorderLayout.SOUTH);
        fr.add(p2);
        p3.add(add);
        p3.add(ed);
        p3.add(upd);
        p3.add(del);
        fr.add(p3, BorderLayout.SOUTH);
        
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fr.setSize(400, 500);
        fr.setLocationRelativeTo(null);
        fr.setVisible(true);
    }

    public JFrame getFr() {
        return fr;
    }

    public JMenuItem getOp() {
        return op;
    }

    public JMenuItem getSv() {
        return sv;
    }

    public JMenuItem getCla() {
        return cla;
    }

    public JMenuItem getEx() {
        return ex;
    }
    public JButton getAdd() {
        return add;
    }

    public JButton getEd() {
        return ed;
    }

    public JButton getUpd() {
        return upd;
    }

    public JButton getDel() {
        return del;
    }
}
