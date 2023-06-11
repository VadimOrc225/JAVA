package Seminar4OOP.Task4;

public class Sum {
    int Sum;

    <T extends Number>Sum(T a){
        Sum=0;
        for (int i = 0; i <=a.intValue(); i++) {
            Sum+=i;
        }

    }
    int getSum(){
        return Sum;
    }

}