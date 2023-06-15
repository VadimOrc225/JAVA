package DZOOP7.Calculator;


public class Calc {
    public static void main(String[] args) throws Exception {
        CalculatorModel model = new CalculatorModel();
        CalculatorView view = new CalculatorView();
        Complex complex = new Complex();
        CalculatorPresenter presenter = new CalculatorPresenter(view, model, complex);


        presenter.performChoice();

    }

}

