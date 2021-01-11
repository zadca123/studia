package pl.imiajd.Salwowski;
import java.util.*;
import java.time.LocalDate;

public class Student extends Osoba{
    public Student(String nazwisko, String[] imiona,
                   LocalDate dataUrodzenia, boolean plec,
                   String kierunek, double sredniaOcen){
        super(nazwisko, imiona, dataUrodzenia, plec);
        this.kierunek = kierunek;
        this.sredniaOcen = sredniaOcen;
    }

    public double getSredniaOcen(){
        return sredniaOcen;
    }
    public void setSredniaOcen(double sredniaOcen){
        this.sredniaOcen = sredniaOcen;
    }

    public String getOpis(){
        return "Imiona: " + Arrays.toString(getImiona()) + "\tNazwisko: " + getNazwisko() +
            "\tDataUrodzenia: " + getDataUrodzenia() + "\tPlec: " + (getPlec() ? "mężczyzna" : "kobieta") +
            "\nKierunek: " + kierunek + "\tSredniaOcen: " + sredniaOcen;
    }

    private String kierunek;
    private double sredniaOcen;
}
