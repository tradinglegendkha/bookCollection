package com.bookCollection;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        // Create a new BookCollection
        BookCollection bookCollection = new BookCollection();

        // Add books to the collection
        bookCollection.addBook(new Book("The Great Gatsby", "F. Scott Fitzgerald"));
        bookCollection.addBook(new Book("To Kill a Mockingbird", "Harper Lee"));
        bookCollection.addBook(new Book("1984", "George Orwell"));
        bookCollection.addBook(new Book("Moby Dick", "Herman Melville"));

        // Get an iterator for the collection
        Iterator<Book> iterator = bookCollection.getIterator();

        // Iterate through the books and print their details
        System.out.println("Books in the collection:");
        while (iterator.hasNext()) {
            Book book = iterator.next();
            System.out.println("Title: " + book.getTitle() + ", Author: " + book.getAuthor());
        }

        // Remove a book and re-iterate
        System.out.println("\nRemoving '1984' from the collection...");
        bookCollection.removeBook(new Book("1984", "George Orwell")); // Matching based on equality

        iterator = bookCollection.getIterator(); // Refresh the iterator
        System.out.println("Books in the collection after removal:");
        while (iterator.hasNext()) {
            Book book = iterator.next();
            System.out.println("Title: " + book.getTitle() + ", Author: " + book.getAuthor());
        }
    }
}

