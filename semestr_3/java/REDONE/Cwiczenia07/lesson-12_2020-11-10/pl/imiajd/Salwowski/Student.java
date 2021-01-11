package pl.imiajd.Salwowski;
// import java.util.*;

public class Student extends Osoba {
    public Student(String kierunek, String nazwisko, int rokUrodzenia){
        super(nazwisko, rokUrodzenia);
        this.kierunek = kierunek;
    }
    public String kierunek;

    public String toString() {
        return nazwisko + ", " + rokUrodzenia + ", " + kierunek;
    }
    public String getKierunek(){
        return this.kierunek;
    }

}
