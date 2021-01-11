import java.util.LinkedList;

public class ex4 {
    public static void main(String[] args) {
        LinkedList<String> linky1 = new LinkedList<String>();
        LinkedList<Integer> linky2 = new LinkedList<Integer>();

        linky1.add("Rob 0");
        linky1.add("Bob 1");
        linky1.add("Mob 2");
        linky1.add("Rob 3");
        linky1.add("Bob 4");
        linky1.add("Mob 5");
        linky2.add(0);
        linky2.add(1);
        linky2.add(2);
        linky2.add(3);
        linky2.add(4);
        linky2.add(5);

        System.out.println(linky1);
        System.out.println(linky2);
        odwroc(linky1);
        odwroc(linky2);
        System.out.println(linky1);
        System.out.println(linky2);
    }

    public static<T> void odwroc(LinkedList<T> lista){
        lista.add(lista.get(0)); // == temp
        for (int i = 0; i < lista.size()/2; i++){
            lista.set(lista.size()-1, lista.get(i));
            lista.set(i, lista.get(lista.size()-i-2));
            lista.set(lista.size()-i-2, lista.get(lista.size()-1));
        }
        lista.remove(lista.size()-1); // removing temp value
    }
}
