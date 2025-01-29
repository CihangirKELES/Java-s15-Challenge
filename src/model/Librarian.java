package model;

import service.LibraryService;

import java.util.List;

public class Librarian extends User {

    public Librarian(String name, String email, String phone) {
        super(name, email, phone);
    }

    public void addBook(Book book, LibraryService libraryService) {
        libraryService.addBook(book);
    }

    public void removeBook(Book book, Category category) {
        category.getBooks().remove(book);
    }

  // kitap arama method
    public Book searchBookById(int id, List<Book> books) {
        return books.stream()
                .filter(book -> book.getId() == id)
                .findFirst()
                .orElse(null);//kitap bulunamadı null
    }

    public List<Book> searchBooksByAuthor(String authorName, List<Book> books) {
        return books.stream()
                .filter(book -> book.getAuthor().equalsIgnoreCase(authorName))
                .toList(); //sApi ile filtrelendi

        }
}