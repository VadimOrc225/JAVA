package Seminar1OOP;

public class Triangle extends Shape {
    String style;
    int i = 2;

    public Triangle() {
        super();
        style = "None";
    }

    public Triangle(double width, double height, String style) {
        super(width, height);
        this.style = style;
    }

    public Triangle(double x) {
        super(x, x);
    }

    double area() {
        return getHeight() * getWidth() / 2;
    }

    void showStyle() {
        System.out.println(style);
    }
//    double width;
//    double height;
//    int i = 2;
//
//    public void Shape(double width, double height) {
//        this.width = width;
//        this.height = height;
//    }
//
//    public void Shape() {
//        this(0,0);
//    }

//
//    public double getWidth() {
//        return width;
//    }
//
//    public double getHeight() {
//        return height;
//    }
//
//    public void setHeight(double height) {
//        this.height = height;
//    }
//
//    public void setWidth(double width) {
//        this.width = width;
//    }
//


    @Override
    void showShape() {
        System.out.printf("Ширина: %f, Высота: %f\n", getWidth(), getHeight());
    }
}
