package EXCEPTIONS.Seminar3.DZ3;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.print("Введите разделенные пробелом:Фамилия Имя Отчество дата_рождения номер_телефона пол(f/m):\n ");
        boolean flag = false;
        while (!flag) {
            String user = iScanner.nextLine();
            String[] words = user.split(" ");
            if (words.length == 6) {

                try {
                    String surname = words[0];
                    String name = words[1];
                    String fartherName = words[2];
                    String date = getDate(words[3]);
                    long number = getNumber(words[4]);
                    String telephoneNumber = Long.toString(number);
                    String sex;
                    if (words[5].equals("f") || words[5].equals("m")) {
                        sex = words[5];
                    } else throw new MyException("Формат введенного пола неверен, повторите ввод");
                    // System.out.printf("<%s> <%s> <%s> <%s> <%s> <%s>", surname, name, fartherName, date, telephoneNumber, sex);
                    String result = "<" + surname + ">" + " <" + name + "> " + "<" + fartherName + "> " + "<" + date + "> " + "<" + telephoneNumber + "> " + "<" + sex + ">" + "\n";
                    String filePath = surname + ".txt";
                    writeFile(filePath, result);
                } catch (MyException ex) {
                    ex.printStackTrace();
                } finally {
                    flag = true;
                    iScanner.close();
                }


            }
            // код ошибки? КОД ОШИБКИ ТЕКСТОМ
            else if (words.length < 6) System.out.println("Ввод неверный. Вы ввели меньше слов, чем надо. " +
                    "Введите 6 блоков(слов), разделенных пробелами");
            else System.out.println("Ввод неверный. Вы ввели больше слов, чем надо." +
                        " Введите 6 блоков(слов), разделенных пробелами");
        }
    }

    private static String getDate(String s) throws MyException {
        boolean b;
        b = s.matches("(0[1-9]|[1 2][0-9]|3[01])[.](0[1-9]|1[0-2])[.](19[0-9][0-9]|20[0-9][0-9])");
        if (b) {
            return s;
        } else throw new MyException("Формат введенной даты неверен, повторите ввод");
    }

    private static Long getNumber(String s) throws MyException {
        long number = 0;
        try {
            number = Long.parseLong(s);
        } catch (MyException ex) {
            System.out.print("""
                    Вы ввели номер телефона не в том формате.\s
                     Номер_телефона - целое беззнаковое число без форматирования, повторите ввод
                    """);
        }
        return number;
    }

    private static void writeFile(String filePath, String values) {
        File file = new File(filePath);
        try (FileWriter writer = new FileWriter(file, true)) { // FileWriter writer потом закроется

            writer.write(values + "\n");
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}



