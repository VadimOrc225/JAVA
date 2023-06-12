package DZOOP4.Task2;

import java.util.ArrayList;
// I — Interface Segregation (Принцип разделения интерфейсов)

public class Printer implements IPrintList, IPrintArrayList{

    @Override
    public <T> void printArray(ArrayList<T> list1) {
        IPrintArrayList.super.printArray(list1);
    }

    @Override
    public <T> void printArray(T[] items) {
        IPrintList.super.printArray(items);
    }
}
