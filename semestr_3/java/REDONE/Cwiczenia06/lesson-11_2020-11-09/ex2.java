import java.util.*;

public class ex2{
    public static void main(String[] args) {
        IntegerSet s1 = new IntegerSet();
        IntegerSet s2 = new IntegerSet();
        for (int i = 0; i<100; i++) {
            s2.bolArr[i] = false;
            if (i<=8)
                s1.bolArr[i] = true;
            else
                s1.bolArr[i] = false;
        }
        s2.bolArr[75] = true;
        s2.bolArr[34] = true;
        s2.bolArr[85] = true;
        s2.bolArr[99] = true;


        IntegerSet.writeSet(s1.bolArr);
        IntegerSet.writeSet(s2.bolArr);

        System.out.println("\nunion and intersection");
        IntegerSet.writeSet(IntegerSet.union(s1.bolArr, s2.bolArr));
        IntegerSet.writeSet(IntegerSet.intersection(s1.bolArr, s2.bolArr));

        System.out.println("\ninsert and delete element");
        IntegerSet.writeSet(s1.bolArr);
        s1.insertElement(64);
        s1.deleteElement(2);
        IntegerSet.writeSet(s1.bolArr);

        System.out.println("\ntoString");
        System.out.println(s1.toString());

        System.out.println("\nequals");
        System.out.println(s1.equals(s1));
        System.out.println(s1.equals(s2));

    }
}
