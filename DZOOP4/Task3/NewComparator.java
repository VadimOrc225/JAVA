package DZOOP4.Task3;

// L — Liskov Substitution (Принцип подстановки Барбары Лисков)
public class NewComparator extends Comparator {
    @Override
    public <T extends Comparable<T>> T getMax(T o1, T o2) {
        return super.getMax(o1, o2);
    }

    public <T extends Comparable<T>> T getMin(T o1, T o2) {
        return (o1.compareTo(o2) <= 0) ? o1 : o2;
    }
}
