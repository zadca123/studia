package pl.imiajd.Salwowski;
import java.time.*;
import java.util.*;

public abstract class Instrument {
    public Instrument(String producent, LocalDate rokProdukcji) {
        this.producent = producent;
        this.rokProdukcji = rokProdukcji;
    }

    public String getProducent() {
        return producent;
    }
    public LocalDate getRokProdukcji() {
        return rokProdukcji;
    }
    public String toString() {
        return "Instrument:\n" +
            "Manufacturer: " + producent +
            "\tProduction Year: " + rokProdukcji;
    }

    public abstract void dzwiek();

    public boolean equals(Object myObj) {
        if (this == myObj)
            return true;
        else if(this != myObj)
            return false;
        else{
            Instrument check = (Instrument) myObj;
            return Objects.equals(producent, check.producent) && Objects.equals(rokProdukcji, check.rokProdukcji);
        }
    }
    public String producent;
    public LocalDate rokProdukcji;
}
