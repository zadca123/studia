import java.util.*;

public class TestOldArrayList {

    public static void main(String args[])
    {
        ArrayList lang = new ArrayList();
        lang.add("C++");
        lang.add("Java");
        lang.add("Python");

        // lang.add (new Date()); // powoduje błąd wykonania
        for (Object e : lang) {
            // konieczne rzutowanie
            System.out.println(((String) e).length() + ": " + e);
        }
    }

}

