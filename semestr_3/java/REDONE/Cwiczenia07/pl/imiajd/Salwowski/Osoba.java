package pl.imiajd.Salwowski;

public class Osoba {
    public Osoba(String nazwisko, int rokUrodzenia){
        this.nazwisko = nazwisko;
        this.rokUrodzenia = rokUrodzenia;
    }
    private String nazwisko;
    private int rokUrodzenia;

    public String toString() {
        return this.nazwisko + ", " + this.rokUrodzenia;
    }

    public String getNazwisko(){
        return this.nazwisko;
    }
    public int getRokUrodzenia(){
        return this.rokUrodzenia;
    }

}
