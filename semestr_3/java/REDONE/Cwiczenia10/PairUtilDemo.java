public class PairUtilDemo {
    public static void main(String[] args) {
        Pair<String> para = new Pair<String>("Polska", "Czosnek");

        System.out.println(para.getFirst());
        System.out.println(para.getSecond());

        para = PairUtil.swap(para);
        System.out.println(para.getFirst());
        System.out.println(para.getSecond());
    }
}
