package lesson5;

// телефонная книга
import java.util.*;

public class L5Task1 {
    public static void main(String[] args) {
        Map<String, String> db = new HashMap<>();

        boolean flag = false;
        int oper;
        String surname = "";
        String number = "";
        Scanner iScanner = new Scanner(System.in);

        while (!flag) {
            System.out.print("Введите 1) Добавление номера\n" +
                    "2) Вывод всего: ");
            oper = iScanner.nextInt();
            if (oper == 1) {


                System.out.print("Введите фамилию: ");
                surname = iScanner.next();
                System.out.print("Введите номер: ");
                number = iScanner.next();
                updateValue(db, surname, number);
            } else {
                System.out.println(db);
                flag = true;
//                break;
            }
        }
        iScanner.close();
    }
    public static void updateValue(Map<String, String> map, String key, String value) {
        if (map.containsKey(key)) {
            map.put(key, map.get(key) + ", " + value);
        } else {
            map.put(key, value);
        }
    }
}
