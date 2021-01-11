import java.util.Stack;
import java.util.ArrayList;

public class ex6 {
    public static void main(String[] args) {
        int x = 2015;
        liczby(x);
    }

    public static void liczby(int x){
        Stack<Integer> result = new Stack<Integer>();
        do{
            result.add(x % 10);
            x /= 10;
        } while  (x > 0);

        do{
            System.out.print(result.pop() + " ");
        } while  (result.size() > 0);
    }
}
