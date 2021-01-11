package pl.imiajd.Salwowski;

public class Student extends Osoba {
    public Student(String nazwisko, int rokUrodzenia, String kierunek){
        super(nazwisko, rokUrodzenia);
        this.kierunek = kierunek;
    }
    private String kierunek;

    public String toString() {
        return this.getNazwisko() + ", " + this.getRokUrodzenia() + ", " + this.kierunek;
    }
    public String getKierunek(){
        return this.kierunek;
    }
}
