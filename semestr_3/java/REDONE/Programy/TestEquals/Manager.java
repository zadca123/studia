import java.util.*;

class Manager extends Pracownik
{
    public Manager(String nazwisko, double pobory, int rok, int miesiac, int dzien)
    {
        super(nazwisko, pobory, rok, miesiac, dzien);
        premia = 0;
    }

    public double getPobory()
    {
        double baseSalary = super.getPobory();
        return baseSalary + premia;
    }

    public void setPremia(double b)
    {
        premia = b;
    }

    public boolean equals(Object otherObject)
    {
        if (!super.equals(otherObject)) {
            return false;
        }

        // metoda super.equals sprawdziła, że this oraz otherObject
        // odnoszą się do obiektów tej samej klasy
        Manager other = (Manager) otherObject;
        return premia == other.premia;
    }

    public int hashCode()
    {
        return super.hashCode() + 17 * new Double(premia).hashCode();
    }

    public String toString()
    {
        return super.toString() + "[premia=" + premia + "]";
    }

    private double premia;
}

