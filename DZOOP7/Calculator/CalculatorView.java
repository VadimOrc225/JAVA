package DZOOP7.Calculator;


import java.util.Scanner;

public class CalculatorView {
    Scanner iScanner = new Scanner(System.in);


    public char getInputType() {
        System.out.println("Вас приветствует калькулятор! (Работа с комплексными числами - введите 1; Работа с вещественными числами -" +
                " введите 2");
        char op = iScanner.next().charAt(0);
        String s = "129";
        if (s.indexOf(op) == -1) {            // проверка ввода правильного номера операции
            System.out.println("Ввод неверный.Повторите ввод");
            getInputType();
        }
        return op;
    }

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

    public void getComplexRealDouble() {
        System.out.println("Введите действительную часть числа: ");
    }

    public void getComplexImageDouble() {
        System.out.println("Введите мнимую часть числа: ");
    }

    public void displayResult(double result) {
        System.out.println("Result: " + result);
    }// используется для вывода результата

    public void print(Complex resultComplex) {// используется для форматированного вывода РЕЗУЛЬТАТА типа Complex

        if (resultComplex.getImage() > 0) {

            System.out.println(resultComplex.getReal() + " + " + resultComplex.getImage() + "i");
        } else if (resultComplex.getImage() < 0) {
            System.out.println(resultComplex.getReal() + "" + resultComplex.getImage() + "i");
        } else {
            System.out.println(resultComplex.getReal());
        }
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
