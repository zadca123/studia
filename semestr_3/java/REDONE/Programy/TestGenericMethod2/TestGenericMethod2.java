public class TestGenericMethod2 {

    public static void main(String args[])
    {
        Integer[] a = {5, 10, 15, -15, -10, -5};
        System.out.println(ArrayAlg.<Integer>min(a));
        System.out.println(ArrayAlg.min(a));  // wystarczy tak

        Punkt[] b = {new Punkt(0, 0), new Punkt(0, 1), new Punkt(1, 0)};

        // błąd kompilacji: klasa Punkt nie implementuje interfejsu Comparable
        // System.out.println(ArrayAlg.<Punkt>min(b));

    }

}

class ArrayAlg {
    // public static <T> T min(T[] a) {
    public static <T extends Comparable<T>> T min(T[] a)
    {
        if (a == null || a.length == 0) {
            return null;
        }

        T smallest = a[0];

        for (int j = 1; j < a.length; ++j) {
            if (smallest.compareTo(a[j]) > 0) {
                smallest = a[j];
            }
        }

        return smallest;
    }

}

class Punkt {
    Punkt(int x, int y)
    {
        this.x = x;
        this.y = y;
    }

    int x()
    {
        return x;
    }

    int y()
    {
        return y;
    }

    private int x, y;
}

