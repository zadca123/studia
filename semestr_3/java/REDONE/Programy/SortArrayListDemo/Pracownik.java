import java.util.*;

public class Pracownik implements Comparable<Pracownik>
{
    public Pracownik(String nazwisko, double pobory)
    {
        this.nazwisko = nazwisko;
        this.pobory = pobory;
    }

    public String getNazwisko()
    {
        return nazwisko;
    }

    public double getPobory()
    {
        return pobory;
    }

    public int compareTo(Pracownik other)
    {
        if (pobory < other.pobory) {
            return -1;
        }
        if (pobory > other.pobory) {
            return 1;
        }
        return 0;
    }

    private String nazwisko;
    private double pobory;
}

