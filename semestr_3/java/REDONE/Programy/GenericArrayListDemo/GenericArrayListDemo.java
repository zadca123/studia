import java.util.*;

public class GenericArrayListDemo
{
    public static void main(String args[])
    {
        ArrayList<String> lang = new ArrayList<String>();
        lang.add("Python");
        lang.add("C");
        lang.add("C++");
        lang.add("Java");
        // lang.add (new Date());  // powoduje błąd kompilacji
        for (String e : lang) {
            System.out.println(e.length() + ": " + e);
        }
    }
}

