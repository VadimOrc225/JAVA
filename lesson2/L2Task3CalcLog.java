package lesson2;
//3.	Реализовать простой калькулятор
// с записью результатов в файл


import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;
public class L2Task3CalcLog {
    public static void main(String[] args) throws Exception {
        String fileName = "resultCalc.txt";
        File file = new File(fileName);
        FileWriter writer = new FileWriter(file, true);
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
        StringBuilder res = new StringBuilder();
        res.append(Double.toString(n1));
        res.append(" ");
        res.append(oper);
        res.append(" ");
        res.append(Double.toString(n2));
        res.append(" = ");
        res.append(Double.toString(c));
        System.out.printf("%f %s %f = %f", n1, oper, n2, c);
        try {
            writer.write(String.valueOf(res));
            writer.write("\n");


        } catch (Exception e) {
            System.out.println("Ошибка");
        }
        iScanner.close();
        writer.close();
    }
}