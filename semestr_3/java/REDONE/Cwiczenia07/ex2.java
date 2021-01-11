import pl.imiajd.Salwowski.Adres;
import pl.imiajd.Salwowski.Student;
import pl.imiajd.Salwowski.Nauczyciel;

public class ex2 {
    public static void main(String[] args) {
        Adres adr1 = new Adres("ul. Szkolna", 144, 24, "Białystok",18500);
        Adres adr2 = new Adres("ul. Polska", 66, "Warszawa", 10764);

        adr1.pokaz();
        System.out.println();
        adr2.pokaz();

        System.out.println(adr1.przed(144));

    }
}
