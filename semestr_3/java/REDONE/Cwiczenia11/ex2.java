import java.util.LinkedList;

public class ex2 {
    public static void main(String[] args) {
        LinkedList<String> ll1 = new LinkedList<>();
        LinkedList<Integer> ll2 = new LinkedList<>();
        LinkedList<Character> ll3 = new LinkedList<>();
        ll1.add("Pracownik 1");
        ll1.add("Pracownik 2");
        ll1.add("Pracownik 3");
        ll2.add(1);
        ll2.add(2);
        ll2.add(3);
        ll3.add('A');
        ll3.add('B');
        ll3.add('C');

        System.out.println(ll1);
        System.out.println(ll2);
        System.out.println(ll3);
        redukuj(ll1,2);
        redukuj(ll2,2);
        redukuj(ll3,2);
        System.out.println(ll1);
        System.out.println(ll2);
        System.out.println(ll3);
    }

    public static<T> void redukuj(LinkedList<T> pracownicy, int n){
        if(n > 0)
            for (int i = n-1; i < pracownicy.size(); i+=n-1)
                pracownicy.remove(i);
    }
}
