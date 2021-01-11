import java.util.*;

public class SortArrayListDemo
{
    public static void main(String[] args)
    {
        ArrayList<Pracownik> personel = new ArrayList<Pracownik>();

        personel.add(new Pracownik("Tony Tester", 38000));
        personel.add(new Pracownik("Carl Cracker", 75000));
        personel.add(new Pracownik("Harry Hacker", 35000));

        personel.sort(null); // sortuje stosując naturalny porządek klasy Pracownik

        System.out.println();
        for (Pracownik e : personel) {
            System.out.println("nazwisko = " + e.getNazwisko() + ", pobory = " + e.getPobory());
        }
        System.out.println();
    }
}

