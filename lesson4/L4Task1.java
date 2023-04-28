package lesson4;

import java.util.Deque;
import java.util.LinkedList;

//1) Пусть дан LinkedList с несколькими элементами. Реализуйте метод(не void),
//        который вернет “перевернутый” список.
public class L4Task1 {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        for (int i = 0; i < 10; i++) {
            list.add(i);
        }
        System.out.println(list);
        System.out.println(reversed(list));
    }

    public static Deque<Integer> reversed(LinkedList<Integer> listRef) {
        Deque<Integer> resultList = new LinkedList<>();
        while (listRef.size() > 0) {
            resultList.push(listRef.pop());
        }
        return resultList;
    }
}
