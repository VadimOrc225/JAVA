package DZOOP4.Task3;

public class MainDz4Task3 {

    // Прежде всего здесь Liskov и также D — Dependency Inversion (Принцип инверсии зависимостей)
    // По пятому принципу D класс Main не зависит от интерфейса Comparable. От него зависит метод класса Comparator
    public static void main(String[] args) {
        Comparator c = new Comparator();
        System.out.println(c.getMax(5,6));
        System.out.println(c.getMax("Олег","Александр"));
        System.out.println(c.getMax(0.23,0.245));
        System.out.println("Благодаря принципу Liskov решаем ту же задачу с помощью потомка");
        NewComparator c1 = new NewComparator();
        System.out.println(c1.getMax(5,6));
        System.out.println(c1.getMax("Олег","Александр"));
        System.out.println(c1.getMax(0.23,0.245));
        System.out.println("Благодаря принципу 2 расширяем класс методом getMin");
        System.out.println(c1.getMin(5,6));
        System.out.println(c1.getMin("Олег","Александр"));
        System.out.println(c1.getMin(0.23,0.245));
    }

}
