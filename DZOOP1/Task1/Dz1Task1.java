package DZOOP1.Task1;


public class Dz1Task1 {
    public static void main(String[] args) {
        Cat c1 = new Cat();
        Cat c2 = new Cat();
        c1.setName("Barsik");
        c1.setAge(3);
        c1.setHost(new Owner("Максим"));
        c2.setName("Vas`ka");
        c2.setAge(4);
        c2.setHost(new Owner("Николай"));
        c1.greet();
//        c2.greet();
        c1.greet2();
    }
}
