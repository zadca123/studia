import java.time.LocalDate;
public class ArrayUtil {
    public static <T extends Comparable<T>> boolean isSorted(T[] a){
        for(int i=1; i< a.length; i++){
            if(a[i-1].compareTo(a[i]) == -1)
                return true;
            else
                break;
        }
        return false;
    }

    public static <T extends Comparable<T>> int binSearch(T[] a, T toFind){
        int lewo = 0;
        int prawo = a.length;
        int index;

        while(lewo <= prawo){
            index = (lewo + prawo) / 2;
            if(a[index].compareTo(toFind) > 0)
                lewo = index - 1;
            else if(a[index].compareTo(toFind) < 0)
                prawo = index + 1;
            else if(a[index].compareTo(toFind) == 0)
                return index;
        }
        return -1;
    }

    public static <T extends Comparable<T>> void selectionSort(T[] a){
        int index;
        for (int i = 0; i < a.length; i++){
            index = i;
            for (int j = 0; j< a.length; j++)
                if(a[i].compareTo(a[index]) < 0)
                    index = j;
            T swap = a[i];
            a[i] = a[index];
            a[index] = swap;
        }
    }

    // public static <T extends Comparable<T>> void mergeSort(T[] a){
    // }
}
