package EXCEPTIONS.Seminar2.DZ2;

public class Task3 {
    public static void main(String[] args){  // не нужно throws Exception
        try {
            int a = 90;
            int b = 3;
            System.out.println(a / b);      //  Здесь можно конечно добавить  if(b!=0) , но b = 3
            printSum(23, 234);
            int[] abc = { 1, 2};
          //  abc[3] = 9;          Нельзя допускать такого от программиста

        } catch (IndexOutOfBoundsException ex) {      // но все же оставим только это исключение
            System.out.println("Массив выходит за пределы своего размера!");
        }
    }
    public static void printSum(Integer a, Integer b){  // не нужно throws FileNotFoundException
        System.out.println(a + b);
    }

}
