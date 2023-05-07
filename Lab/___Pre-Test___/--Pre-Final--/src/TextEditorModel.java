import java.io.*;
import javax.swing.*;

public class TextEditorModel {
    private JFileChooser fc;
    private File f;
    public TextEditorModel () {
        fc = new JFileChooser();
    }
    public void save(JFrame fr) {
        fc.showSaveDialog(fr);
        f = fc.getSelectedFile();
    }
    public void opened(JFrame fr) {
        fc.showOpenDialog(fr);
        f = fc.getSelectedFile();
    }
    public File getF() {
        return f;
    }
}
