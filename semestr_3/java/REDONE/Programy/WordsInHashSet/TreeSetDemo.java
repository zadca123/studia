// Na podstawie książki Cay Horstmann, Gary Cornell.
// "Java (TM). Podstawy." Wydanie VIII

// Program wykorzystujący zbiór typu TreeSet
// w celu pokazania wszystkich słów odczytanych z System.in

import java.util.*;

public class TreeSetDemo
{
    public static void main(String[] args)
    {
        // Klasa TreeSet implementuje interfejs Set
        Set<String> words = new TreeSet<String>();
        long totalTime = 0;

        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {
            String word = in.next();
            long callTime = System.currentTimeMillis();
            words.add(word);
            callTime = System.currentTimeMillis() - callTime;
            totalTime += callTime;
        }

        Iterator<String> iter = words.iterator();
        for (int j = 1; j <= 20; ++j) {
            System.out.println(iter.next());
        }

        System.out.println(". . .");
        System.out.println(words.size() + " unikalnych słów. " + totalTime + " milisekund.");
    }
}

