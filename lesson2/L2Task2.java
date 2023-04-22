package lesson2;


import java.io.File;
import java.io.FileReader;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


public class L2Task2 {
    static Map<String, String> data = new HashMap<>();

    static String find(String word) {
        String out = data.get(word);
        if (out == null)
            return "не найдено";
        else
            return out;
    }

    public static void parcer(String n) {

        String[] replics = n.split("!");
        String key1 = "фамилия";
        String key2 = "оценка";
        String key3 = "предмет";
        for (String x : replics) {
            x.replaceAll(":", ", ");
            System.out.printf("Студент %s получил %s по предмету %s", find(key1), find(key2), find(key3));
            System.out.println();
        }

    }

    public static void main(String[] args) throws Exception {

        StringBuilder res1 = new StringBuilder();

        File file = new File("file1.txt");
        try {
            FileReader fReader = new FileReader(file);
            Scanner scan = new Scanner(fReader);
            while (scan.hasNextLine()) {
                res1.append(scan.nextLine());
                res1.append("!");
            }

                fReader.close();
            }


           catch (Exception e) {
            System.out.println("Ошибка");
        }
        parcer(String.valueOf(res1));
    }
}
