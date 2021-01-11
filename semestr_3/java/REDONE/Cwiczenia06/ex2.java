public class ex2 {
    public static void main(String[] args) {
        IntegerSet s1 = new IntegerSet();
        IntegerSet s2 = new IntegerSet();

        for(int i = 0; i<100;i++){
            s1.bolArr[i] = false;
            if(i < 10)
                s1.bolArr[i] = true;
            else
                s1.bolArr[i] = false;
        }

        s2.bolArr[5] = true;
        s2.bolArr[53] = true;
        s2.bolArr[52] = true;
        s2.bolArr[51] = true;

        IntegerSet.writeSet(s1.bolArr);
        IntegerSet.writeSet(s2.bolArr);

        System.out.println("\nUnion");
        IntegerSet.writeSet(IntegerSet.union(s1.bolArr, s2.bolArr));

        System.out.println("\nIntersection");
        IntegerSet.writeSet(IntegerSet.intersection(s1.bolArr, s2.bolArr));

        System.out.println("\ninsertElement");
        s1.insertElement(33);
        s2.insertElement(33);
        IntegerSet.writeSet(s1.bolArr);
        IntegerSet.writeSet(s2.bolArr);

        System.out.println("\ndeleteElement");
        s1.deleteElement(33);
        s2.deleteElement(33);
        IntegerSet.writeSet(s1.bolArr);
        IntegerSet.writeSet(s2.bolArr);

        System.out.println("\ntoString");
        System.out.println(s1.toString());

        System.out.println("\nequals");
        System.out.println(s1.equals(s2));

    }
}
