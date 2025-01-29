package model;
public class Reader extends User {
    private static final int MAX_BOOK_LIMIT = 1;

    public Reader(String name, String email, String phone) {
        super(name, email, phone);  //kalitim
    }

    //limit kontrol
    public boolean canBorrowBook() {
        return getBorrowedBooksCount() < MAX_BOOK_LIMIT;
    }

    //odunc alma
    public void borrowBook(Book book) {
        if (canBorrowBook() && book.isAvailable()) {
            super.borrowBook(book);
        } else {
            System.out.println("Ödünç kitap limiti aşıldı ya da kitap mevcut değil!");
        }
    }
}