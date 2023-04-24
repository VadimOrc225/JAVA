package Sem2;
/*
заполнение Array List рандомно и сортировка
 */
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class Sem4Task1 {
    public static void main(String[] args) {
        /*
        final int n = 10;
        Random rd = new Random(0);
        ArrayList<Integer> arr = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            arr.add(rd.nextInt(0,100));
        }
        System.out.println(arr);
        arr.sort(null);
        System.out.println(arr);

         */
        /* Посчитать количество вхождений строки из первого массива во второй ArrayList*/
   /* String[] pl = {"1", "2", "3", "4", "5", "6"};
    Random rnd = new Random();
    ArrayList<String> plntList = new ArrayList<>();
    for (int i = 0; i<10; i++){
        plntList.add(pl[rnd.nextInt(pl.length)]);

    }
    System.out.println(plntList);

    int count = 0;
    for (String elem : pl) {
        for (String elem2 : plntList) {
            if (elem.equals(elem2)) count++;
        }
        if (count != 0){
            System.out.printf("%s: %d \n", elem, count);
            count = 0;
        }
    }
    long time = System.nanoTime();
    int count1 = 1;
    plntList.sort(null);
    for (int i = 1; i < plntList.size(); i++) {
        if (plntList.get(i).equals(plntList.get(i - 1))) {
            count1++;
        }
        else{
            System.out.printf("%s: %d; ", plntList.get(i-1), count1);
            count1 = 1;
        }
    }
        System.out.printf("%s: %d; ", plntList.get(plntList.size()-1), count1);
    time = System.nanoTime() - time;
    System.out.printf("Время выполнения %,9.3f ms\n", time/1000000.0);
*/
    /* Создать ArrayList. Поместить в него как строки, так и целые
        числа.   Пройти по списку, найти и удалить целые числа.*/
        ArrayList <Object> arr = new ArrayList<>(Arrays.asList(0, "aaa", 1, "a", 2, "ey"));

        for (int i = arr.size()-1; i >= 0 ; i--) {
            if (arr.get(i) instanceof Integer) {
                arr.remove(i);
            }
        }
        System.out.println(arr);
    }
    }