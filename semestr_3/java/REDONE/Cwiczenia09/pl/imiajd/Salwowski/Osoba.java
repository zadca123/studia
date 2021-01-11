package pl.imiajd.Salwowski;
import java.time.LocalDate;

public class Osoba<Clonable, Comparable> {
    public Osoba(String nazwisko, LocalDate dataUrodzenia){
        this.nazwisko = nazwisko;
        this.dataUrodzenia = dataUrodzenia;
    }
    private String nazwisko;
    private LocalDate dataUrodzenia;

    public String toString() {
        return getClass().getSimpleName() + "\t[Nazwisko: " + nazwisko +
            "\tDataUrodzenia: " + dataUrodzenia + "]";
    }

    public boolean equals(Osoba obj){
        if(this.nazwisko == obj.nazwisko){
            if(this.dataUrodzenia == obj.dataUrodzenia)
                return true;
            return false;
        }
        return false;
    }
    public int compareTo(Osoba obj){
        if(this.nazwisko.compareTo(obj.nazwisko) == 0)
            return this.dataUrodzenia.compareTo(obj.dataUrodzenia);
        return this.nazwisko.compareTo(obj.nazwisko);
    }

    public String getNazwisko(){
        return nazwisko;
    }
    public LocalDate getDataUrodzenia(){
        return dataUrodzenia;
    }
}
