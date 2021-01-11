package pl.imiajd.Salwowski;
// import java.util.*;

public class Nauczyciel extends Osoba{
    public Nauczyciel(int pensja, String nazwisko, int rokUrodzenia){
        super(nazwisko, rokUrodzenia);
        this.pensja = pensja;
    }
    double pensja;

    public String toString() {
        return nazwisko + ", " + rokUrodzenia + ", " + pensja;
    }

    public double getPensja(){
        return this.pensja;
    }
}
