package DZOOP5.Task2;

public class UserManagmentApp {
    public static void main(String[] args) {
        User model = new User();
        UserView view = new UserView();
        UserPresenter presenter = new UserPresenter(model, view);
        presenter.performAction();

    }
}
