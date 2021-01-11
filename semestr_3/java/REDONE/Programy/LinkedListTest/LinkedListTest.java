// Na podstawie książki Cay Horstmann, Gary Cornell. Java 2. Podstawy.
// Program demonstrujący operacje na listach powiązanych.

import java.util.*;

public class LinkedListTest
{
    public static void main(String[] args)
    {
        List<String> a = new LinkedList<>();
        a.add("Amy");
        a.add("Carl");
        a.add("Erica");

        List<String> b = new LinkedList<>();
        b.add("Bob");
        b.add("Doug");
        b.add("Frances");
        b.add("Gloria");

        // umieszcza słowa listy b na liście a

        ListIterator<String> aIter = a.listIterator();
        Iterator<String> bIter = b.iterator();

        while (bIter.hasNext()) {
            if (aIter.hasNext()) {
                aIter.next();
            }
            aIter.add(bIter.next());
        }

        System.out.println(a);

        // usuwa co drugie słowo z listy b

        bIter = b.iterator();
        while (bIter.hasNext()) {
            bIter.next(); // przesuwa się o jeden element
            if (bIter.hasNext()) {
                bIter.next(); // przesuwa się do następnego elementu
                bIter.remove(); // i usuwa go
            }
        }

        System.out.println(b);

        // operacja masowa: usuwa wszystkie słowa
        // znajdujące się na liście b z listy a
        a.removeAll(b);

        System.out.println(a);
    }
}

