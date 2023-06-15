package DZOOP5.Task2;

import java.util.ArrayList;


    public class User {
        private String name;
        private String login;
        private String password;

        public User() {
        }

        public User(String name, String login, String password) {   //три конструктора
            this.name = name;
            this.login = login;
            this.password = password;
        }

        public User(String login, String password) {

            this.login = login;
            this.password = password;
        }

        public User(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getLogin() {
            return login;
        }

        public void setLogin(String login) {
            this.login = login;
        }

        public String getPassword() {
            return password;
        }

        public void setPassword(String password) {
            this.password = password;
        }

        public void displayInfo() {
            System.out.printf("Имя пользователя: %s, Логин: %s.\n", getName(), getLogin());
        }

        private ArrayList<User> catalog = new ArrayList<>();

        public void addition(User user) {
            catalog.add(user);

        }

        public boolean greeting(User user) {

            for (User x : catalog) {
                if (user.login.equals(x.login) && user.password.equals(x.password)) {
                    return true;

                }

            }
            return false;
        }
    }


