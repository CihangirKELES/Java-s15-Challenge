package service;

import model.Book;

import java.util.ArrayList;
import java.util.List;

public class BookService {
    private List<Book> books = new ArrayList<>();

    //kitap ekleme
    public void addBook(Book book) {
        books.add(book);
    }

    //id'ye gore arama
    public Book findBookById(int id) {
        return books.stream()
                .filter(book -> book.getId() == id)
                .findFirst()
                .orElse(null);
    }

    //kitap sil
    public void deleteBook(Book book) {
        books.remove(book);
    }

    //kategoriye gore guncelle
    public List<Book> getBooksByCategory(String category) {
        return books.stream()
                .filter(book -> book.getCategory().equalsIgnoreCase(category))
                .toList();
    }

    //yazara gore guncelle
    public List<Book> getBooksByAuthor(String authorName) {
        return books.stream()
                .filter(book -> book.getAuthor().equalsIgnoreCase(authorName))
                .toList();
    }


    //kitabi guncelle
    public void updateBook(Book updatedBook) {
        books.stream()
                .filter(book -> book.getId() == updatedBook.getId())
                .findFirst()
                .ifPresent(book -> books.set(books.indexOf(book), updatedBook));
    }
}
