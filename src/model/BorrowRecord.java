package model;

import java.io.Reader;
import java.time.LocalDate;

public class BorrowRecord {
    private Reader reader;
    private Book book;
    private LocalDate borrowDate;
    private LocalDate returnDate;

    public BorrowRecord(Book book, LocalDate borrowDate, Reader reader, LocalDate returnDate) {
        this.book = book;
        this.borrowDate = borrowDate;
        this.reader = reader;
        this.returnDate = returnDate;
    }

    public BorrowRecord(Reader reader, Book book) {
    }

    public Book getBook() {
        return book;
    }

    public LocalDate getBorrowDate() {
        return borrowDate;
    }

    public Reader getReader() {
        return reader;
    }

    public LocalDate getReturnDate() {
        return returnDate;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    public void setBorrowDate(LocalDate borrowDate) {
        this.borrowDate = borrowDate;
    }

    public void setReader(Reader reader) {
        this.reader = reader;
    }

    public void setReturnDate(LocalDate returnDate) {
        this.returnDate = returnDate;
    }
}
