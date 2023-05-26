package lesson5;
// Отсортировать по количеству вхождения имени в базу от большего к меньшему
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
//{
//        ArrayList<String> originNames = new ArrayList<>(Arrays.asList("Иван Иванов",
//        "Светлана Петрова",
//        "Кристина Белова",
//        "Анна Мусина",
//        "Анна Крутова",
//        "Иван Юрин",
//        "Петр Лыков",
//        "Павел Чернов",
//        "Петр Чернышов",
//        "Мария Федорова",
//        "Марина Светлова",
//        "Мария Савина",
//        "Мария Рыкова",
//        "Марина Лугова",
//        "Анна Владимирова",
//        "Иван Мечников",
//        "Петр Петин",
//        "Иван Ежов"));
//    HashMap<String, Integer> firstNameCount = new HashMap<>();
//
//    Iterator<String> iter = originNames.iterator();
//        while (iter.hasNext()) {
//                String fullName = iter.next();
//                String[] name = fullName.split(" ");
//
//
//                if (firstNameCount.get(name[0]) == null) {
//                firstNameCount.put(name[0], 1);
//                } else {
//                firstNameCount.put(name[0], firstNameCount.get(name[0]) + 1);
//                }
//
//
//                }
//
//
//                while (firstNameCount.size() > 0) {
//                Iterator<String> it = firstNameCount.keySet().iterator();
//        int maxCount = Collections.max(firstNameCount.values());
//        while (it.hasNext()) {
//        String current = it.next();
//        if (firstNameCount.get(current).equals(maxCount)) {
//        System.out.println(current + " " + maxCount);
//        it.remove();
//        }
//        }
//        }
