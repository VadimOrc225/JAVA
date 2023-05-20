package Sem5;
/*Создать структуру для хранения Номеров паспортов и Фамилий сотрудников организации.
        123456 Иванов
        321456 Васильев
        234561 Петрова
        234432 Иванов
        654321 Петрова
        345678 Иванов
        Вывести данные по сотрудникам с фамилией Иванов.

 */
import java.util.*;

public class Sem5Task1 {
    public static void main(String[] args) {
        Map<Integer, String> db = new HashMap<>();
        db.put(123456, "Иванов");
        db.put(321456, "Васильев");
        db.put(234561, "Петрова");
        db.put(234432, "Иванов");
        db.put(654321, "Петрова");
        db.put(345678, "Иванов");
        System.out.println(db);

        for (var item : db.entrySet()) {
            if (item.getValue().equals("Иванов")) {
                System.out.printf("[%d: %s]\n", item.getKey(), item.getValue());
            }
        }
    }
}