import java.util.LinkedList;

public class ex1 {
    public static void main(String[] args) {
        LinkedList<String> ll = new LinkedList<>();
        ll.add("Pracownik 1");
        ll.add("Pracownik 2");
        ll.add("Pracownik 3");
        ll.add("Pracownik 4");
        ll.add("Pracownik 5");

        System.out.println(ll);
        redukuj(ll,2);
        System.out.println(ll);
    }

    public static void redukuj(LinkedList<String> pracownicy, int n){
        if(n > 0)
            for (int i = n-1; i < pracownicy.size(); i+=n-1)
                pracownicy.remove(i);
    }
}
