package com.bookCollection;
import java.util.Iterator;
import java.util.List;

public class BookIterator implements Iterator<Book> {
    private final List<Book> books;
    private int position = 0;

    public BookIterator(List<Book> books) {
        this.books = books;
    }
    // Method checks whether they are more books or objects in the collection that haven't been iterated over yet
    @Override
    public boolean hasNext() {
        return position < books.size(); // Stops when we reached all the books
    }
    // Method retrieves the next book or object in the collection and 
    // increments the position so that the iteration progresses.
    @Override
    public Book next() {
        return books.get(position++);
    }
}
