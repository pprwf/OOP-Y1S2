import java.util.*;
import java.awt.*;
import javax.swing.*;

public class MyClock extends JLabel implements Runnable {
    private Calendar d;
    private int sec, min, hour;
    public void run () {
        while (true) {
            try {
                Thread.sleep(1000);
                d = Calendar.getInstance();
                sec = d.get(Calendar.SECOND);
                min = d.get(Calendar.MINUTE);
                hour = d.get(Calendar.HOUR_OF_DAY);
                setFont(new Font("Bai Jamjuree", Font.PLAIN, 40));
                setText(String.format("%02d:%02d:%02d", hour, min, sec));
            }
            catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
