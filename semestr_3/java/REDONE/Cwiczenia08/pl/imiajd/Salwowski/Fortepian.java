package pl.imiajd.Salwowski;
import java.time.LocalDate;

public class Fortepian extends Instrument{
    public Fortepian(String producent, LocalDate rokProdukcji){
        super(producent, rokProdukcji);
    }

    public void dzwiek(){
        System.out.println("fortepianu fortepianu");
    }
}
