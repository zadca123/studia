import java.util.LinkedList;

public class ex1 {
    public static void main(String[] args) {
        LinkedList<String> linky = new LinkedList<String>();

        linky.add("Rob 0");
        linky.add("Bob 1");
        linky.add("Mob 2");
        linky.add("Rob 3");
        linky.add("Bob 4");
        linky.add("Mob 5");
        linky.add("Rob 6");
        linky.add("Bob 7");
        linky.add("Mob 8");
        linky.add("Rob 9");
        linky.add("Bob 10");
        linky.add("Mob 11");

        System.out.println(linky);
        redukuj(linky,5);
        System.out.println(linky);
    }

    public static void redukuj(LinkedList<String> pracownicy, int n){
        for (int i = 0; i < pracownicy.size(); i+=n-1)
            pracownicy.remove(i);
    }
}

