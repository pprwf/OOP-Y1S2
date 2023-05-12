import java.awt.event.*;

public class MemberController implements ActionListener {
    private MemberView mv;
    private MemberModel md;
    private MemberShowData ms;
    public MemberController () {
        mv = new MemberView();
        md = new MemberModel();
        ms = new MemberShowData();
        
        mv.getOp().addActionListener(this);
        mv.getSv().addActionListener(this);
        mv.getCla().addActionListener(this);
        mv.getEx().addActionListener(this);
        mv.getAdd().addActionListener(this);
        mv.getEd().addActionListener(this);
        mv.getUpd().addActionListener(this);
        mv.getDel().addActionListener(this);
    }
    public void actionPerformed (ActionEvent ae) {
        if (ae.getSource().equals(mv.getOp())) {
            md.opened(mv.getFr());
        }
        else if (ae.getSource().equals(mv.getSv())) {
            md.saving(mv.getFr());
        }
        else if (ae.getSource().equals(mv.getCla())) {
            
        }
        else if (ae.getSource().equals(mv.getEx())) {
            mv.getFr().dispose();
        }
        else if (ae.getSource().equals(mv.getAdd())) {
            new MemberAddView();
        }
    }
}
