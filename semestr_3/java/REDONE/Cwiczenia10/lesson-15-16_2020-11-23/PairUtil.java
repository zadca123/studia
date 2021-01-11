public class PairUtil {
    public static<T> Pair<T> swap(Pair<T> inP){
        Pair<T> hereP = new Pair<>();

        hereP.setFirst(inP.getSecond());
        hereP.setSecond(inP.getFirst());

        return hereP;
    }
}
