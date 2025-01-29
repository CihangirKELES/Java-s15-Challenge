package main;


import model.Book;
import model.Category;
import model.Librarian;
import model.Reader;
import service.BorrowService;
import service.LibraryService;


public class LibrarySystemApp {
    public static void main(String[] args) {

        //sistemi baslat
        LibraryService libraryService = new LibraryService();
        BorrowService borrowService = new BorrowService();

        //categoryleri olustur
        Category technologyCategory = new Category("Theatre");
        Category educationCategory = new Category("Education");

        //calisan ve okuyucu olusturma
        Librarian librarian = new Librarian("Ays", "ays@example.com", "6525353254");
        Reader reader = new Reader("ayas", "ayas@example.com", "6705213327") {
        };

        //kitaplari olustur
        Book book1 = new Book(1, "A Midsummer Night's Dreams", "William Shakespeare", "Theatre", true);
        Book book2 = new Book(2, "The Boy, the Mole, the Fox and the Horse", "Charlie Mackesy", "Graphic Novel", true);
        Book book3 = new Book(3, "Algorithms", "Robert Sedgewick, Kevin Wayne", "Education", true);


        //calisan kitap ekledi
        librarian.addBook(new Book(4, "Advanced Java", "Michael Brown", "Technology", true), libraryService);

        //okuyucu odunc aliyor
        reader.borrowBook(book1);
        borrowService.borrowBook(reader, book1);

        //2.kitabi odunc almaya calisiyor
        reader.borrowBook(book2);
        borrowService.borrowBook(reader, book2);

        //kitap iade
        reader.returnBook(book1);
        borrowService.returnBook(reader, book1);

        //kitap arama
        Book foundBook = libraryService.findBookById(2);
        if (foundBook != null) {
            System.out.println("Kitap bulundu: " + foundBook.getTitle());
        } else {
            System.out.println("Kitap bulunamadı.");
        }
        //category listele
        System.out.println("Tiyatro kategorisindeki kitaplar:");
        libraryService.getBooksByCategory("Theatre").forEach(book ->
                System.out.println(book.getTitle())
        );

        System.out.println("William Shakespeare'in kitapları:");
        libraryService.getBooksByAuthor("William Shakespeare").forEach(book ->
                System.out.println(book.getTitle())
        );

    }
}