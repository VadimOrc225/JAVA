package EXCEPTIONS.Seminar2;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    private static final String NUMBER_REGEX = "\\d+";
    private static final String FILE_PATH = "test.txt";

    public static void main(String[] args) {
        try {

            Map<String, String> peoples = readFile(FILE_PATH);
            for (Map.Entry<String, String> entry : peoples.entrySet()) {
                replaceUnknownValues(entry);
            }
            writeFile(FILE_PATH, peoples);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static Map<String, String> readFile(String file) throws FileNotFoundException {
        Scanner scanner = new Scanner(new File(file));
        Map<String, String> peoples = new HashMap<>();
        while (scanner.hasNext()) {
            String nextLine = scanner.next();
            String[] splitedStr = nextLine.split("=");
            peoples.put(splitedStr[0], splitedStr[1]);
        }
        return peoples;
    }

    private static void replaceUnknownValues(Map.Entry<String, String> entry) {
        if (!entry.getValue().matches(NUMBER_REGEX)) {
            entry.setValue(Integer.toString(entry.getKey().length()));
        }
    }

    private static void writeFile(String filePath, Map<String, String> values) {
        File file = new File(filePath);
        try (FileWriter writer = new FileWriter(file)) {
            for (Map.Entry<String, String> entry : values.entrySet()) {
                writer.write(entry.getKey() + "=" + entry.getValue()+"\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}