package lesson1;

//3.	Реализовать простой калькулятор
//        Введите первое число: 12
//        Введите операцию: +
//        Введите второе число: 1
//        Ответ: 13


import java.util.Scanner;
public class L1Task3 {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.print("Введите первое число: ");
        double n1 = iScanner.nextDouble();
        System.out.print("Введите знак операции: ");
        String oper = iScanner.next();
        System.out.print("Введите второе число: ");
        double n2 = iScanner.nextDouble();
        double c = 0;
        if (oper.equals("+")) {
            c = n1 + n2;
        }
        if (oper.equals("-")) {
            c = n1 - n2;
        }
        if (oper.equals("/")) {
            c = n1 / n2;
        }
        if (oper.equals("*")) {
            c = n1 * n2;
        }
        System.out.printf("Ответ %f", c);
        iScanner.close();
    }
}
