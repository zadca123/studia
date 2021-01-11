import java.time.LocalDate;

public class ex4_5 {
    public static void main(String[] args){
        Integer[] intArr = new Integer[5];
        intArr[0] = 9;
        intArr[1] = 3;
        intArr[2] = 8;
        intArr[3] = 2;
        intArr[4] = 1;
        int intFind= 2;
        System.out.println(ArrayUtil.binSearch(intArr,intFind));
        // System.out.println(binSearch(intArr,intFind));

        LocalDate[] dateArr = new LocalDate[5];
        dateArr[0] = LocalDate.of(1924,4,25);
        dateArr[1] = LocalDate.of(1913,1,12);
        dateArr[2] = LocalDate.of(1935,6,7);
        dateArr[3] = LocalDate.of(1945,6,19);
        dateArr[3] = LocalDate.of(1959,6,19);
        LocalDate dateFind = LocalDate.of(1935,6,7);
        System.out.println(ArrayUtil.binSearch(dateArr, dateFind));
        // System.out.println(binSearch(dateArr, dateFind));

        // selectionSort
        System.out.println("\nSelectionSort");

        ArrayUtil.selectionSort(intArr);
        for(int elem: intArr)
                System.out.println(elem);

        ArrayUtil.selectionSort(dateArr);
        for(LocalDate elem: dateArr)
                System.out.println(elem);
    }
}
