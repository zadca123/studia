package pl.imiajd.Salwowski;
import java.time.LocalDate;

public class Student extends Osoba{
    public Student(String nazwisko, LocalDate dataUrodzenia, double sredniaOcen){
        super(nazwisko, dataUrodzenia);
        this.sredniaOcen = sredniaOcen;
    }
    private double sredniaOcen;

    public int compareTo(Student obj){
        int a = super.compareTo(obj);
        if(a == 0)
            return Double.toString(this.sredniaOcen).compareTo(Double.toString(obj.sredniaOcen));
        return a;
    }

    public String toString() {
        return getClass().getSimpleName() + "\t[Nazwisko: " + getNazwisko() +
            "\tDataUrodzenia: " + getDataUrodzenia() + "\tSredniaOcen: " + sredniaOcen + "]";
    }
}
