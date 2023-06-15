package DZOOP7.Calculator;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class CalculatorPresenter {
    private CalculatorView view;
    private CalculatorModel model;
    Complex complex;
    String fileName = "resultCalc.txt";
    File file = new File(fileName);
    FileWriter writer;

    {
        try {
            writer = new FileWriter(file, true);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public  CalculatorPresenter(CalculatorView view, CalculatorModel model){
        this.view = view;
        this.model = model;
    }
    public  CalculatorPresenter(CalculatorView view, CalculatorModel model, Complex complex){
        this.view = view;
        this.model = model;
        this.complex = complex;
    }
    public void performChoice(){             //выбор варианта калькулятора

        char operator = view.getInputType();
        switch (operator) {
            case '1':
                performComplexCalculation();  //работа с комплексными числами
                break;
            case '2':
                performCalculation();  //работа с вещественными числами
                break;
        }

    }
    public void performCalculation(){     //работа с вещественными числами
        double number = view.getDouble();
        char operator = view.getInputOperator();
        double number2 = view.getDouble();
        model.setResult(number);
        switch (operator){
            case '+':
                model.add(number2);
                break;
            case '-':
                model.subs(number2);
                break;
            case '*':
                model.mult(number2);
                break;
            case '/':
                model.division(number2);
                break;
        }
        view.displayResult(model.getResult());
    }
    public void performComplexCalculation(){  //работа с комплексными числами
        StringBuilder res = new StringBuilder();
        view.getComplexRealDouble();
        double numberReal = view.getDouble();
        res.append(Double.toString(numberReal));
        res.append(" + ");

        view.getComplexImageDouble();
        double numberImage = view.getDouble();
        res.append(Double.toString(numberImage));
        res.append("i");
        complex.setReal(numberReal);
        complex.setImage(numberImage);
        char operator = view.getInputOperator();
        res.append(" ");
        res.append(operator);
        res.append(" ");
        view.getComplexRealDouble();
        double number2Real = view.getDouble();
        res.append(Double.toString(number2Real));
        res.append(" + ");
        view.getComplexImageDouble();
        double number2Image = view.getDouble();
        res.append(Double.toString(number2Image));
        res.append("i");
        res.append(" = ");
        Complex number2 = new Complex(number2Real, number2Image);
        switch (operator){
            case '+':
                view.print(complex.addC(number2));
                res.append(complex.addC(number2).getReal());
                res.append(" + ");
                res.append(complex.addC(number2).getImage());
                res.append("i");
                break;
            case '-':
                view.print(complex.subC(number2));
                res.append(complex.addC(number2).getReal());
                res.append(" + ");
                res.append(complex.addC(number2).getImage());
                res.append("i");

                break;
            case '*':
                view.print(complex.mulC(number2));
                res.append(complex.addC(number2).getReal());
                res.append(" + ");
                res.append(complex.addC(number2).getImage());
                res.append("i");
                break;
            case '/':
                view.print(complex.divC(number2));
                res.append(complex.addC(number2).getReal());
                res.append(" + ");
                res.append(complex.addC(number2).getImage());
                res.append("i");
                break;
        }
        try {
            writer.write(String.valueOf(res));
            writer.write("\n");


        } catch (Exception e) {
            System.out.println("Ошибка");
        }

        try {
            writer.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
