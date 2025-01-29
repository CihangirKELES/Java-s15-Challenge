package service;
import model.Book;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class LibraryService {
    private List<Book> books = new ArrayList<>();

    public void addBook(Book book) {
        books.add(book);
    }

    public Book findBookById(int id) {
        for (Book book : books) {
            if (book.getId() == id) { //idye gore arama
                return book;
            }
        }
        return null; //kitap bulunamazsa null
    }

    public void deleteBook(Book book) {
        books.remove(book);
    }

    //categorye gore kitap getirme
    public List<Book> getBooksByCategory(String category) {
        return books.stream()
                .filter(book -> book.getCategory().equalsIgnoreCase(category)) //kontrol
                .collect(Collectors.toList()); //listele
    }

    //yazara gore kitap getirme
    public List<Book> getBooksByAuthor(String authorName) {
        return books.stream()
                .filter(book -> book.getAuthor().equalsIgnoreCase(authorName)) //kontrol
                .collect(Collectors.toList()); //listele
    }
}

