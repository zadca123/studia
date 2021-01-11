import java.util.*;

public class TestManager1
{
    public static void main(String[] args)
    {
        Manager szef = new Manager("Carl Cracker", 80000, 1987, 12, 15);
        szef.setPremia(5000);

        Pracownik[] personel = new Pracownik[3];

        personel[0] = szef;
       
        //personel[0].setPremia (5000); // błąd kompilacji
      
        personel[1] = new Pracownik("Harry Hacker", 50000, 1989, 10, 1);
        personel[2] = new Pracownik("Tommy Tester", 40000, 1990, 3, 15);

        for (Pracownik p : personel) {
            System.out.println("nazwisko = " + p.getNazwisko() + ", pobory = " + p.getPobory());
            System.out.println();
        }
    }
}

class Pracownik
{
    public Pracownik(String nazwisko, double pobory, int rok, int miesiac, int dzien)
    {
        this.nazwisko = nazwisko;
        this.pobory = pobory;
        GregorianCalendar kalendarz = new GregorianCalendar(rok, miesiac - 1, dzien);
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

    public Date getDataZatrudnienia()
    {
        return (Date) dataZatrudnienia.clone();
    }

    public void zwiekszPobory(double procent)
    {
        double zwieksz = pobory * procent / 100;
        pobory += zwieksz;
    }

    private String nazwisko;
    private double pobory;
    private Date dataZatrudnienia;
}

class Manager extends Pracownik
{

    public Manager(String nazwisko, double pobory, int rok, int miesiac, int dzien)
    {
        super(nazwisko, pobory, rok, miesiac, dzien);
        premia = 0;
    }

    public double getPobory()
    {
        double poboryPodstawowe = super.getPobory();
        return poboryPodstawowe + premia;
    }

    public void setPremia(double premia)
    {
        this.premia = premia;
    }

    private double premia;
}

