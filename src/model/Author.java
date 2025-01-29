package model;

import java.util.ArrayList;
import java.util.List;

public class Author {
    private String name;
    private List<Book> books = new ArrayList<>();

    public Author(String name) {
        this.name = name;
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public List<Book> getBooks() {
        return books;
    }

    public String getName() {
        return name;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean equalsIgnoreCase(String authorName) {
        return this.name.equalsIgnoreCase(authorName);
    }
}

