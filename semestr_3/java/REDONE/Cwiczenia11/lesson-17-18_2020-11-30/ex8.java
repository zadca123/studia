public class ex8 {
    public static void main(String[] args) {
        String[] strArr = new String[4];
        Character[] charArr = new Character[4];
        strArr[0] = "qwe";
        strArr[1] = "asd";
        strArr[2] = "abc";
        strArr[3] = "pow";
        charArr[0] = 'A';
        charArr[1] = 'B';
        charArr[2] = 'C';
        charArr[3] = 'D';

        print(strArr);
        print(charArr);

        // // doesn't work :<
        // int[] intArr = new int[4];
        // intArr[0] = 1;
        // intArr[1] = 2;
        // intArr[2] = 3;
        // intArr[3] = 4;
        // print(intArr);
    }
    public static <T> void print(T[] n){
        for(T elem: n)
            System.out.print(elem + ", ");
        System.out.println();
    }
}
