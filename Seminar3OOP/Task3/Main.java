package Seminar3OOP.Task3;

public class Main {
    public static void main(String[] args) {
        I_Func function_1 = (m) -> {
            int result = 1;
            m = m < 0 ? -m : m;

//            if (m<0){
//                m=-m;
//            }
//            else m=m;


            for (int i = 2; i <= m; i++) {
                if ((m % i) == 0) {
                    result = i;
                    break;
                }

            }
            return result;
        };
        System.out.printf("Наименьшим делителем 12 является %s\n", function_1.func(12));
        System.out.printf("Наименьшим делителем 11 является %s", function_1.func(11));
    }
}
