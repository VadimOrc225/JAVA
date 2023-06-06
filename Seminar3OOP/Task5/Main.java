package Seminar3OOP.Task5;

import java.util.function.BinaryOperator;

public class Main {
    public static void main(String[] args) {
        BinaryOperator<Integer> numTest_1 = (w, e) -> (w / e);

        System.out.println(numTest_1.apply(12, 5));
        BinaryOperator<Integer> numTest_2 = (w, e) -> (w % e);
        System.out.println(numTest_2.apply(12, 5));
    }
}
