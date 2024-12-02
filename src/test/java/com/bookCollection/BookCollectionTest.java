package com.bookCollection;
import org.junit.Test;
import static org.junit.Assert.*;
import java.util.Iterator;

public class BookCollectionTest {
    @Test
    public void testBookAdditionAndIteration() {
        BookCollection collection = new BookCollection();
        collection.addBook(new Book("Book A", "Author A"));
        collection.addBook(new Book("Book B", "Author B"));

        Iterator<Book> iterator = collection.getIterator();
        assertTrue(iterator.hasNext());
        assertEquals("Book A", iterator.next().getTitle());
        assertTrue(iterator.hasNext());
        assertEquals("Book B", iterator.next().getTitle());
        assertFalse(iterator.hasNext());
    }
}
