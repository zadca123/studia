import java.util.*;

public class TestNewComparable
{
    public static void main(String[] args)
    {
        Pracownik[] personel = new Pracownik[3];

        personel[0] = new Pracownik("Harry Hacker", 35000);
        personel[1] = new Pracownik("Carl Cracker", 75000);
        personel[2] = new Pracownik("Tony Tester", 38000);

        Arrays.sort(personel);

        for (Pracownik e : personel) {
            System.out.println("nazwisko=" + e.getNazwisko() + ",pobory=" + e.getPobory());
        }
    }
}

class Pracownik implements Comparable<Pracownik>
{
    public Pracownik(String n, double s)
    {
        nazwisko = n;
        pobory = s;
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

