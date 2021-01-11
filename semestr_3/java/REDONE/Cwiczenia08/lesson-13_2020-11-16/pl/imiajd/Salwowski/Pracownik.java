package pl.imiajd.Salwowski;
import java.util.*;
import java.time.LocalDate;

public class Pracownik extends Osoba{
    public Pracownik(String nazwisko, String[] imiona, LocalDate dataUrodzenia, boolean plec, double pobory, LocalDate dataZatrudnienia) {
        super(nazwisko, imiona, dataUrodzenia, plec);
        this.pobory = pobory;
        this.dataZatrudnienia = dataZatrudnienia;
    }

    public double getPobory()
    {
        return pobory;
    }

    public LocalDate getDataZatrudnienia()
    {
        return dataZatrudnienia;
    }

    public String getOpis(){
        return "pobory: " + pobory +
            "\tdataZatrudnienia: " + dataZatrudnienia;
    }
    private LocalDate dataZatrudnienia;
    private double pobory;
}
