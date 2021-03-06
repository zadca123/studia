import java.util.Date;
import java.util.Arrays;

public class TestCloneArray
{
    public static void main(String[] args)
    {
        // do skopiowania tablicy, której elementy są
        // wartościami typu podstawowego wystarczy metoda clone
        int[] a = new int[10];
        int[] b = a.clone();

        String[] s = {"One", "Two", "Three"};
        String[] t = s.clone();  // płytkie kopiowanie

        s[0] = "Raz";

        System.out.println(s[0]);  // Raz
        System.out.println(t[0]);  // One

        Date[] d = {new Date(), new Date(), new Date()};
        Date[] e = d.clone();  // płytkie kopiowanie

        d[0].setTime(0);

        System.out.println(d[0]);
        System.out.println(e[0]);

        Date[] f = Arrays.copyOf(d, d.length); // płytkie kopiowanie

        d[1].setTime(0);

        System.out.println(d[1]);
        System.out.println(f[1]);
    }
}

