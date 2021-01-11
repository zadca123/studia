import java.util.Stack;
import java.util.ArrayList;
// import java.util.Iterable;

public class ex8 {
    public static void main(String[] args) {
        ArrayList<Integer> al1 = new ArrayList<>();
        ArrayList<String> al2 = new ArrayList<>();
        // ArrayList<String> al2 = new ArrayList<>();
        int[] arr1 = new int[]{1,2,3,4,5};
        String[] arr2 = new String[]{"Str1", "Str2", "Str3"};
        Character[] arr3 = new Character[]{'A','B','C','D','E'};
        al1.add(1);
        al1.add(2);
        al1.add(3);
        al2.add("String 1");
        al2.add("String 1");
        al2.add("String 1");

        // print(al1);
        // print(al2);
        // print(arr1);
        print(arr2);
        print(arr3);
    }

    public static <E> void print(E[] tab){
        for (E var : tab)
            System.out.print(var + ", ");
        System.out.println();
    }
}
