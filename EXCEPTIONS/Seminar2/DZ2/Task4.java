package EXCEPTIONS.Seminar2.DZ2;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {

        String str = null;
        boolean flag = false;
        while (!flag) {
            Scanner s = new Scanner(System.in);
            System.out.print("Введите строку:\n");
            str = s.nextLine();
            if (str.equals("")) {
                throw new RuntimeException("Пустые строки вводить нельзя");
            } else {
                flag = true;
            }

        }

    }


}

