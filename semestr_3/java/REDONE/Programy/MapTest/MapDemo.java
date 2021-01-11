// Na podstawie książki Cay Horstmann, Gary Cornell.
// "Java (TM). Podstawy." Wydanie VIII

import java.util.*;

public class MapDemo
{
    public static void main(String[] args)
    {
        Map<String, Pracownik> personel = new HashMap<String, Pracownik>();

        personel.put("144-25-5464", new Pracownik("Amy Lee"));
        personel.put("567-24-2546", new Pracownik("Harry Hacker"));
        personel.put("157-62-7935", new Pracownik("Gary Cooper"));
        personel.put("456-62-5527", new Pracownik("Francesca Cruz"));

        // wydruk wszystkich pozycji
        System.out.println(personel);

        // usunięcie wartości
        personel.remove("567-24-2546");

        // podmienienie pozycji
        personel.put("456-62-5527", new Pracownik("Francesca Miller"));

        // wyszukanie wartości
        System.out.println(personel.get("157-62-7935"));

        // iteracja przez wszystkie pozycje
        for (Map.Entry<String, Pracownik> wpis : personel.entrySet()) {
            String key = wpis.getKey();
            Pracownik value = wpis.getValue();
            System.out.println("klucz: " + key + ", wartość: " + value);
        }
    }
}

// Zminimalizowana klasa Pracownik do celów testowych.
class Pracownik
{
    // Tworzy obiekt Pracownik z pensją w wysokości 0.
    public Pracownik(String nazwisko)
    {
        this.nazwisko = nazwisko;
        pobory = 0;
    }

    public String toString()
    {
        return "[Imię i nazwisko: " + nazwisko + ", pobory: " + pobory + "]";
    }

    private String nazwisko;
    private double pobory;
}

