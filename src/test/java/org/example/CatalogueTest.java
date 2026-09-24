package org.example;

import org.junit.jupiter.api.Test;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

public class CatalogueTest {

    @Test
    void testCatalogueWithInMemorySource() {
        BookSource inMemorySource = new InMemoryBookSource();
        Catalogue catalogue = new Catalogue(inMemorySource);

        List<Book> books = catalogue.getBooks();
        assertEquals(3, books.size());
    }
}
