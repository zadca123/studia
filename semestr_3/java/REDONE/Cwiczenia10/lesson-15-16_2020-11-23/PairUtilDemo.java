public class PairUtilDemo {
    public static void main(String[] var0) {
        String[] strArr = new String[5];
        strArr[0] = "And";
        strArr[1] = "then";
        strArr[2] = "there";
        strArr[3] = "were";
        strArr[4] = "none";
        Pair temp = ArrayAlg.minmax(strArr);

        System.out.println(temp.getFirst());
        System.out.println(temp.getSecond());

        temp = PairUtil.swap(temp);

        System.out.println(temp.getFirst());
        System.out.println(temp.getSecond());
    }
}
