import java.awt.*;
import javax.swing.*;

public class TextEditorView {
    private JFrame fr;
    private JTextArea ar;
    private JMenuBar bar;
    private JMenu fm;
    private JMenuItem nw, op, sv, cl;
    public TextEditorView () {
        fr = new JFrame("My Text Editor");
        ar = new JTextArea(10,25);
        bar = new JMenuBar();
        fm = new JMenu("File");
        nw = new JMenuItem("New");
        op = new JMenuItem("Open");
        sv = new JMenuItem("Save");
        cl = new JMenuItem("Close");
        
        fr.setJMenuBar(bar);
        ar.setFont(new Font("Bai Jamjuree", Font.PLAIN, 14));
        bar.add(fm);
        fm.add(nw);
        fm.add(op);
        fm.add(sv);
        fm.addSeparator();
        fm.add(cl);
        fr.add(ar);
        
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fr.pack();
        fr.setLocationRelativeTo(null);
        fr.setVisible(true);
    }

    public JTextArea getAr() {
        return ar;
    }

    public JFrame getFr() {
        return fr;
    }

    public JMenuItem getNw() {
        return nw;
    }

    public JMenuItem getOp() {
        return op;
    }

    public JMenuItem getSv() {
        return sv;
    }

    public JMenuItem getCl() {
        return cl;
    }
}
