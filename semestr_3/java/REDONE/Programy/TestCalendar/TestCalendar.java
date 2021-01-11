// Na podstawie książki Cay Horstmann, Gary Cornell. 
// "Java (TM). Podstawy." Wydanie VIII"

import java.util.*;

public class TestCalendar {
  
  public static void main(String[] args) {
    // Ustaw w zmiennej d bieżącą datę
    GregorianCalendar d = new GregorianCalendar();

    int today = d.get(Calendar.DAY_OF_MONTH);
    int month = d.get(Calendar.MONTH);

    // Ustaw d na początek bieżącego miesiąca
    d.set(Calendar.DAY_OF_MONTH, 1);

    int weekday = d.get(Calendar.DAY_OF_WEEK);

    // Wyświetl nagłówek
    System.out.println(" ni  po  wt  śr  cz  pi  so");

    // Zrób wcięcie dla pierwszej linii kalendarza
    for (int i = Calendar.SUNDAY; i < weekday; ++i) {
      System.out.print("    ");
    }

    do {
      // Wypisz dzień
      int day = d.get(Calendar.DAY_OF_MONTH);
      System.out.printf("%3d", day);

      // Oznacz bieżący dzień symbolem  *
      if (day == today) {
        System.out.print("*");
      } else {
        System.out.print(" ");
      }

      // Przejdź do nowej linii po każdej sobocie
      if (weekday == Calendar.SATURDAY) {
        System.out.println();
      }

      // Przejdź do nastepnego dnia
      d.add(Calendar.DAY_OF_MONTH, 1);
      weekday = d.get(Calendar.DAY_OF_WEEK);
    
    // iteracja kończy się, gdy d ma wartość 
    // pierwszego dnia następnego miesiąca
    
    } while (d.get(Calendar.MONTH) == month);

    // Przejdź do nowej linii, jeśli to potrzebne
    if (weekday != Calendar.SUNDAY) {
      System.out.println();
    }
  }

}

