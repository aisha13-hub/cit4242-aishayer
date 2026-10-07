package org.example;

import java.util.List;

public class Catalogue {
    private final BookSource bookSource;

    public Catalogue(BookSource bookSource) {
        this.bookSource = bookSource;
    }

    public List<Book> getBooks() {
        return bookSource.load();
    }

    public List<String> titlesBy(String author) {
        return getBooks().stream()
                .filter(b -> b.author().equals(author))
                .map(Book::title)
                .sorted()
                .toList();
    }
}