package pl.imiajd.Salwowski;
import java.util.*;
import java.time.LocalDate;

public class Student extends Osoba{
    public Student(String nazwisko, String[] imiona, LocalDate dataUrodzenia, boolean plec, String kierunek) {
        super(nazwisko, imiona, dataUrodzenia, plec);
        this.kierunek = kierunek;
    }

    public String getOpis(){
        return "kierunek studiów: " + kierunek;
    }

    public double getSredniaOcen(){
        return sredniaOcen;
    }
    public void setSredniaOcen(double sredniaOcen){
        this.sredniaOcen = sredniaOcen;
    }
    private double sredniaOcen;
    private String kierunek;
}
