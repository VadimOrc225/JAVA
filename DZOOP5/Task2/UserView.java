package DZOOP5.Task2;

import java.util.Scanner;

public class UserView {
    Scanner iScanner = new Scanner(System.in);
    public char getInputOperator() {
        System.out.println("Что Вы хотите? (Зарегистрироваться - введите 1; Войти как зарегистрированный пользователь -" +
                " введите 2");
        char op = iScanner.next().charAt(0);
        String s = "129";
        if (s.indexOf(op) == -1) {            // проверка на ввод правильного знака операции
            System.out.println("Ввод неверный.Повторите ввод");
            getInputOperator();
        }
        return op;
    }
    public String getInputName() {
        System.out.println("Введите Ваше имя");
        String name = iScanner.next();
        return name;
    }
    public String getInputLogin() {
        System.out.println("Введите логин");
        String login = iScanner.next();
        return login;
    }
    public String getInputPassword() {
        System.out.println("Введите пароль");
        String password = iScanner.next();
        return password;
    }

    public char getInputAction() {
        System.out.println("Что Вы хотите? (Изменить логин - введите 1; Изменить пароль - введите 2; Выход - 9");
        char op2 = iScanner.next().charAt(0);
        String s = "129";
        if (s.indexOf(op2) == -1) {            // проверка на ввод правильного знака операции
            System.out.println("Ввод неверный.Повторите ввод");
            getInputAction();
        }
        return op2;
    }
    public String getInputNewLogin() {
        System.out.println("Введите новый логин");
        String newLogin = iScanner.next();
        return newLogin;
    }
    public String getInputNewPassword() {
        System.out.println("Введите новый пароль");
        String newPassword = iScanner.next();
        return newPassword;
    }
    public void greetingWord(){
        System.out.println("Такого пользователя не существует. Повторите ввод. 9 - выход в предыдущее меню");
    }
}
