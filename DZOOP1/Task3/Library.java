package DZOOP1.Task3;

import java.util.ArrayList;

public class Library {


    private ArrayList<Book> catalog = new ArrayList<>();

    public void addBook(Book b) {
        catalog.add(b);
        b.setAvailability(true);
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
}
