import pl.imiajd.Salwowski.Osoba;
import pl.imiajd.Salwowski.Student;
import pl.imiajd.Salwowski.Nauczyciel;
// import java.util.*;

public class ex4 {
    public static void main(String[] args) {
        Nauczyciel n = new Nauczyciel(4000, "Polak", 1984);
        Student s = new Student("informatyka", "Cyna", 1985);
        Osoba o = new Osoba("Miszor", 1985);

        System.out.println(o.toString());
        System.out.println(n.toString());
        System.out.println(s.toString());

        System.out.println(o.getNazwisko());
        System.out.println(s.getKierunek());
        System.out.println(n.getPensja());
    }
}
