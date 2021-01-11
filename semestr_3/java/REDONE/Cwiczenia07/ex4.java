import pl.imiajd.Salwowski.Osoba;
import pl.imiajd.Salwowski.Student;
import pl.imiajd.Salwowski.Nauczyciel;

public class ex4 {
    public static void main(String[] args) {
        Osoba os1 = new Osoba("Czarek" ,1998);
        System.out.println(os1.toString());

        Nauczyciel os2 = new Nauczyciel("Miszcz", 1977, 5000);
        System.out.println(os2.toString());

        Student os3 = new Student("Madzia", 1988, "Infa");
        System.out.println(os3.toString());
    }
}
