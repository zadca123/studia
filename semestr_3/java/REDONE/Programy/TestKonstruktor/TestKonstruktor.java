// Na podstawie książki Cay Horstmann, Gary Cornell.
// "Java (TM). Podstawy." Wydanie VIII"

// import java.util.*;
import java.util.Random;

public class TestKonstruktor
{
    public static void main(String[] args)
    {
        Pracownik[] personel = new Pracownik[3];

        personel[0] = new Pracownik("Harry", 40000);
        personel[1] = new Pracownik(60000);
        personel[2] = new Pracownik();

        for (Pracownik e : personel) {
            System.out.println(
                "nazwisko=" + e.getNazwisko() + ",id=" + e.getId()
                + ",pobory=" + e.getPobory()
            );
        }
    }
}

class Pracownik
{
    // trzy przeciążone konstruktory
    public Pracownik(String n, double s)
    {
        nazwisko = n;
        pobory = s;
    }

    public Pracownik(double s)
    {
        // wywołanie konstroktora Pracownik(String, double)
        this("Pracownik #" + nastId, s);
    }

    // konstruktor domyślny
    public Pracownik()
    {
        // nazwisko zainicjalizowane na "" w deklaracji pola nazwisko
        // pobory zainicjalizowane domyślnie na 0.0
        // id zainicjalizowane w bloku inicjalizacyjnym
    }

    public String getNazwisko()
    {
        return nazwisko;
    }

    public double getPobory()
    {
        return pobory;
    }

    public int getId()
    {
        return id;
    }

    private static int nastId;

    private int id;
    private String nazwisko = ""; // inicjalizacja pola obiektu
    private double pobory;

    // blok inicjalizacyjny dla pól statycznych
    static
    {
        Random generator = new Random();
        // ustawia statyczne pole nastId na pseudolosową wartość
        // z przedziału od 0 do 9999
        nastId = generator.nextInt(10000);
    }

    // blok inicjalizacyjny dla obiektów
    {
        id = nastId;
        ++nastId;
    }
}

