package EXCEPTIONS.Seminar2;

import java.util.Arrays;

public class MyFirst {
    public static void main(String[] args) {
        int[] a = {};
        int[] b = {};

        if (args.length == 0) {
            // При отправке кода на Выполнение, вы можете варьировать эти параметры
            a = new int[]{4, 6, 6};
            b = new int[]{1, 2, 3};
        }

        else{
            a = Arrays.stream(args[0].split(", ")).mapToInt(Integer::parseInt).toArray();
            b = Arrays.stream(args[1].split(", ")).mapToInt(Integer::parseInt).toArray();
        }

        Answer ans = new Answer();
        String itresume_res = Arrays.toString(ans.subArrays(a, b));
        System.out.println(itresume_res);
    }
}
class Answer {
    public int[] subArrays(int[] a, int[] b){
        // Введите свое решение ниже
        int[] c = {};

        if(a.length == b.length){
            c = new int[a.length];
            for(int x=0;x<a.length;x++){
                try{ c[x] = a[x]/ b[x];}
                catch(ArithmeticException e){
                    System.out.printf("Элемент %x массива имеет значение 0. на 0 не делим", x);}
            }

        }
        else{c = new int[]{0};}
        return c;


    }
}