package org.karasev.tech;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

public class Library {
    private final Map<Integer, Book> books = new HashMap<>();
    private int idCounter = 1;

    public Book add(String title, String author) {
        Book book = new Book(idCounter++, title, author);
        books.put(book.getId(), book);

        return book;
    }

    public List<Book> findAllBooks() {
        return new ArrayList<>(books.values());
    }

    public Optional<Book> findById(int id) {
        return Optional.ofNullable(books.get(id));
    }

    public boolean delete(int id) {
        return books.remove(id) != null;
    }

}
