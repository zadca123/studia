import java.util.*;
import java.time.LocalDate;
import pl.imiajd.Salwowski.Osoba;
import pl.imiajd.Salwowski.Student;
import pl.imiajd.Salwowski.Pracownik;

public class TestOsoba{
    public static void main(String[] args){
            Osoba[] ludzie = new Osoba[2];

            ludzie[0] = new Pracownik("Kowalski", new String[]{"Jan", "Marek"},
                                      LocalDate.of(2000,1,20),true,
                                      2500, LocalDate.of(2020,12,24));
            ludzie[1] = new Student("Powalski", new String[]{"Jan", "Marek"},
                                    LocalDate.of(2000,2,20),true,
                                    "Infa",4.5);

            for (Osoba var : ludzie) {
                    if(var instanceof Pracownik)
                            System.out.println(var.getOpis());
                    if(var instanceof Student)
                            System.out.println(var.getOpis());
        }

    }
}
