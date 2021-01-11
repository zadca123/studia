package pl.imiajd.Salwowski;
import java.time.LocalDate;

public class Skrzypce extends Instrument{
    public Skrzypce(String producent, LocalDate rokProdukcji){
        super(producent, rokProdukcji);

    }
    public void dzwiek(){
        System.out.println("skrzypu skrzypu");
    }
}
