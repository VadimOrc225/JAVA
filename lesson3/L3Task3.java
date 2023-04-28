package lesson3;

//3.	Задан целочисленный список ArrayList. Найти минимальное, максимальное и среднее из этого списка.

import java.util.Random;
import java.util.ArrayList;


public class L3Task3 {
    public static void main(String[] args) {
        final int n = 10;
        Random rd = new Random(0);
        ArrayList<Integer> arr = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            arr.add(rd.nextInt(10, 90));
        }
        System.out.println(arr);
        System.out.printf("Максимальное значение массива %d\n", maximal(arr));
        System.out.printf("Минимальное значение массива %d\n", minimal(arr));
        System.out.printf("Среднее значение %f", average(arr));

    }

    public static int maximal(ArrayList<Integer> arr) {
        int maxVal = arr.get(0);
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) > maxVal) {
                maxVal = arr.get(i);
            }

        }
        return maxVal;
    }

    public static int minimal(ArrayList<Integer> arr) {
        int minVal = arr.get(0);
        for (Integer integer : arr) {
            if (integer < minVal) {
                minVal = integer;
            }

        }
        return minVal;
    }

    public static double average(ArrayList<Integer> arr) {
        int sumList = 0;
        double averageVal;
        for (int i = 0; i < arr.size(); i++) {
            sumList += arr.get(i);
        }
        averageVal = (double) sumList / arr.size();

        return averageVal;
    }
}


