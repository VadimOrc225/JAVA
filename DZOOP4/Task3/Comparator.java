package DZOOP4.Task3;

public class Comparator {
    //    T o1;
//    T o2;
//    Comparator(T o, T o_2) {
//        o1 = o;
//        o2 = o_2;
//    }
    public <T extends Comparable<T>> T getMax(T o1, T o2) {
        return (o1.compareTo(o2) >= 0) ? o1 : o2;
    }
}
