package Generic;

import java.util.ArrayList;
import java.util.List;


class Library<T extends Book> {
    private List<T> books = new ArrayList<>();

    // Добавление книги в библиотеку
    public void addBook(T book) {
        books.add(book);
        System.out.println(book.getTitle() + " has been added to the library.");
    }

    // Удаление книги по названию
    public boolean removeBook(String title) {
        for (T book : books) {
            if (book.getTitle().equalsIgnoreCase(title)) {
                books.remove(book);
                System.out.println(title + " has been removed from the library.");
                return true;
            }
        }
        System.out.println("Book " + title + " not found.");
        return false;
    }

    // Поиск книги по названию
    public T findBook(String title) {
        for (T book : books) {
            if (book.getTitle().equalsIgnoreCase(title)) {
                return book;
            }
        }
        return null;
    }

    // Вывод списка книг
    public void listBooks() {
        if (books.isEmpty()) {
            System.out.println("The library is empty.");
        } else {
            System.out.println("\nList of books in the library:");
            for (T book : books) {
                System.out.println(book.getDescription());
            }
        }
    }
}


