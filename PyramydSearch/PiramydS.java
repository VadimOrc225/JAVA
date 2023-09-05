package PyramydSearch;

public class PiramydS {
    public static void main(String[] args) {
        int[] array = new int[]{
                4, 2, 1, 4, 8, 2, 7, 0, 4, 5, 7, 7, 2, 9, 9, 1
        };
        sort1(array);
        for (int i = 0; i < array.length; i++)
            System.out.print(array[i] + " ");
    }

    public static void sort1(int[] array) {
        // постоение кучи (перегруппируем массив)
        for (int i = array.length / 2 - 1; i >= 0; i--)
            heapify(array, array.length, i);
        // ОДин за другим извлекаем элементы из кучи
        for (int i = array.length - 1; i >= 0; i--) {
            // Перемещаем текущий корень в конец
            int temp = array[0];
            array[0] = array[i];
            array[i] = temp;
            // Вызываем процедуру heapify на уменьшенной куче
            heapify(array, i, 0);
        }
    }

    private static void heapify(int[] array, int heapSize, int rootIndex) {
        int largest = rootIndex; // инициализируем корень наибольшим элементом
        int leftChild = 2 * rootIndex + 1; // левый = 2*rootIndex + 1
        int rightChild = 2 * rootIndex + 2; // правый = 2*rootIndex + 2

        // Если левый дочерний элемент больше корня
        if (leftChild < heapSize && array[leftChild] > array[largest])
            largest = leftChild;

        // Если правый дочерний элемент больше, чем самый большой элемент на данный момент
        if (rightChild < heapSize && array[rightChild] > array[largest])
            largest = rightChild;

        // Если самый большой элемент не корень
        if (largest != rootIndex) {
            int temp = array[rootIndex];
            array[rootIndex] = array[largest];
            array[largest] = temp;


            // рекурсивно преобразуем в кучу затронутое поддерево
            heapify(array, heapSize, largest);
        }
    }
}
