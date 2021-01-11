import java.util.*;

public class SimpleEnum
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Wprowadź swój rozmiar: (SMALL, MEDIUM, LARGE, EXTRA_LARGE) ");
        String input = in.next().toUpperCase();
        Size size = Enum.valueOf(Size.class, input);
        System.out.println("rozmiar = " + size);
        if (size == Size.SMALL) {
            System.out.println("Naprawdę masz taki rozmiar ?");
        }
    }
}

enum Size {
    SMALL, MEDIUM, LARGE, EXTRA_LARGE
}

