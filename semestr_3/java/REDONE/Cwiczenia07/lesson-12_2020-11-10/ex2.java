import pl.imiajd.Salwowski.Adres;

public class ex2 {
    public static void main(String[] args) {
        Adres adr1 = new Adres("ul. Wielkiej Lechii 3", 124,22);
        Adres adr2 = new Adres("ul. Wielkiej Lechii 3", 124);
        adr1.kod_pocztowy = 19298;
        adr1.miasto = "Olsztyn";

        adr2.kod_pocztowy = 1773;

        adr1.pokaz();
        adr2.pokaz();

        System.out.println(adr2.przed(adr1.kod_pocztowy));
    }
}
