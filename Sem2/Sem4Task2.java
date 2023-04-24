package Sem2;

import java.util.ArrayList;
import java.util.LinkedList;

public class Sem4Task2 {
    public static void main(String[] args) {
        // 1) Замерьте время, за которое в ArrayList добавятся 100000 элементов.
//2) Замерьте время, за которое в LinkedList добавятся 100000 элементов. Сравните с предыдущим.
        long statTime1 = System.currentTimeMillis();
        ArrayList<Integer> arr = new ArrayList<>();
        // Random rnd = new Random();
        Integer arrSize = 100000;//rnd.nextInt(10, 50);

        Double averageValue = 0.0;

        for (int i = 0; i < arrSize; i++) {
            arr.add(0, i);//(rnd.nextInt(50));
//LOGGER.info("arr[" + i + "] = " + arr.get(i));

        }
        long endTime1 = System.currentTimeMillis() - statTime1;
        long statTime2 = System.currentTimeMillis();
        LinkedList<Integer> arr2 = new LinkedList<>();
        for (int i = 0; i < arrSize; i++) {
            arr2.add(0, i);//(rnd.nextInt(50));
//LOGGER.info("arr[" + i + "] = " + arr.get(i));

        }
        long endTime2 = System.currentTimeMillis() - statTime2;
        System.out.println("Время выполнения через ArrayList = " + endTime1);
        System.out.println("Время выполнения через LinkedList = " + endTime2);
    }
}