package pl.imiajd.Salwowski;

public class Adres {
    public Adres(String ulica, int numer_domu, int numer_mieszkania){
        this.ulica = ulica;
        this.numer_domu = numer_domu;
        this.numer_mieszkania = numer_mieszkania;
    }
    public Adres(String ulica, int numer_domu){
        this.ulica = ulica;
        this.numer_domu = numer_domu;
    }

    // private String ulica;
    // private int numer_domu;
    // private int numer_mieszkania;
    private String ulica;
    private int numer_domu;
    private int numer_mieszkania;
    public String miasto;
    public int kod_pocztowy;

    public void pokaz(){
        System.out.println("Kod pocztowy: "+ kod_pocztowy + "\tMiasto: " + miasto);
        System.out.println("Ulica: "+ ulica +"\tNumer Domu: "+ numer_domu + "\tNumer Mieszkania: " + numer_mieszkania);
        System.out.println();
    }

    public boolean przed(int k_poczt){
        if(kod_pocztowy >= k_poczt)
            return false;
        return true;
    }
}
