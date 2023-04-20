package lesson1;

// 2.	Вывести все простые числа от 1 до 1000
public class L1Task2 {
    public static void main(String[] args) {
        for (int x = 1; x <= 1000; x++) {
            int counter = 0;
            for (int i = 2; i < x / 2; i++) {
                if (x % i == 0) {
                    counter += 1;
                }
                if (counter > 0) {
                    break;
                }
            }
            if (counter == 0) {
                System.out.printf("%d ", x);
            }
        }
    }
}
