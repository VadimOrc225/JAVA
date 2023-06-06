package Seminar3OOP.Task7;


import static java.lang.Double.valueOf;

public class Main {

        public static void main(String[] args) {
        Function1<Integer,String> test_1= x->String.valueOf(x)+" долларов";

        System.out.println(test_1.apply(5));
            Function1<Integer,Double> test_2 = x->valueOf(x*x);

            System.out.println(test_2.apply(8));
    }

}
