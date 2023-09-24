package EXCEPTIONS.Seminar2.DZ2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {

        float number = 0;
        boolean flag = false;
        while (!flag) {
            Scanner s = new Scanner(System.in);
            System.out.print("Введите дробное число\n");

            try {
                number = s.nextFloat();
                System.out.println(number);
                flag = true;
                s.close();
            } catch (InputMismatchException ex) {
                System.out.print("Вы ввели не число. \n");
            }
        }


    }
}
