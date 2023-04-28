package lesson4;
//        Реализуйте очередь с помощью LinkedList со следующими методами:
//        enqueue() - помещает элемент в конец очереди,
//        dequeue() - возвращает первый элемент из очереди и удаляет его,
//        first() - возвращает первый элемент из очереди, не удаляя.

import java.util.Deque;
import java.util.Random;
import java.util.LinkedList;

public class L4Task2 {
    public static void main(String args[]) {
        Deque<Integer> list1 = new <Integer>LinkedList();
        Random rd = new Random(0);

        for (int i = 0; i < 10; i++) {
            list1.add(rd.nextInt(10, 90));

        }
        System.out.println(list1);
        enqueue(list1, 6);
        System.out.print(list1);
        System.out.println();
        System.out.print(dequeue(list1));
        System.out.println();
        System.out.println(list1);
        System.out.print(first(list1));
        System.out.println();
        System.out.println(list1);

    }

    public static Deque<Integer> enqueue(Deque<Integer> list, int el) {
        list.add(el);
        return list;
    }

    public static int dequeue(Deque<Integer> list) {
        int a = list.removeFirst();
        return a;
    }

    public static int first(Deque<Integer> list) {
        return list.peekFirst();
    }
}


