// import RachunekBankowy;

public class ex1 {
    public static void main(String[] args) {
        RachunekBankowy saver1 = new RachunekBankowy(2000);
        RachunekBankowy saver2 = new RachunekBankowy(3000);

        RachunekBankowy.setRocznaStopaProcentowa(4);
        saver1.obliczMiesieczneOdsetki();
        saver2.obliczMiesieczneOdsetki();
        System.out.println(saver1.saldo());
        System.out.println(saver2.saldo());


        RachunekBankowy.setRocznaStopaProcentowa(5);
        saver1.obliczMiesieczneOdsetki();
        saver2.obliczMiesieczneOdsetki();
        System.out.println(saver1.saldo());
        System.out.println(saver2.saldo());
    }
}
