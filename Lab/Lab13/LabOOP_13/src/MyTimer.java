import java.awt.*;
import javax.swing.*;

public class MyTimer extends JLabel implements Runnable {
    private final Object lock = new Object();
    private boolean pausing;
    
    public boolean isPausing() {
        return pausing;
    }
    
    public void pause () {
        synchronized (lock) {
            pausing = true;
        }
    }
    
    public void resume () {
        synchronized (lock) {
            pausing = false;
            lock.notifyAll();
        }
    }
    
    public void run () {
        int timer = 0;
        while (true) {
            try {
                synchronized (lock) {
                    while (pausing) {
                        lock.wait();
                    }
                }
                Thread.sleep(1000);
                setFont(new Font("Bai Jamjuree", Font.PLAIN, 40));
                timer++;
                setText(String.format("%02d:%02d:%02d", timer / 3600, (timer / 60) % 60, timer % 60));
            }
            catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
