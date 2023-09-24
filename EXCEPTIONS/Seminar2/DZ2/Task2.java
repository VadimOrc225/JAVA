// ДВА ВАРИАНТА РЕШЕНИЯ!!! Второй (простой) внизу
package EXCEPTIONS.Seminar2.DZ2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {   // добавлен psvm. Его не было
        Scanner s = new Scanner(System.in);
        System.out.print("Введите число, на которое надо разделить элементы имеющегося массива\n");
        // заменил деление 8-го элемента несуществующего массива на деление всех элементов существующего,
        // тем самым исключив IndexOutOfВoundsException
        int[] intArray = new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8};
        double[] catchedRes1 = new double[intArray.length];
        int d;
        try {

            d = s.nextInt();  // ввод числа от пользователя
            s.close();
            if (d == 0) {                                      // заменил catch (ArithmeticException)  на if
                System.out.print("Вы ввели 0. На ноль не делим\n");
            } else {
                for (int x = 0; x < intArray.length; x++) {    // исключили IndexOutOfВoundsException

                    catchedRes1[x] = (double) intArray[x] / d;

                }
                System.out.println("Результат: ");
                for (int x = 0; x < catchedRes1.length; x++) {
                    System.out.println(catchedRes1[x]);
                }

            }
            // проверка ввода числа от пользователя
        } catch (InputMismatchException ex) {
            System.out.print("Вы ввели не число. \n");
        }


    }
}

/*
ВТОРОЙ ВАРИАНТ (ПРОСТО ИЗМЕНИЛ КУСОК КОДА)

   int d = 0;
   if(d!=0){                 //заменил catch (ArithmeticException)  на if
   try {
   double catchedRes1 = intArray[8] / d;
   System.out.println("catchedRes1 = " + catchedRes1);
} catch (ArrayIndexOutOfBoundsException e) {         //если нет 8-го элемента
   System.out.println("Catching exception: " + e);
}
}else   System.out.println("Деление на ноль");
 */