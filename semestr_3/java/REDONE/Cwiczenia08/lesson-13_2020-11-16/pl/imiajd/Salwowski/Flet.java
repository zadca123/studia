package pl.imiajd.Salwowski;
import java.time.*;
import java.util.*;

public class Flet extends Instrument{
    public Flet(String producent, LocalDate rokProdukcji) {
        super(producent, rokProdukcji);
    }
    public void dzwiek() {
        System.out.println("*titanic theme flute noises*");
    }
}
