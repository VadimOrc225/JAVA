package Sem2;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;

public class Sem4Task3 {
    public static void main(String[] args) {
//        1. Нужно сохранить text в связный список.
//        2. Если введено print~num, выводит строку из позиции num в связном списке и удаляет её из списка
//        Цикл пока не введено stop
        /*LinkedList<String> list = new LinkedList<>();
        Scanner sc = new Scanner(System.in);
        String line = "";
        String ind = "";
        int i = 0;

        boolean flag = false;
        while (!flag) {

            line = sc.nextLine();
            if (line.equals("stop")){flag = true;}
            else{
            if (line.length() > 5 && line.charAt(5) == '~') {
                ind = line.substring(6, line.length());
                i = Integer.parseInt(ind);
                System.out.println(list.get(i - 1));
                list.remove(i - 1);
                System.out.println(list);
            } else {
                list.add(line);
                System.out.println(list);
            }
        }}
        sc.close();
        */
//        1. Принимает от пользователя и “запоминает” строки.
//        2. Если введено print, выводит строки так,
//        чтобы последняя введенная была первой в списке, а первая - последней.
//                asd      qwe         zxc
//        print
//                zxc        qwe                asd

                System.out.print("\033[H\033[2J");
                Scanner sc = new Scanner(System.in);
                Deque<String> list = new LinkedList<>();

                boolean stop = false;
                String line = "";
                while (!stop) {
                    line = sc.nextLine();
                    if (line.equals("stop")) {
                        stop = true;
                    } else {
                        if (line.equals("print")) {
                            while (list.size() > 0) {
                                System.out.println(list.pop());
                            }
                        } else {
                            list.push(line);
                        }
                    }

                }
                sc.close();
            }
        }
