package Sem6;


import java.util.ArrayList;
import java.util.Scanner;
import java.util.Set;
import java.util.Stack;

    public class Sem6Task4 {
        public static void main(String[] args){
            // Cat barsic = new Cat;
            // barsic.name = "KOT";
            // barsic.age = "12";
            ArrayList <Cat> kototeka = new ArrayList<>();
            Cat barsic  = new Cat("Barsik", 3, "saf");
            Cat cat2  = new Cat("Barsik2", 4);
            kototeka.add(cat2);
            kototeka.add(barsic);
            System.out.println(kototeka);
            // for (Cat cats : kototeka) {
            //     cats.print_visit()
            // }
            // cat2.visit()
            // cat2.print_visit()
            barsic.golos();
        }
    }
