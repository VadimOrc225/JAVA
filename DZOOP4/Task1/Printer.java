package DZOOP4.Task1;

// S – Single Responsibility (Принцип единственной ответственности)
public class Printer { // класс Printer отвечает только за вывод элемента
    public <T> void printElement3(T o){
        System.out.println(o);
    }
}
