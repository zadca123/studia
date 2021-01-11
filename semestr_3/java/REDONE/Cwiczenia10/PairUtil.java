public class PairUtil<T> {
    public static<T> Pair<T> swap(Pair<T> obj){
        Pair<T> p = new Pair<T>();
        p.setFirst(obj.getSecond());
        p.setSecond(obj.getFirst());
        return p;
    }
}
