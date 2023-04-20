// 1.	Вычислить n-ое треугольного число (сумма чисел от 1 до n),
// n! (произведение чисел от 1 до n)
package lesson1;
import java.util.Scanner;

public class L1Task1 {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.print("Введите n: ");
        int n = iScanner.nextInt();
        int sumVal = 0;
        int factVal = 1;
        for (int x = 1; x <= n; x++) {
            sumVal = sumVal + x;
            factVal = factVal * x;
        }
        System.out.printf("%d-угольное число %d", n, sumVal);
        System.out.println();
        System.out.printf("Факториал числа %d = %d", n, factVal);
        iScanner.close();
    }
}
