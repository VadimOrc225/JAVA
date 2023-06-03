package DZOOP1.Task2;

public class Rectangle implements I_Setter, I_ShapeInfo{
    private double width;
    private double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public Rectangle() {
        this(2, 3);
    }

    void setHeight(double height) {
        this.height = height;
    }

    void setWidth(double width) {
        this.width = width;
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    // Метод возвращает площадь прямоугольника
    public double calculateArea(double height, double width) {
        double area = height * width;
        return area;
    }

    // Метод возвращает периметр прямоугольника
    public double calculatePerimetr(double height, double width) {
        double perimetr = (height + width) * 2;
        return perimetr;
    }

    // ИНТЕРФЕЙСЫ
    @Override
    public void setMyWidth(double x) {
        this.width = x; // присвоить ширине значение x
    }

    @Override
    public void setMyHeight(double y) {
        this.height = y; // присвоить высоте значение y
    }

    @Override
    public double displayShapeInfo(double width, double height) {
        return width / height;
    }
}

