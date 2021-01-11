import pl.imiajd.Salwowski.Osoba;
import java.time.LocalDate;
import java.util.ArrayList;

public class TestOsoba {
    public static void main(String[] args) {
        ArrayList<Osoba> grupa = new ArrayList<Osoba>(5);

        grupa.add(new Osoba("Czarek", LocalDate.of(1992, 1, 21)));
        grupa.add(new Osoba("Czarek", LocalDate.of(1993, 2, 22)));
        grupa.add(new Osoba("Azarek", LocalDate.of(1994, 3, 23)));
        grupa.add(new Osoba("Tzarek", LocalDate.of(1994, 3, 23)));
        grupa.add(new Osoba("Salwowski", LocalDate.of(1996, 5, 25)));

        for (Osoba var : grupa) {
            System.out.println(var.toString());
        }
        System.out.println();
        grupa.sort(Osoba::compareTo);
        for (Osoba var : grupa) {
            System.out.println(var);
        }
    }
}
