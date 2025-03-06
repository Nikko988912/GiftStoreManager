package Generic;

public class Main {
    public static void main(String[] args) {
        // Библиотека бумажных книг
        Library<PaperBook> paperLibrary = new Library<>();
        paperLibrary.addBook(new PaperBook("War and Peace", "Leo Tolstoy", 1225));
        paperLibrary.addBook(new PaperBook("1984", "George Orwell", 328));
        paperLibrary.listBooks();

        // Библиотека электронных книг
        Library<EBook> eLibrary = new Library<>();
        eLibrary.addBook(new EBook("Clean Code", "Robert C. Martin", 2.5));
        eLibrary.addBook(new EBook("The Pragmatic Programmer", "Andrew Hunt", 3.1));
        eLibrary.listBooks(); // Вывод всех книг

        // Поиск и удаление книги
        EBook foundBook = eLibrary.findBook("Clean Code");
        if (foundBook != null) {
            System.out.println("\nBook found: " + foundBook.getDescription());
        } else {
            System.out.println("\nBook not found.");
        }

        eLibrary.removeBook("Clean Code"); // Удаляем книгу
        eLibrary.listBooks(); // Выводим оставшиеся книги
    }
}