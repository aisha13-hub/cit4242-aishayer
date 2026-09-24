package org.example;

public record Book(String title, String author, int pages) {

    public boolean isLong() {
        return pages > 400;
    }
}
