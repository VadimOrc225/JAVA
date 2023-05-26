package Sem6;

public class Sem6Task3 {
        public static void main(String[] args) {
            Cat1 cat = new Cat1();
            cat.name = "Барсик";
            cat.birthyear = 2020;
            cat.gender = true;
            cat.vendor_phone = "123456";

            cat.visit("21042023", "Вытащили занозу");
            cat.visit("21052023", "Всё отлично, кот здоров");

            cat.printVisits();
            cat.miay();
        }
    }




