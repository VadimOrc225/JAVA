package DZOOP1.Task3;

public class Book {
    private String title;
    private String author;
    private boolean availability;

    public Book(String title, String author, boolean availability) {
        this.title = title;
        this.author = author;
        this.availability = availability;
    }
    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setAvailability(boolean availability) {
        this.availability = availability;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public boolean isAvailability() {
        return availability;
    }

    public void displayInfo() {
        System.out.printf("Название: %s, Автор: %s. %s \n", getTitle(), getAuthor(), availability ? "Книга доступна." :
                "Книга не доступна.");
    }


}
