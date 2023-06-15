package DZOOP5.Calculator;

public class CalculatorModel {
    private double result;
    public void add(double number){
        result+= number;
    }
    public void subs(double number){
        result-= number;
    }
    public void mult(double number){
        result*= number;
    }
    public void devision(double number){
        try {
            result/= number;
        } catch (ArithmeticException e) {                        // обработка ошибки
            System.out.println("Ошибка! Нельзя делить на ноль!");
        }
    }

    public double getResult() {
        return result;
    }

    public void setResult(double result) {
        this.result = result;
    }
}
