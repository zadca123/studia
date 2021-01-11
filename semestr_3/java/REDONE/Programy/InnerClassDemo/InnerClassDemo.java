import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.Timer;

public class InnerClassDemo
{
    public static void main(String[] args)
    {
        TalkingClock clock = new TalkingClock(1000, true);
        clock.start();
        JOptionPane.showMessageDialog(null, "Wyjść z programu?");
        System.exit(0);
    }
}

class TalkingClock
{
    public TalkingClock(int interval, boolean beep)
    {
        this.interval = interval;
        this.beep = beep;
    }

    public void start()
    {
        ActionListener listener = new TimePrinter();
        Timer t = new Timer(interval, listener);
        t.start();
    }

    private int interval;
    private boolean beep;

    // W tym miejscu klasa wewnętrzna może mieć zasięg publiczny, pakietowy lub prywatny
    private class TimePrinter implements ActionListener
    {
        public void actionPerformed(ActionEvent event)
        {
            Date now = new Date();
            System.out.println("Czas w momencie dźwięku: " + now);

            if (beep) {
                Toolkit.getDefaultToolkit().beep();
            }
        }
    }
}

