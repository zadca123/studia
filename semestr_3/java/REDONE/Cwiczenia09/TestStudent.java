import pl.imiajd.Salwowski.Osoba;
import pl.imiajd.Salwowski.Student;
import java.time.LocalDate;
import java.util.ArrayList;

public class TestStudent {
    public static void main(String[] args) {
        ArrayList<Osoba> grupa = new ArrayList<Osoba>(5);

        grupa.add(new Student("Czarek", LocalDate.of(1992, 1, 21), 4.3));
        grupa.add(new Student("Czarek", LocalDate.of(1993, 2, 22), 4.2));
        grupa.add(new Student("Azarek", LocalDate.of(1994, 3, 23), 4.1));
        grupa.add(new Student("Tzarek", LocalDate.of(1994, 3, 23), 4.0));
        grupa.add(new Student("Salwowski", LocalDate.of(1996, 5, 25), 3.1));

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
