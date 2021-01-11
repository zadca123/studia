// Na podstawie książki Cay Horstmann, Gary Cornell.
// "Java (TM). Podstawy." Wydanie VIII"

package pl.czest.ajd.zbrzezny;

import java.util.*;

public class Pracownik
{
    public Pracownik(String n, double s, int year, int month, int day)
    {
        nazwisko = n;
        pobory = s;
        GregorianCalendar kalendarz = new GregorianCalendar(year, month - 1, day);
        dataZatrudnienia = kalendarz.getTime();
    }

    public String getNazwisko()
    {
        return nazwisko;
    }

    public double getPobory()
    {
        return pobory;
    }

    public Date getHireDay()
    {
        return dataZatrudnienia;
    }

    public void zwiekszPobory(double procent)
    {
        double podwyzka = pobory * procent / 100;
        pobory += podwyzka;
    }

    private String nazwisko;
    private double pobory;
    private Date dataZatrudnienia;
}

