package Seminar1OOP;

public class Task1 {
    public static void main(String[] args) {
        Triangle t1 = new Triangle();
        Triangle t2 = new Triangle(5.0);
        Triangle t3 = new Triangle(5.0, 3.0, "blue");

//        t1.setHeight(4.0);
//        t1.setWidth(3.0);
//        t2.style = "red";

        t1.showShape();
        t2.showShape();
        t3.showShape();

        t3.showStyle();
//        t3.showShape();



    }
}
