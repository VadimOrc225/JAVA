package Seminar3OOP.Task6;

import java.util.function.UnaryOperator;

public class Main {
    public static void main(String[] args) {
        UnaryOperator<Integer> numTest_1 = x -> x * x;
        UnaryOperator<Double> numTest_2 = x -> x + x;


        System.out.println(numTest_1.apply(5));
        System.out.println(numTest_2.apply(5.0));
    }
}

