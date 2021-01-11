import java.util.*;

public class TestArrayList {

    public static void main (String args[]) {
        ArrayList<String> lang = new ArrayList<String>();
        lang.add ("C++");
        lang.add ("Java");
        lang.add ("Python");
        // lang.add (new Date());  // powoduje błąd kompilacji
        for (String l : lang) {
            System.out.println(l.length() + ": " + l);
        }
    }

}

