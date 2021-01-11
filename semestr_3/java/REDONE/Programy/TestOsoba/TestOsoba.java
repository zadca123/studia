import java.util.*;

public class TestOsoba
{
    public static void main(String[] args)
    {
        Osoba[] ludzie = new Osoba[2];

        ludzie[0] = new Pracownik("Jan Kowalski", 50000);
        ludzie[1] = new Student("Małgorzata Nowak", "informatyka");
        // ludzie[2] = new Osoba("Dyl Sowizdrzał");

        for (Osoba p : ludzie) {
            System.out.println(p.getNazwisko() + ": " + p.getOpis());
        }
    }
}

abstract class Osoba
{
    public Osoba(String nazwisko)
    {
        this.nazwisko = nazwisko;
    }

    public abstract String getOpis();

    public String getNazwisko()
    {
        return nazwisko;
    }

    private String nazwisko;
}

class Pracownik extends Osoba
{
    public Pracownik(String nazwisko, double pobory)
    {
        super(nazwisko);
        this.pobory = pobory;
    }

    public double getPobory()
    {
        return pobory;
    }

    public String getOpis()
    {
        return String.format("pracownik z pensją %.2f zł", pobory);
    }

    private double pobory;
}


class Student extends Osoba
{
    public Student(String nazwisko, String kierunek)
    {
        super(nazwisko);
        this.kierunek = kierunek;
    }

    public String getOpis()
    {
        return "kierunek studiów: " + kierunek;
    }

    private String kierunek;
}

