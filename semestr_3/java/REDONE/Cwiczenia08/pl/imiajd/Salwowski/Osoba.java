package pl.imiajd.Salwowski;
import java.util.*;
import java.time.LocalDate;

public abstract class Osoba{
    public Osoba(String nazwisko, String[] imiona, LocalDate dataUrodzenia, boolean plec){
        this.nazwisko = nazwisko;
        this.imiona = imiona;
        this.dataUrodzenia = dataUrodzenia;
        this.plec = plec;
    }

    public abstract String getOpis();

    public String getNazwisko(){
        return nazwisko;
    }
    public String[] getImiona(){
        return imiona;
    }
    public LocalDate getDataUrodzenia(){
        return this.dataUrodzenia;
    }
    public boolean getPlec(){
        if(plec) // plec == true
            return plec;
        return plec;
    }

    private String nazwisko;
    private String[] imiona;
    private LocalDate dataUrodzenia;
    private boolean plec;
}
