package DZOOP4.Task1;

public class MainDz4Task1 {
    public static void main(String[] args) {
        System.out.println("Применен метод из класса Element, расширенного по второму принципу");
        Element<String> el1 = new Element<>("First");
        Element<Integer> el2 = new Element<>(2);
        el1.printEl(el1.getEl());
        el2.printEl(el2.getEl());
        Element<Double> el3 = new Element<>();
        el3.printEl(6.77);

        System.out.println("Метод printElement3 класса PRINTER - первый принцип");
Printer p = new Printer();
        p.printElement3(5);
        p.printElement3("WORD");
        p.printElement3(8.9999);
    }



}
