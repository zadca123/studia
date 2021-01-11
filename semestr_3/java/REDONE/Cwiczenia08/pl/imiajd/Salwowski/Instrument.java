package pl.imiajd.Salwowski;
import java.time.LocalDate;

public abstract class Instrument {
    public Instrument(String producent, LocalDate rokProdukcji){
        this.producent = producent;
        this.rokProdukcji = rokProdukcji;
    }
    private String producent;
    private LocalDate rokProdukcji;

    public String getProducent(){
        return producent;
    }
    public LocalDate getRokProdukcji(){
        return rokProdukcji;
    }
    public boolean equals(Instrument obj){
        if(this.producent == obj.producent && this.rokProdukcji == obj.rokProdukcji)
            return true;
        return false;
    }
    public String toString() {
        return "Producent: " + producent + "\tRokProdukcji: " + rokProdukcji;
    }

    public abstract void dzwiek();
}
