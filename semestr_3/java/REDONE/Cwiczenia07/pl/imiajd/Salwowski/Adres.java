package pl.imiajd.Salwowski;

public class Adres {
    public Adres(String ulica, int numer_domu,int numer_mieszkania, String miasto, int kod_pocztowy){
        this.ulica = ulica;
        this.numer_domu = numer_domu;
        this.numer_mieszkania = numer_mieszkania;
        this.miasto = miasto;
        this.kod_pocztowy = kod_pocztowy;
    }
    public Adres(String ulica, int numer_domu, String miasto, int kod_pocztowy){
        this.ulica = ulica;
        this.numer_domu = numer_domu;
        this.miasto = miasto;
        this.kod_pocztowy = kod_pocztowy;
    }

    public void pokaz(){
        System.out.println("Kod pocztowy: " + this.kod_pocztowy +
                           "\tMiasto: " + this.miasto);
        System.out.println("Ulica: " + this.ulica + "\tNr_domu: " + this.numer_domu +
                           "\tNr_mieszkania: "+this.numer_mieszkania);
    }

    public boolean przed(int kod_pocztowy){
        if(this.kod_pocztowy < kod_pocztowy)
            return true;
        return false;
    }

    private String ulica;
    private int numer_domu;
    private int numer_mieszkania;
    private String miasto;
    private int kod_pocztowy;
}
