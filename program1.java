/**
 * program1
 */
import java.util.Scanner;
public class program1 {

    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.printf("int a: ");
        int a = iScanner.nextInt();

        System.out.printf("%d", a);
        iScanner.close();
    }
}
