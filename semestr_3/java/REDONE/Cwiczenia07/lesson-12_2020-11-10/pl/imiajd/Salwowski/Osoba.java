package pl.imiajd.Salwowski;
// import java.util.*;


public class Osoba {
    String nazwisko;
    int rokUrodzenia;

    public Osoba(String nazwisko, int rokUrodzenia){
        this.nazwisko = nazwisko;
        this.rokUrodzenia = rokUrodzenia;
    }

    public String toString() {
        return nazwisko + ", " + rokUrodzenia;
    }

    public String getNazwisko(){
        return this.nazwisko;
    }

    public int getRokUrodzenia(){
        return this.rokUrodzenia;
    }
}
