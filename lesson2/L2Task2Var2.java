package lesson2;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.File;

public class L2Task2Var2 {

    public static void main(String[] args) throws Exception {
        File file = new File("file1.txt");
        try {
            BufferedReader reader = new BufferedReader(new FileReader(file));
            String line;
            while ((line = reader.readLine()) != null) {
                line = line.replaceAll("\"", "");
                StringBuilder res = new StringBuilder();
                String[] parts = line.split(",");
                for (String part : parts) {
                    String[] word = part.split(":");
                    if (word[0].equalsIgnoreCase("Фамилия")) {
                        res.append("Студент ")
                                .append(word[1].replaceAll(",", ""))
                                .append(" ");
                    } else if (word[0].equals("оценка")) {
                        res.append("получил ")
                                .append(word[1].replaceAll(",", ""))
                                .append(" ");
                    } else if (word[0].equals("предмет")) {
                        res.append("по предмету ")
                                .append(word[1].replaceAll(",", ""))
                                .append(".");
                    }
                }
                System.out.println(res.toString());
            }

            reader.close();
        } catch (Exception e) {
            System.out.println("Ошибка");
        }
    }
}