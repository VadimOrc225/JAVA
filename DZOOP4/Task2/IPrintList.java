package DZOOP4.Task2;

import java.util.ArrayList;

public interface IPrintList {
    public default <T> void printArray(T[] items) {
        for (T item : items) {
            System.out.println(item);
        }
    }
}
