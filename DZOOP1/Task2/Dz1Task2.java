package DZOOP1.Task2;


public class Dz1Task2 {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle();
        Rectangle r2 = new Rectangle(5.0, 5.5);
        Rectangle r3 = new Rectangle(5.0, 8.0);

        System.out.printf("Площадь прямоугольника: %f \n", r1.calculateArea(r1.getHeight(), r1.getWidth()));
//        System.out.printf("Площадь прямоугольника: %f \n", r2.calculateArea(r2.getHeight(), r2.getWidth()));
//        System.out.printf("Площадь прямоугольника: %f \n", r3.calculateArea(r3.getHeight(), r3.getWidth()));
        System.out.printf("Периметр прямоугольника: %f \n", r1.calculatePerimetr(r1.getHeight(), r1.getWidth()));
//        System.out.printf("Периметр прямоугольника: %f \n", r2.calculatePerimetr(r2.getHeight(), r2.getWidth()));
//        System.out.printf("Периметр прямоугольника: %f \n", r3.calculatePerimetr(r3.getHeight(), r3.getWidth()));
        System.out.println("-------------------------");
//        Использование интерфейсов
        System.out.println("Используем три метода двух интерфейсов:");
        r1.setMyWidth(25); // установим значение длины прямоугольника (используем метод интерфейса I_Setter)
        r1.setMyHeight(5.5); // установим значение высоты прямоугольника (используем метод интерфейса I_Setter)
        System.out.printf("Отношение длины к высоте: %f \n", r1.displayShapeInfo(r1.getWidth(), r1.getHeight()));
        // используем метод интерфейса I_ShapeInfo)
    }
}
