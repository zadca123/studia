public class ArrayUtil {
    public static <T extends Comparable<T>>boolean isSorted(T[] obj){
        for(int i = 1;i<obj.length;i++)
            if(obj[i-1].compareTo(obj[i]) > 0)
                return false;
        return true;
    }

    public static <T extends Comparable<T>> int binSearch(T[] a, T b){
        int low = 0;
        int high = a.length;
        while(low <= high){
            int mid = (low + high) / 2;
            if (a[mid].compareTo(b) < 0)
                low = mid + 1;
            else if (a[mid].compareTo(b) > 0)
                high = mid - 1;
            else
                return mid;
        }
        return -1;
    }

    public static <T extends Comparable<T>> void selectionSort(T[] tab){
        T tmp;
        int index;
        for (int i = 0; i < tab.length-1; i++) {
            index = i;
            for(int j = i+1; j<tab.length;j++)
                if(tab[j].compareTo(tab[index]) < 0)
                    index = j;
            tmp = tab[i];
            tab[i] = tab[index];
            tab[index] = tmp;
        }
    }

    // public static <T extends Comparable<T>> T[] mergeSort(T[] tab){
    //     T[] sorted = new T[tab.length];
    //     // int index;
    //     // for (int i = 0; i < tab.length-1; i++) {
    //     // }
    //     return sorted;
    // }
}
