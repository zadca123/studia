// Na podstawie książki Cay Horstmann, Gary Cornell.
// "Java (TM). Podstawy." Wydanie VIII"

import java.awt.*;        // Toolkit
import java.awt.event.*;  // ActionEvent, ActionListener
import java.util.*;       // Date
import javax.swing.*;     // JOptionPane
import javax.swing.Timer; // aby rozwiązać konflikt z klasą java.util.Timer

public class TimerDemo
{
    public static void main(String[] args)
    {
        ActionListener listener = new TimePrinter();

        // Konstruuje obiekt klasy Timer,
        // który wywołuje słuchacza co 5 sekund
        Timer t = new Timer(5000, listener);
        t.start();

        JOptionPane.showMessageDialog(null, "Quit program?");
        System.exit(0);
    }
}

class TimePrinter implements ActionListener
{
    public void actionPerformed(ActionEvent event)
    {
        Date now = new Date();
        System.out.println("W momencie dźwięku, bieżący czas to " + now);
        Toolkit.getDefaultToolkit().beep();
    }
}

