// Na podstawie książki Cay Horstmann, Gary Cornell.
// "Java (TM). Podstawy." Wydanie VIII
// Program przeprowadza test wydajności sita Eratostenesa.
// Oblicza wszystkie liczby pierwsze w przedziale do 20 milionów.

import java.util.*;

public class Sieve
{
    public static void main(String[] s)
    {
        int n = 20000000;
        long start = System.currentTimeMillis();

        BitSet b = new BitSet(n + 1);

        for (int j = 2; j <= n; ++j) {
            b.set(j);
        }

        int count = 0;
        int j = 2;

        while (j * j <= n) {
            if (b.get(j)) {
                count++;
                int k = 2 * j;
                while (k <= n) {
                    b.clear(k);
                    k += j;
                }
            }
            ++j;
        }

        while (j <= n) {
            if (b.get(j)) {
                ++count;
            }
            ++j;
        }

        long end = System.currentTimeMillis();
        System.out.println("Liczb pierwszych: " + count);
        System.out.println((end - start) + " millisekund");
    }
}

