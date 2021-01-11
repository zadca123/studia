import java.util.*;

public class ex1{
    public static void main(String[] args) {
        RachunekBankowy saver1 = new RachunekBankowy(0.4, 2000);
        RachunekBankowy saver2 = new RachunekBankowy(0.4, 3000);

        System.out.println("saver1 saldo: " + saver1.saldo);
        System.out.println("saver1 rocznaStopProc: "+saver1.rocznaStopaProcentowa);
        saver1.obliczMiesieczneOdsetki();
        System.out.println("saver1 saldo: " + saver1.saldo);

        System.out.println();

        System.out.println("saver2 saldo: " + saver2.saldo);
        System.out.println("saver2 rocznaStopProc: "+saver2.rocznaStopaProcentowa);
        saver1.obliczMiesieczneOdsetki();
        System.out.println("saver2 saldo: " + saver2.saldo);


    //     RachunekBankowy saver1 = new RachunekBankowy(0.5, 2000);
    //     RachunekBankowy saver2 = new RachunekBankowy(0.5, 3000);
    //     System.out.println("saver2 saldo: " + saver2.saldo);
    //     System.out.println("saver2 rocznaStopProc: "+saver2.rocznaStopaProcentowa);
    //     saver1.obliczMiesieczneOdsetki();
    //     System.out.println("saver2 saldo: " + saver2.saldo);

    //     System.out.println("saver1 saldo: " + saver1.saldo);
    //     System.out.println("saver1 rocznaStopProc: "+saver1.rocznaStopaProcentowa);
    //     saver1.obliczMiesieczneOdsetki();
    //     System.out.println("saver1 saldo: " + saver1.saldo);
    }
}
