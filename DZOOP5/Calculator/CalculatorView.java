package DZOOP5.Calculator;


import java.util.Scanner;

public class CalculatorView {
    Scanner iScanner = new Scanner(System.in);

    public Double getDouble() {
        double n = 0;

        System.out.println("Введите число: ");
        if (iScanner.hasNextDouble()) {             // проверка на ввод дробного числа
            n = iScanner.nextDouble();
        } else {
            System.out.println("Надо ввести число.");
            iScanner.nextLine();
            n = getDouble();
        }
        return n;
    }


//    public String getOperator() {
//        System.out.println("Enter operator: ");
//        return iScanner.nextLine();
//    }

    public void displayResult(double result) {
        System.out.println("Result: " + result);
    }

    public char getInputOperator() {
        System.out.println("Введите оператор (+,-,*,/): ");
        char op = iScanner.next().charAt(0);
        String s = "+-*/";
        if (s.indexOf(op) == -1) {            // проверка на ввод правильного знака операции
            getInputOperator();
        }
        return op;
    }
}
