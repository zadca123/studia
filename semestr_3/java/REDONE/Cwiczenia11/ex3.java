import java.util.LinkedList;

public class ex3 {
    public static void main(String[] args) {
        LinkedList<String> ll1 = new LinkedList<>();
        ll1.add("Pracownik 1");
        ll1.add("Pracownik 2");
        ll1.add("Pracownik 3");

        System.out.println(ll1);
        odwroc(ll1);
        System.out.println(ll1);
    }

    public static void odwroc(LinkedList<String> tab){
        String tmp;
        for (int i = 0; i < tab.size()/2; i++){
            tmp = tab.get(i);
            tab.set(i, tab.get(tab.size() - i - 1));
            tab.set(tab.size() - i - 1, tmp);
        }
    }
}
