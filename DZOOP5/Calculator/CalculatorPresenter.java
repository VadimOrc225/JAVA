package DZOOP5.Calculator;

public class CalculatorPresenter {
    private CalculatorView view;
    private CalculatorModel model;

    public  CalculatorPresenter(CalculatorView view, CalculatorModel model){
        this.view = view;
        this.model = model;
    }
    public void performCalculation(){
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
                model.devision(number2);
                break;
        }
        view.displayResult(model.getResult());
    }
}
