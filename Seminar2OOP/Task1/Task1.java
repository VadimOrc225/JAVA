package Seminar2OOP.Task1;

public class Task1 {
    public static void main(String[] args) {
        Numeric n = new Numeric();
        for (int i = 0; i < 5; i++) {
            System.out.printf("Следующее значение %d\n", n.getNext());

        }
        System.out.println("Сброс");
        n.reset();
        for (int i = 0; i < 5; i++) {
            System.out.printf("Следующее значение %d\n", n.getNext());
            System.out.println("Начальное значение");
            n.setStart(100);
        }
        for (int i = 0; i < 5; i++) {
            System.out.printf("Следующее значение %d\n", n.getNext());

        }
    }
}


