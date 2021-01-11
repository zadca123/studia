package pl.imiajd.Salwowski;
import java.time.*;
import java.util.*;

public class Osoba implements Cloneable, Comparable<Osoba> {
    public Osoba(String nazwisko, LocalDate dataUrodzenia) {
        this.nazwisko = nazwisko;
        this.dataUrodzenia = dataUrodzenia;
    }

    public String getNazwisko() {
        return nazwisko;
    }
    public LocalDate getDataUrodzenia() {
        return dataUrodzenia;
    }
    public String toString() {
        return  getClass().getSimpleName()+
            "\t[ Surname: " + nazwisko +
            " \tDate of Birth: " + dataUrodzenia + " ]";
    }
    public boolean equals(Object myObj) {
        if (this == myObj)
            return true;
        else if(this != myObj)
            return false;
        else{
            Osoba check = (Osoba) myObj;
            return Objects.equals(nazwisko, check.nazwisko) && Objects.equals(dataUrodzenia, check.dataUrodzenia);
        }
    }

    public int compareTo(Osoba myObj) {
        if(nazwisko.compareTo(myObj.nazwisko) == 0)
            return dataUrodzenia.compareTo(myObj.dataUrodzenia);
        return nazwisko.compareTo(myObj.nazwisko);
    }

    private String nazwisko;
    private LocalDate dataUrodzenia;
}
