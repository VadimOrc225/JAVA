//Реализуйте алгоритм сортировки пузырьком числового массива (введён вами),
//        результат после каждой итерации запишите в лог-файл.
package lesson2;

import java.io.File;
import java.io.FileWriter;


public class L2Task1 {
    public static void main(String[] args) throws Exception {
        int[] arr = new int[]{8, 2, 3, 2, 1, 5, 2};
        int counter = 0;
        String fileName = "result.txt";
        File file = new File(fileName);
        FileWriter writer = new FileWriter(file, true);

        for (int i = 0; i < arr.length - 1; i++) {

            for (int x = counter; x < arr.length - 1; x++) {

                if (arr[x] > arr[x + 1]) {
                    int temp = arr[x];
                    arr[x] = arr[x + 1];
                    arr[x + 1] = temp;


                    for (int item : arr) {
                        try {
                            writer.write(Integer.toString(item));
                            writer.write(" ");


                        } catch (Exception e) {
                            System.out.println("Ошибка");
                        }
                    }
                    System.out.println("Записано");
                    writer.write("\n");

                }


            }


        }
        writer.close();

    }
}

