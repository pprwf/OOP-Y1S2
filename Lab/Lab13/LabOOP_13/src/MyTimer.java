import java.awt.*;
import javax.swing.*;

public class MyTimer extends JLabel implements Runnable {
    public void run () {
        int timer = 0;
        while (true) {
            try {
                Thread.sleep(1000);
                timer++;
                setFont(new Font("Bai Jamjuree", Font.PLAIN, 40));
                setText(String.format("%02d:%02d:%02d", timer / 3600, (timer / 60) % 60, timer % 60));
            } 
            catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
