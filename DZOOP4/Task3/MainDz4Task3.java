package DZOOP4.Task3;

public class MainDz4Task3 {
    public static void main(String[] args) {
        Comparator c = new Comparator();
        System.out.println(c.getMax(5,6));
        System.out.println(c.getMax("Олег","Александр"));
        System.out.println(c.getMax(0.23,0.245));
    }

}
