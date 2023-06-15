package DZOOP5.Task2;

public class UserPresenter {
    private User model;
    private UserView view;

    public UserPresenter(User model, UserView view) {
        this.model = model;
        this.view = view;
    }

    public void performAction() {
        char operator = view.getInputOperator();
        switch (operator) {
            case '1':
                String name = view.getInputName();
                String login = view.getInputLogin();
                String password = view.getInputPassword();
                User user = new User(name, login, password);
                model.addition(user);

                break;
            case '2':
                login = view.getInputLogin();
                password = view.getInputPassword();
                User user2 = new User(login, password);
                if (model.greeting(user2)) {
                    char operatorAction = view.getInputAction();
                    switch (operatorAction) {
                        case '1':
                            login = view.getInputNewLogin();
                            model.setLogin(login);
                            break;
                        case '2':
                            password = view.getInputNewPassword(); // пока "ПОВТОРИТЕ ПАРОЛЬ" не реализовал
                            model.setPassword(password);

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