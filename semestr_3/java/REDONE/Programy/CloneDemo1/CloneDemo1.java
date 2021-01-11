import java.util.*;

public class CloneDemo1
{
    public static void main(String[] args)
    {
        try {
            Pracownik original = new Pracownik("John Q. Public", 50000);
            original.setDataZatrudnienia(2000, 1, 1);
            Pracownik copy = (Pracownik) original.clone();
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

    // Przed wersją Javy 1.4 metoda clone musiała zwracać obiekt klasy Object
    public Object clone() throws CloneNotSupportedException
    {
        // wywołanie metody Object.clone()
        Object cloned = super.clone();

        // klonowanie modyfikowalnego pola
        ((Pracownik)cloned).dataZatrudnienia = (Date)dataZatrudnienia.clone();

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

