package lesson1;
import java.util.Scanner;
public class L1Task4 {

//: +Задано уравнение вида q + w = e, q, w, e >= 0.
//        Некоторые цифры могут быть заменены знаком вопроса, например, 2? + ?5 = 69.
//        Требуется восстановить выражение до верного равенства.
//        Предложить хотя бы одно решение или сообщить, что его нет.
//        Под знаками вопросов - одна и та же цифра Ввод: 2? + ?5 = 69 Вывод: 24 + 45 = 69


    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.print("Введите выражение вида q + w = e: ");
        String equation = iScanner.nextLine();
        String[] words = equation.split(" ");
        String[] res = new String[3];
        int counter = 0;
        for (String word : words) {
            if (word.equals("+") || word.equals("=")) {
                continue;
            }

            res[counter] = word;
            counter = counter + 1;
        }

        boolean flag1 = true;
        for (int x = 0; x <= 9; x++) {
            String[] res1 = new String[2];
            res1[0] = res[0].replaceFirst("\\?", String.valueOf(x));
            res1[1] = res[1].replaceFirst("\\?", String.valueOf(x));
            int a = Integer.parseInt(res1[0]);
            int b = Integer.parseInt(res1[1]);
            int c = Integer.parseInt(res[2]);
            if (a + b == c) {
                System.out.printf("%d + %d = %d", a, b, c);
                flag1 = false;
            }

        }
        if (flag1) {
            System.out.print("Решений нет");
        }
    }
}
