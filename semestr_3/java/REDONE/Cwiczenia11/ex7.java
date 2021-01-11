import java.util.Stack;
import java.util.ArrayList;

public class ex7 {
    public static void main(String[] args) {
        int x = 31;
        lbPierwsze(x);
    }

    public static void lbPierwsze(int n){
        ArrayList<Integer> primes = new ArrayList<>();
        for(int i = 2; i <= n; i++)
            primes.add(i);
        System.out.println(primes);

        int tmp;
        for(int i = 2; i < Math.sqrt(n); i++){
            tmp = i;
            for(int j = 0; j<primes.size();j++)
                if(primes.get(j) % tmp == 0 && primes.get(j) != tmp){
                    primes.remove(j);
                    j--;
                }
        }
        System.out.println(primes);
    }
    // public static void lbPierwsze(int n){
    //     Stack<Integer> primes = new Stack<>();
    //     for(int i = 2; i < n; i++){
    //         primes.set(i-2 ,i);
    //     }

    //     int tmp = 2;
    //     for(int i = 0; i < primes.size(); i++){
    //         if(primes.get(i)%tmp)
    //     }
    // }
    // public static void lbPierwsze(int n){
    //     int[] primes = new int[n];
    //     for(int i = 2; i < n; i++){
    //         primes[i-2] = i;
    //     }
    //     int tmp = 2;
    //     for(int i = 0; i < primes.length; i++){
    //         if(primes[i] % tmp != 0 || primes[i] != tmp)
    //             primes[i] = 0;
    //         if(tmp < Math.sqrt(n))
    //             tmp ++;
    //         System.out.println(primes[i]);
    //     }
    // }
}
