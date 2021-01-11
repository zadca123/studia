import java.util.ArrayList;

public class ex7 {
    public static void main(String[] args) {
        int n = 30;
        sitoEratostenesa(n);
    }

    public static void sitoEratostenesa(int n){
        ArrayList<Integer> primes = new ArrayList<Integer>();
        for(int i=2; i<=n; i++)
            primes.add(i);
        for(int i=2; i<=n; i++)
            for(int j=0; j<primes.size(); j++)
                if(primes.get(j)%i == 0 && primes.get(j)!=i)
                    primes.remove(j);
        System.out.println(primes);
    }
}
