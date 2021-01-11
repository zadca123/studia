import pl.imiajd.Salwowski.Instrument;
import pl.imiajd.Salwowski.Flet;
import pl.imiajd.Salwowski.Fortepian;
import pl.imiajd.Salwowski.Skrzypce;
import java.time.*;
import java.util.*;

public class TestInstrumenty {
    public static void main(String[] args) {
        ArrayList<Instrument> orkiestra = new ArrayList<>(5);

        orkiestra.add(new Skrzypce("violinCompany", LocalDate.of(2020, 1, 12)));
        orkiestra.add(new Skrzypce("violinCompany", LocalDate.of(2020, 1, 12)));
        orkiestra.add(new Flet("fluteCompany", LocalDate.of(1984, 12, 30)));
        orkiestra.add(new Fortepian("pianoCompany", LocalDate.of(1666, 6, 6)));
        orkiestra.add(new Fortepian("pianoCompany", LocalDate.of(1666, 6, 6)));

        for (Instrument i: orkiestra) {
            System.out.println(i.toString());
            i.dzwiek();
            System.out.println();
        }
    }
}
