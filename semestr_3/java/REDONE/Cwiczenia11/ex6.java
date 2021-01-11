import java.util.Stack;

public class ex6 {
    public static void main(String[] args) {
        int x = 2015;
        idk(x);
    }

    public static void idk(int x){
        Stack<Integer> st = new Stack<>();
        do{
            st.add(x % 10);
            x /= 10;
        }while(x > 0);

        do{
            System.out.print(st.pop() + " ");
        }while(st.size() > 0);
    }
}
