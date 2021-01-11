import pl.imiajd.Salwowski.Instrument;
import pl.imiajd.Salwowski.Fortepian;
import pl.imiajd.Salwowski.Flet;
import pl.imiajd.Salwowski.Skrzypce;
import java.time.LocalDate;
import java.util.ArrayList;

public class TestInstrumenty {
    public static void main(String[] args) {
        ArrayList<Instrument> orkiestra = new ArrayList<Instrument>(5);
        orkiestra.add(new Flet("FletCorp", LocalDate.of(2020,1,20)));
        orkiestra.add(new Fortepian("ForteCorp", LocalDate.of(2020,2,21)));
        orkiestra.add(new Skrzypce("SkrzypCorp", LocalDate.of(2020,3,22)));
        orkiestra.add(new Flet("FletCorp", LocalDate.of(2020,4,23)));
        orkiestra.add(new Flet("FletCorp", LocalDate.of(2020,5,24)));

        for (Instrument var : orkiestra) {
            System.out.print(var.toString() + "\tDzwięk: ");
            var.dzwiek();
        }
    }
}
