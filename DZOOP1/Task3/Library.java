package DZOOP1.Task3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Library {


    private ArrayList<Book> catalog = new ArrayList<>();

    public void addBook(Book b) {
        catalog.add(b);
        b.setAvailabilityTrue(); // Заменили сеттер на метод интерфейса
    }

    public void displayAvailableBooks() {
        for (Book book : catalog) {
            if (book.isAvailability()) book.displayInfo();
        }
    }

    public void removeBook(Book b) {
        for (Book book : catalog) {
            if (book.getTitle().equals(b.getTitle()) && book.getAuthor().equals(b.getAuthor())) {
                catalog.remove(b);

            }
        }
    }

    public void searchByAuthor(String author) {
        for (Book book : catalog) {
            if (book.getAuthor().equals(author)) book.displayInfo();
        }

    }
    /*
    В третьем варианте вам нужно написать функцию, которая принимает список объектов и компаратор для сортировки
    объектов по заданному критерию. Вы должны возвращать отсортированный список объектов.
    Это может быть реализовано, например, с использованием метода Collections.sort() и переданного компаратора.
     */
    public ArrayList<Book> getCatalog() {
        return catalog;
    }

    public ArrayList<Book> sortingCatalog(ArrayList<Book> catalog, Comparator<Book> f) {

        Collections.sort(catalog, f);
        return catalog;
    }
}