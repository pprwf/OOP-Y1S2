import javax.swing.*;

public class MemberShowData {
    private JFrame fr;
    private JTextArea ar;
    public MemberShowData () {
        fr = new JFrame();
        ar = new JTextArea("no information found");
        
        ar.setEditable(false);
        
        fr.add(ar);
        
        fr.setSize(480, 320);
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fr.setVisible(true);
    }
}
