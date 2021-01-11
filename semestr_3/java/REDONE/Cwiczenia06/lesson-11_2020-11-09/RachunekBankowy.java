import java.util.*;

public class RachunekBankowy{
    // public double rocznaStopaProcentowa = 0;
    // private double saldo = 0;
    public static double rocznaStopaProcentowa;
    double saldo;

    public void obliczMiesieczneOdsetki(){
        double result = saldo * rocznaStopaProcentowa/12;
        System.out.println("Miesięczne odsetki: " + result);
        saldo += result;
    }

    public static void setRocznaStopaProcentowa(double nowaWart){
        rocznaStopaProcentowa = nowaWart;
    }

    RachunekBankowy(double rocznaStopaProcentowa, double saldo){
        this.rocznaStopaProcentowa = rocznaStopaProcentowa;
        this.saldo = saldo;
    }
}
