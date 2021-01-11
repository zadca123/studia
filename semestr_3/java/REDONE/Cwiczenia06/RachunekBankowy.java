// package RachunekBankowy;

public class RachunekBankowy {
    RachunekBankowy(double saldo){
        this.saldo = saldo;
    }
    static double rocznaStopaProcentowa;
    private double saldo;

    public void obliczMiesieczneOdsetki(){
        double odsetki =  (this.saldo * this.rocznaStopaProcentowa )/ 12;
        this.saldo += odsetki;
    }

    public static void setRocznaStopaProcentowa(double rocznaStopaProcentowa){
        RachunekBankowy.rocznaStopaProcentowa = rocznaStopaProcentowa;
    }

    public double saldo(){
        return saldo;
    }
}
