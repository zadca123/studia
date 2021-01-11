import pl.imiajd.Salwowski.*;
import java.time.*;
import java.util.*;

public class TestOsoba {
    public static void main(String[] args) {
        ArrayList<Osoba> grupa = new ArrayList<>(5);
        grupa.add(new Osoba("Kott", LocalDate.of(1938, 11, 20)));
        grupa.add(new Osoba("Płot", LocalDate.of(1938, 11, 20)));
        grupa.add(new Osoba("Młot", LocalDate.of(1915, 11, 10)));
        grupa.add(new Osoba("Młot", LocalDate.of(1914, 11, 10)));
        grupa.add(new Osoba("Salwowski", LocalDate.of(1998, 11, 10)));

        for (Osoba i: grupa)
            System.out.println(i);
        System.out.println("\n--------------------Sorted--------------------");
        grupa.sort(Osoba::compareTo);
        for (Osoba i: grupa)
            System.out.println(i);
    }
}







