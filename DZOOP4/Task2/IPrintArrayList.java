package DZOOP4.Task2;

import java.util.ArrayList;

public interface IPrintArrayList {
    public default <T> void printArray(ArrayList<T> list1){
        T[] items = (T[]) list1.toArray();
        for(T item: items){
            System.out.println(item);
        }
    }
}
