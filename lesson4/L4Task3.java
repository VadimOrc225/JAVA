package lesson4;
//3) В калькулятор добавьте возможность отменить последнюю операцию.

import java.util.LinkedList;
import java.util.Scanner;
import java.util.Deque;

public class L4Task3 {
    public static double calcul(double n1, double n2, String oper) {
        double c1 = 0;
        if (oper.equals("+")) {
            c1 = n1 + n2;
        }
        if (oper.equals("-")) {
            c1 = n1 - n2;
        }
        if (oper.equals("/")) {
            c1 = n1 / n2;
        }
        if (oper.equals("*")) {
            c1 = n1 * n2;
        }
        return c1;
    }

    public static void main(String[] args) throws Exception {
        boolean flag = false;
        double n1;
        String oper = "";
        double n2;
        double bufer = 0;
        Deque<Double> resultList = new LinkedList<>();
        Scanner iScanner = new Scanner(System.in);


        System.out.print("Введите первое число: ");
        n1 = iScanner.nextDouble();
        System.out.print("Введите знак операции: ");
        oper = iScanner.next();
        System.out.print("Введите второе число: ");
        n2 = iScanner.nextDouble();
        resultList.add(calcul(n1, n2, oper));
        bufer = resultList.getLast();
        System.out.println(bufer);
        while (!flag) {
            System.out.print("Введите знак операции: ");
            oper = iScanner.next();


            if (oper.equals("Выход")) {
                flag = true;
                break;
            }
            if (oper.equals("Отмена") && resultList.size() > 0) {
                resultList.pollLast();
                bufer = resultList.getLast();
                System.out.println(bufer);
            } else {
                bufer = resultList.getLast();
                System.out.print("Введите второе число: ");
                n2 = iScanner.nextDouble();
                resultList.add(calcul(bufer, n2, oper));
                bufer = resultList.getLast();
                System.out.println(bufer);

            }


        }
        iScanner.close();
    }


}



