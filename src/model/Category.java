package model;

import java.util.ArrayList;
import java.util.List;

public class Category {
    private String categoryName;
    private List<Book> books = new ArrayList<>();

    public Category(String categoryName) {
        this.categoryName = categoryName;
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public List<Book> getBooks() {
        return books;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }
}
