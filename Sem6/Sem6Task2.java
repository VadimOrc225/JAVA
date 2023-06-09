package Sem6;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

/*
1. Напишите метод, который заполнит массив из 100 элементов случайными цифрами от 0 до 100.

2. Создайте метод, в который передайте заполненный выше массив и с помощью Set вычислите
процент уникальных значений в данном массиве и верните его в виде числа с плавающей запятой.

Для вычисления процента используйте формулу:

процент уникальных чисел = количество уникальных чисел * 100 / общее количество чисел в массиве.
 *
 */
public class Sem6Task2 {
    public static void main(String[] args) {
        ArrayList<Integer> dataArray = new ArrayList<>(100);

        Random rd = new Random();
        for(int i = 0; i < 99; i++){
            dataArray.add(rd.nextInt(100));

        }

        Set<Integer> set = new HashSet<>(dataArray);//Преобразовали в List

        System.out.println(set); // []
        System.out.printf("%.2f\n",(double)set.size()*100/dataArray.size());//Привели к double
    }
}
