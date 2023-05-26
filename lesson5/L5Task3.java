package lesson5;

public class L5Task3 {

    //    На шахматной доске расставить 8 ферзей так, чтобы они не били друг друга. И вывести Доску!
    //    Пример вывода доски 8x8

//            0x000000
//            0000x000


    public static void main(String[] args) {
        int[] queenArray = new int[8];
        for (int i = 0; i < 8; i++) {
            findPosition(i, queenArray);

            // Вывод доски в консоль
            for (int row = 0; row < 8; row++) {
                for (int col = 0; col < 8; col++) {
                    if (queenArray[row] == col) {
                        System.out.print("x");
                    } else {
                        System.out.print("0");
                    }
                }
                System.out.println();
            }
            System.out.println();
        }
    }


    private static boolean findPosition(int row, int[] ArrayOfQueens) {
        if (row == 8) { // Если удалось расставить всех 8 ферзей, вернуть true
            return true;
        }
        for (int col = 0; col < 8; col++) {
            boolean flag = true; // Позиция безопасна
            for (int i = 0; i < row; i++) {
                // Проверка на наличие конфликта по вертикали, диагонали и антидиагонали
                if (ArrayOfQueens[i] == col || ArrayOfQueens[i] == col - row + i || ArrayOfQueens[i] == col + row - i) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                ArrayOfQueens[row] = col; // Позиция ферзя сохраняется в массив
                if (findPosition(row + 1, ArrayOfQueens)) { // Рекурсивный вызов для следующего ряда
                    return true;
                }
            }
        }
        return false;
    }
}

