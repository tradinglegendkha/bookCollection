package com.bookCollection;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class BookCollection {
    private final List<Book> books = new ArrayList<>();

    public void addBook(Book book) {
        books.add(book);
    }

    public void removeBook(Book book) {
        books.remove(book);
    }

    public Iterator<Book> getIterator() {
        return new BookIterator(books);
    }
}
