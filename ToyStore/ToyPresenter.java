package ToyStore;

public class ToyPresenter {
    private Toy model;
    private ToyView view;

    public ToyPresenter(Toy model, ToyView view) {
        this.model = model;
        this.view = view;
    }

    public void performAction() {
        char operator = view.getInputOperator();
        switch (operator) {
            case '1':
                String id = view.getInputId();
                String name = view.getInputName();
                Integer quantity = view.getInputQuantity();
                Integer frequency = view.getInputFrequency();
                Toy toy = new Toy(id, name, quantity, frequency);
                model.addition(toy);

                break;
            case '2':
                id = view.getInputId();
                name = view.getInputName();
                Toy toy2 = new Toy(id, name);
                if (model.greeting(toy2)) {
                    char operatorAction = view.getInputAction();
                    switch (operatorAction) {
                        case '1':
                            quantity = view.getInputNewQuantity();
                            model.setQuantity(quantity);
                            break;
                        case '2':
                            frequency = view.getInputNewFrequency();
                            model.setFrequency(frequency);

                            break;
                        case '9':
                            performAction();
                    }
                }
            case '9':
                performAction();
        }
        performAction();
    }
}