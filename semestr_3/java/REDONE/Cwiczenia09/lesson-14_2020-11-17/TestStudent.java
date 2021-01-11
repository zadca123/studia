import pl.imiajd.Salwowski.*;
import java.time.*;
import java.util.*;

public class TestStudent {
    public static void main(String[] args) {
        ArrayList<Student> grupa = new ArrayList<>(5);
        grupa.add(new Student("Kottek", LocalDate.of(1938, 11, 20), 4.5));
        grupa.add(new Student("Płotek", LocalDate.of(1938, 11, 20), 4.2));
        grupa.add(new Student("Młotek", LocalDate.of(1915, 11, 10), 5.0));
        grupa.add(new Student("Młotek", LocalDate.of(1914, 11, 10), 4.9));
        grupa.add(new Student("Salwowski", LocalDate.of(1998, 11, 10), 3.0));

        for (Student i: grupa)
            System.out.println(i);
        System.out.println("\n--------------------Sorted--------------------");
        grupa.sort(Student::compareTo);
        for (Student i: grupa)
            System.out.println(i);
    }
}
