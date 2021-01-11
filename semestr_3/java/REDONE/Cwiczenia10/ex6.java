import java.time.LocalDate;

public class ex6 {
    public static void main(String[] args) {
        Integer[] arr1 = new Integer[5];
        arr1[0] = 3;
        arr1[1] = 2;
        arr1[2] = 1;
        arr1[3] = 2;
        arr1[4] = 0;
        for (Object var : arr1) {
            System.out.print(var + ", ");
        }
        System.out.println();
        ArrayUtil.selectionSort(arr1);
        for (Object var : arr1) {
            System.out.print(var + ", ");
        }
        System.out.println("\n");

        LocalDate[] arr2 = new LocalDate[5];
        arr2[0] = LocalDate.of(1230, 3, 20);
        arr2[1] = LocalDate.of(1270, 2, 20);
        arr2[2] = LocalDate.of(1990, 1, 20);
        arr2[3] = LocalDate.of(2222, 3, 20);
        arr2[4] = LocalDate.of(1333, 5, 20);
        for (Object var : arr2) {
            System.out.print(var + ", ");
        }
        System.out.println();
        ArrayUtil.selectionSort(arr2);
        for (Object var : arr2) {
            System.out.print(var + ", ");
        }
    }
}
