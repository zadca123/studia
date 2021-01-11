// Na podstawie książki Cay Horstmann, Gary Cornell.
// "Java (TM). Podstawy." Wydanie VIII"

import java.awt.*;        // Toolkit
import java.awt.event.*;  // ActionEvent, ActionListener
import java.util.*;       // Scanner
import java.time.*;       // LocalDateTime
import javax.swing.Timer; // aby rozwiązać konflikt z klasą java.util.Timer

public class ConsoleTimerDemo
{
    public static void main(String[] args)
    {
        ActionListener listener = new TimePrinter();

        // Konstruuje obiekt klasy Timer,
        // który wywołuje słuchacza co 5 sekund
        Timer t = new Timer(5000, listener);
        t.start();

        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        System.exit(0);
    }
}

class TimePrinter implements ActionListener
{
    public void actionPerformed(ActionEvent event)
    {
        LocalDateTime now = LocalDateTime.now();
        System.out.println("W momencie dźwięku, bieżący czas to " + now);
        Toolkit.getDefaultToolkit().beep();
    }
}

