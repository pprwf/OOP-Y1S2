import java.io.*;
import javax.swing.*;

public class MemberModel {
    private JFileChooser fc;
    private File f;
    public MemberModel () {
        fc = new JFileChooser();
    }
    public void saving (JFrame fr) {
        fc.showSaveDialog(fr);
        f = fc.getSelectedFile();
    }
    public void opened (JFrame fr) {
        fc.showOpenDialog(fr);
        f = fc.getSelectedFile();
    }
}
