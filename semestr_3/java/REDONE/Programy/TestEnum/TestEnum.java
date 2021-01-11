// Na podstawie książki Cay Horstmann, Gary Cornell.
// "Java (TM). Podstawy." Wydanie VIII"

import java.util.*;

public class TestEnum
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Wprowadź swój rozmiar: (SMALL, MEDIUM, LARGE, EXTRA_LARGE) ");
        String input = in.next().toUpperCase();
        Size size = Enum.valueOf(Size.class, input);
        System.out.println("rozmiar = " + size);
        System.out.println("skrót = " + size.getAbbreviation());
        if (size == Size.SMALL) {
            System.out.println("Naprawdę masz taki rozmiar?");
        }
    }
}

enum Size {
    SMALL("S"), MEDIUM("M"), LARGE("L"), EXTRA_LARGE("XL");

    private Size(String abbreviation)
    {
        this.abbreviation = abbreviation;
    }

    public String getAbbreviation()
    {
        return abbreviation;
    }

    private String abbreviation;
}

