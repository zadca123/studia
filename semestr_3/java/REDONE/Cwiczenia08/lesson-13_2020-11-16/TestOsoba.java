import pl.imiajd.Salwowski.*;
import java.util.*;
import java.time.*;

public class TestOsoba
{
    public static void main(String[] args)
    {
        Osoba[] ludzie = new Osoba[2];

        ludzie[0] = new Pracownik("Kowalski",
                                  new String[]{"Jan"},
                                  LocalDate.of(1960, 10, 11),
                                  true,
                                  5000,
                                  LocalDate.of(1980,10,10)
                                  );
        ludzie[1] = new Student("Nowak",
                                new String[]{"Małgorzata"},
                                LocalDate.of(2012,10,12),
                                false,
                                "informatyka"
                                );
        // ludzie[2] = new Osoba("Sowizdrzał",
        //                       new String[]{"Dyl"},
        //                       LocalDate.of(1111,1,1),
        //                       true);

        for (Osoba p : ludzie) {
            System.out.println(p.getNazwisko() + "\n" + p.getOpis());
            System.out.println();
        }
    }
}
