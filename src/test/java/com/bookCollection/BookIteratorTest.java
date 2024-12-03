package com.bookCollection;
import org.junit.Test;
import static org.junit.Assert.*;

public class BookIteratorTest {
    @Test
    public void testIteratorFunctionality() {
        BookCollection collection = new BookCollection();
        collection.addBook(new Book("Test Book", "Author"));
        BookIterator iterator = (BookIterator) collection.getIterator();

        // Verifies that the iterator initially points to a valid book in the collection.
        assertTrue(iterator.hasNext());
        // Retrieves the next book, and make sure its the right book with the right title.
        assertEquals("Test Book", iterator.next().getTitle());
    }
}
