package DZOOP4.Task2;

public class Printer {
    public <T> void printArray(T[] items){
        for(T item: items){
            System.out.println(item);
        }
}
}
