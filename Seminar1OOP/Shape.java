package Seminar1OOP;

public class Shape {
    private double width;
    private double height;
    int i = 2;

    public Shape(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public Shape() {
        this(0,0);
    }
    public Shape(double x) {
        this(x,x);
    }
//
//    public double getWidth() {
//        return width;
//    }
//
//    public double getHeight() {
//        return height;
//    }

    void setHeight(double height) {
        this.height = height;
    }

    void setWidth(double width) {
        this.width = width;
    }
    double getHeight() {
        return height;
    }

    double getWidth() {
        return width;
    }


    void showShape() {
        System.out.printf("Ширина: %f, Высота: %f\n", width, height);
    }
}
