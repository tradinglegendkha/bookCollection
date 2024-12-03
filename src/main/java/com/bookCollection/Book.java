package com.bookCollection;
import java.util.Objects;

public class Book {
    private String title;
    private String author;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }
    // Getters
    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    // Checks if two books are the same, if they are the same return true. If not false
    // Ensuring we are comparing books not based off their memory references but by their content
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Book book = (Book) obj;
        return Objects.equals(title, book.title) && Objects.equals(author, book.author);
    }
    // If its true then they must have the same hash code, but it doesn't always mean they are always equal
    @Override
    public int hashCode() {
        return Objects.hash(title, author);
    }
}
