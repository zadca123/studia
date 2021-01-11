import java.time.LocalDate;
public class ex3 {
    public static void main(String[] args) {
        Integer[] arr1 = new Integer[5];

        arr1[0] = 1;
        arr1[1] = 3;
        arr1[2] = 2;
        arr1[3] = 4;
        arr1[4] = 5;
        System.out.println(ArrayUtil.isSorted(arr1));

        LocalDate[] arr2 = new LocalDate[5];
        arr2[0] = LocalDate.of(2020, 2, 20);
        arr2[1] = LocalDate.of(2020, 2, 19);
        arr2[2] = LocalDate.of(2020, 3, 20);
        arr2[3] = LocalDate.of(2020, 4, 20);
        arr2[4] = LocalDate.of(2020, 5, 20);
        System.out.println(ArrayUtil.isSorted(arr2));
    }
}
