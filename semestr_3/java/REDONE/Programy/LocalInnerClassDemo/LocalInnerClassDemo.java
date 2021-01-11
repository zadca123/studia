import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.Timer;

public class LocalInnerClassDemo
{
    public static void main(String[] args)
    {
        TalkingClock clock = new TalkingClock();
        clock.start(1000, true);
        JOptionPane.showMessageDialog(null, "Wyjść z programu?");
        System.exit(0);
    }
}

class TalkingClock
{
    // argument beep musi być final, aby metoda actionPerformed
    // klasy TimePrinter miała do niego dostęp
    public void start(int interval, final boolean beep)
    {
        // W tym miejscu klasa wewnętrzna nie może być ani publiczna ani prywatna
        class TimePrinter implements ActionListener
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
        ActionListener listener = new TimePrinter();
        Timer t = new Timer(interval, listener);
        t.start();
    }
}

