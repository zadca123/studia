import java.util.*;
import java.text.*;

class Pracownik
{
    public Pracownik(String nazwisko, double pobory, int rok, int miesiac, int dzien)
    {
        this.nazwisko = nazwisko;
        this.pobory = pobory;
        GregorianCalendar calendar =
            new GregorianCalendar(rok, miesiac - 1, dzien);
        dataZatrudnienia = calendar.getTime();
    }

    public String getNazwisko()
    {
        return nazwisko;
    }

    public double getPobory()
    {
        return pobory;
    }

    public Date getDataZatrudnienia()
    {
        return (Date) dataZatrudnienia.clone();
    }

    public void zwiekszPobory(double procent)
    {
        double podwyzka = pobory * procent / 100;
        pobory += podwyzka;
    }

    public boolean equals(Object otherObject)
    {
        // sprawdzamy czy obie referncje: this oraz otherObject
        // odnoszą sie do tego samego obiektu
        if (this == otherObject) {
            return true;
        }

        // zwracamy false gdy argument ma wartość null
        if (otherObject == null) {
            return false;
        }

        // zwracamy false gdy obiekty różnych klas
        if (getClass() != otherObject.getClass()) {
            return false;
        }

        // teraz wiadomo, że otherObject jest referencją
        // do obiektu klasy Pracownik
        Pracownik other = (Pracownik) otherObject;

        // sprawdzamy czy pola mają identyczne wartości
        return nazwisko.equals(other.nazwisko)
               && pobory == other.pobory
               && dataZatrudnienia.equals(other.dataZatrudnienia);
    }

    public int hashCode()
    {
        return 7 * nazwisko.hashCode()
               + 11 * new Double(pobory).hashCode()
               + 13 * dataZatrudnienia.hashCode();
    }

    public String toString()
    {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        return getClass().getName()
               + "[nazwisko=" + nazwisko
               + ",pobory=" + pobory
               + ",dataZatrudnienia=" + sdf.format(dataZatrudnienia)
               + "]";
    }

    private String nazwisko;
    private double pobory;
    private Date dataZatrudnienia;
}

