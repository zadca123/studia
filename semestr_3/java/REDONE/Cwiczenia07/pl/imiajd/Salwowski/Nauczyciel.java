package pl.imiajd.Salwowski;

public class Nauczyciel extends Osoba {
    public Nauczyciel(String nazwisko, int rokUrodzenia, int pensja){
        super(nazwisko, rokUrodzenia);
        this.pensja = pensja;
    }
    private int pensja;

    public String toString() {
        return this.getNazwisko() + ", " + this.getRokUrodzenia() + ", " + this.pensja;
    }
}
