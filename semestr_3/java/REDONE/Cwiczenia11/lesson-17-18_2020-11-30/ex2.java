import java.util.LinkedList;

public class ex2 {
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

        System.out.println(linky1 +"\n"+ linky2);
        redukuj(linky1,1);
        redukuj(linky2,2);
        System.out.println(linky1 +"\n"+ linky2);
    }

        public static<T> void redukuj(LinkedList<T> pracownicy, int n){
        // if(n == 0){
        //     System.out.println("Impossible");
        //     break;
        // }
        for (int i = n-1; i < pracownicy.size(); i+=n-1)
            pracownicy.remove(i);
    }
}

