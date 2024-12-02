package com.bookCollection;

import org.junit.Test;
import static org.junit.Assert.*;

public class BookIteratorTest {
    @Test
    public void testIteratorFunctionality() {
        BookCollection collection = new BookCollection();
        collection.addBook(new Book("Test Book", "Author"));
        BookIterator iterator = (BookIterator) collection.getIterator();

        assertTrue(iterator.hasNext());
        assertEquals("Test Book", iterator.next().getTitle());
    }
}
