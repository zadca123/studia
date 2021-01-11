// klasa Pracownik zdefinowana w pakiecie pl.czest.ajd.zbrzezny
import pl.czest.ajd.zbrzezny.*;

import static java.lang.System.*;

public class TestPackage
{

    public static void main(String[] args)
    {
        Pracownik harry = new Pracownik("Harry Hacker", 50000, 1989, 10, 1);

        harry.zwiekszPobory(5);

        out.println("nazwisko: " + harry.getNazwisko() + ", pobory: " + harry.getPobory());
    }
}

