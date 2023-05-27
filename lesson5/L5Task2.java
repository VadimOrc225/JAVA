package lesson5;
// Отсортировать по количеству вхождения имени в базу от большего к меньшему при вхождении >1 раза
import java.util.*;

public class L5Task2 {
    public static void main(String[] args) {
        Map<String, String> db = new HashMap<>();
        Map<String, Integer> dbFinal = new HashMap<>();
        LinkedHashMap<String, Integer> sortedDbFinal = new LinkedHashMap<>();

        ArrayList<String> originNames = new ArrayList<>();
        ArrayList<Integer> numbers = new ArrayList<>();
        db.put("Иванов", "Иван");
        db.put("Петрова", "Светлана");
        db.put("Белова", "Кристина");
        db.put("Мусина", "Анна");
        db.put("Крутова", "Анна");
        db.put("Юрин", "Иван");
        db.put("Лыков", "Петр");
        db.put("Чернов", "Павел");
        db.put("Чернышов", "Петр");
        db.put("Федорова", "Мария");
        db.put("Светлова", "Марина");
        db.put("Савина", "Мария");
        db.put("Рыкова", "Мария");
        db.put("Лугова", "Марина");
        db.put("Владимирова", "Анна");
        db.put("Мечников", "Иван");
        db.put("Петин", "Петр");
        db.put("Ежов", "Иван");
        for (var item : db.entrySet()) {
            int counter = 0;
            for (var x : db.entrySet()) {
                if (x.getValue().equals(item.getValue())) {
                    counter = counter + 1;
                }

            }
            if (counter > 1) {
                dbFinal.put(item.getValue(), counter);
            }

        }
        System.out.println(dbFinal); //печать без сортировки


        for (int item = db.size() - 1; item >= 0; item--) {
            if (dbFinal.containsValue(item)) {
                for (var x : dbFinal.entrySet()) {
                    if (x.getValue() == item) {

                        sortedDbFinal.put(x.getKey(), item);
                    }

                }

            }
        }
        System.out.println(sortedDbFinal);
    }
}
