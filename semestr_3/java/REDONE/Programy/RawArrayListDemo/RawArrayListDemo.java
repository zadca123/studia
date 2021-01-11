import java.util.*;

public class RawArrayListDemo
{
    public static void main(String args[])
    {
        ArrayList lang = new ArrayList();
        lang.add("Python");
        lang.add("C");
        lang.add("C++");
        lang.add("Java");

        lang.add (new Date()); // powoduje błąd wykonania
        for (Object e : lang) {
            // konieczne rzutowanie
            System.out.println(((String) e).length() + ": " + e);
        }
    }
}

