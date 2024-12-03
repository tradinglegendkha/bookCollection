package com.bookCollection;
import org.junit.Test;
import static org.junit.Assert.*;
import java.util.Iterator;

public class BookCollectionTest {
    // This verifies that books can be correctly added to the collection and iterated over.
    @Test
    public void testBookAdditionAndIteration() {
        BookCollection collection = new BookCollection();
        collection.addBook(new Book("Book A", "Author A"));
        collection.addBook(new Book("Book B", "Author B"));

        Iterator<Book> iterator = collection.getIterator();
        // Verifies that there is still another book to return after "Book A".
        assertTrue(iterator.hasNext());
        // Retrieves the next book and confirms that its title is "Book B".
        assertEquals("Book A", iterator.next().getTitle());
        assertTrue(iterator.hasNext()); 
        assertEquals("Book B", iterator.next().getTitle());
        // Ensures that there are no more books left in the collection
        assertFalse(iterator.hasNext());
    }
}
