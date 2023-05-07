import java.awt.event.*;
import java.io.*;

public class TextEditorController implements ActionListener{
    private TextEditorView te;
    private TextEditorModel tm;
    
    public TextEditorController () {
        te = new TextEditorView();
        tm = new TextEditorModel();
        
        te.getNw().addActionListener(this);
        te.getOp().addActionListener(this);
        te.getSv().addActionListener(this);
        te.getCl().addActionListener(this);
    }
    
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource().equals(te.getNw())) {
            te.getAr().setText("");
        }
        else if (ae.getSource().equals(te.getCl())) {
            te.getFr().dispose();
        }
        else if (ae.getSource().equals(te.getOp())) {
            tm.opened(te.getFr());
            te.getAr().setText("");
            try (InputStreamReader is = new InputStreamReader(new FileInputStream(tm.getF()), "UTF-8");) {
                int txt = is.read();
                while (txt != -1) {
                    te.getAr().append((char) txt + "");
                    txt = is.read();
                }
                System.out.println("Done opened.");
            }
            catch (Exception e) {
                e.printStackTrace();
            }
        }
        else if (ae.getSource().equals(te.getSv())) {
            tm.save(te.getFr());
            try (OutputStreamWriter os = new OutputStreamWriter(new FileOutputStream(tm.getF()), "UTF-8");) {
                os.write(te.getAr().getText());
                System.out.println("Done saving.");
            }
            catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
    
    public static void main(String[] args) {
        new TextEditorController();
    }
}
