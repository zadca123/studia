package pl.imiajd.Salwowski;
import java.time.*;
import java.util.*;

public class Skrzypce extends Instrument{
    public Skrzypce(String producent, LocalDate rokProdukcji) {
        super(producent, rokProdukcji);
    }
    public void dzwiek() {
        System.out.println("*violin noises*");
    }
}
