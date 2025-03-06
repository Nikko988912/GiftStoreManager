package Generic;

abstract class Book {
    protected String title;
    protected String author;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    // Абстрактный метод для получения описания книги
    public abstract String getDescription();

    public String getTitle() {
        return title;
    }
}