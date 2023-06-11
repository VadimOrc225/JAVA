package DZOOP4.Task2;

import java.util.ArrayList;

public class MainDz4Task2 {
    public static void main(String[] args) {

        ArrayList<Integer> list1 = new ArrayList<>(5);
        ArrayList<String> list2 = new ArrayList<>(5);
        for (int x=1; x<=5;x++){
            list1.add(x*2);
        }
        list2.add("Franz");
        list2.add("Boris");
        list2.add("Sultan");
        list2.add("Gleb");
        list2.add("Mattias");
        Printer p1 = new Printer();
        p1.printArray(list1.toArray());
        p1.printArray(list2.toArray());

    }

}
