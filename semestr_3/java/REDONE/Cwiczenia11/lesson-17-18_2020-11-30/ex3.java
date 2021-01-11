import java.util.LinkedList;

public class ex3 {
    public static void main(String[] args) {
        LinkedList<String> linky1 = new LinkedList<String>();
        // LinkedList<Integer> linky2 = new LinkedList<Integer>();

        linky1.add("Rob 0");
        linky1.add("Bob 1");
        linky1.add("Mob 2");
        linky1.add("Rob 3");
        linky1.add("Bob 4");
        linky1.add("Mob 5");
        // linky2.add(0);
        // linky2.add(1);
        // linky2.add(2);
        // linky2.add(3);
        // linky2.add(4);
        // linky2.add(5);

        System.out.println(linky1);
        odwroc(linky1);
        System.out.println(linky1);
    }

    public static void odwroc(LinkedList<String> lista){
        String temp;
        for (int i = 0; i < lista.size()/2; i++){
            temp = lista.get(i);
            lista.set(i, lista.get(lista.size()-i-1));
            lista.set(lista.size()-i-1, temp);
        }
    }
}
