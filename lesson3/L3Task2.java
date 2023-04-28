package lesson3;
//2.	Пусть дан произвольный список целых чисел, удалить из него чётные числа

import java.util.Random;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class L3Task2 {
    public static void main(String[] args) {
        final int n = 10;
        Random rd = new Random(0);
        ArrayList<Integer> arr = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            arr.add(rd.nextInt(0, 100));
        }
        System.out.println(arr);
        for (int i = arr.size() - 1; i >= 0; i--) {
            if (arr.get(i) % 2 == 0) {
                arr.remove(i);
            }
        }
        System.out.println(arr);
    }
}
