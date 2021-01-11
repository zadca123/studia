import java.util.*;

public class CloneDemo2
{
    public static void main(String[] args)
    {
        try {
            Pracownik original = new Pracownik("John Q. Public", 50000);
            original.setDataZatrudnienia(2000, 1, 1);
            Pracownik copy = original.clone();
            copy.zwiekszPobory(10);
            copy.setDataZatrudnienia(2002, 12, 31);
            System.out.println();
            System.out.println("oryginał: " + original);
            System.out.println("kopia:    " + copy);
            System.out.println();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}

class Pracownik implements Cloneable
{
    public Pracownik(String nazwisko, double pobory)
    {
        this.nazwisko = nazwisko;
        this.pobory = pobory;
    }

    // Od wersji Javy 1.5 metoda clone może zwracać obiekt klasy, w której jest zdefiniowana
    public Pracownik clone() throws CloneNotSupportedException
    {
        // wywołanie metody Object.clone()
        Pracownik cloned = (Pracownik) super.clone();

        // klonowanie modyfikowalnego pola
        cloned.dataZatrudnienia = (Date)dataZatrudnienia.clone();

        return cloned;
    }

    public void setDataZatrudnienia(int year, int month, int day)
    {
        dataZatrudnienia = new GregorianCalendar(year, month - 1, day).getTime();
    }

    public void zwiekszPobory(double procent)
    {
        double podwyzka = pobory * procent / 100;
        pobory += podwyzka;
    }

    public String toString()
    {
        return "Pracownik[nazwisko = " + nazwisko
               + ", pobory = " + pobory
               + ", dataZatrudnienia = " + dataZatrudnienia
               + "]";
    }

    private String nazwisko;
    private double pobory;
    private Date dataZatrudnienia;
}

