package DZOOP1.Task3;
/*
Задача 3 - по желанию, для тех кто уже проходил ООП, чтобы было не скучно.:
Реализуйте систему управления библиотекой. Создайте классы "Книга" (Book) и "Библиотека" (Library) со следующими свойствами и методами:

Класс "Книга" (Book):

Приватные поля "название" (title) и "автор" (author) типа String для хранения названия и автора книги соответственно.
Приватное поле "доступность" (available) типа boolean для указания доступности книги.
Публичные методы доступа (геттеры и сеттеры) для полей "название" и "автор".
Публичные методы доступа (геттеры и сеттеры) для поля "доступность".
Публичный метод "показать информацию" (displayInfo), который выводит на консоль информацию о книге (название, автор, доступность).
Класс "Библиотека" (Library):

Приватное поле "каталог" (catalog) типа ArrayList<Book> для хранения списка книг в библиотеке.
Публичный метод "добавить книгу" (addBook), который принимает объект типа Book и добавляет его в каталог библиотеки.
Публичный метод "удалить книгу" (removeBook), который принимает объект типа Book и удаляет его из каталога библиотеки.
Публичный метод "показать доступные книги" (displayAvailableBooks), который выводит на консоль информацию о доступных книгах в библиотеке.
Публичный метод "поиск книги по автору" (searchByAuthor), который принимает имя автора в качестве параметра и выводит на консоль
информацию о книгах данного автора, находящихся в каталоге библиотеки.
*/

import java.util.Collections;
import java.util.Comparator;

public class Dz1Task3 {
    public static void main(String[] args) {
        Book b1 = new Book("Красная шапочка", "Шарль Перро", true); // без библиотеки
        Book b2 = new Book("Бременские музыканты", "Братья Гримм", false); // без библиотеки
        b1.displayInfo(); // без библиотеки
        b2.displayInfo(); // без библиотеки
        System.out.println("-------------");
        Library library1 = new Library(); // c библиотекой
        library1.addBook(new Book("Три мушкетера", "Дюма", true));
        library1.addBook(new Book("Двадцать лет спустя", "Дюма")); // применяется метод интерфейса в методе addBook
        library1.addBook(new Book("Руслан и Людмила", "Пушкин"));
        library1.addBook(b1);
        library1.addBook(b2); // так как добавили false меняем на true

        library1.displayAvailableBooks();
        System.out.println("------------- Показываем доступные книги");
        library1.removeBook(new Book("Три мушкетера", "Дюма"));
        b1.setAvailabilityFalse(); // использование метода интерфейса - получаем false (Книга не доступна)
        b2.setAvailabilityFalse(); // использование метода интерфейса - получаем false (Книга не доступна) Читаель ВЗЯЛ

        b2.displayInfo();
        b1.displayInfo();
        System.out.println("------------- Результат после удаления книги 'Три мушкетера' и использования методов интерфейса" +
                " по установлению недоступности");
        library1.displayAvailableBooks();

        System.out.println("-----Компаратор------Сортировка по фамилии автора------");
        Comparator<Book> authorNameComparator = (n1, n2) -> (n1.getAuthor().compareTo(n2.getAuthor()));
        //вызываем функцию , принимающую на вход список книг библиотеки и компаратор
        // Вывод отсортированного списка
        for (Book ex : library1.sortingCatalog(library1.getCatalog(), authorNameComparator)) {
            System.out.println(ex.getAuthor() + " - " + ex.getTitle());
        }
    }
}