package service;

import model.Book;
import model.BorrowRecord;

import java.io.Reader;
import java.util.ArrayList;
import java.util.List;

public class BorrowService {
    private final List<BorrowRecord> borrowRecords = new ArrayList<>();

    //odunc alma islemi
    public void borrowBook(Reader reader, Book book) {
        //kitap odunc alindi, yeni kayit olusturulsun
        BorrowRecord record = new BorrowRecord(reader, book);
        borrowRecords.add(record);
    }

    //iade islemi icin
    public void returnBook(Reader reader, Book book) {
        //odunckayitlarina bakildi
        BorrowRecord recordToRemove = null;
        for (BorrowRecord record : borrowRecords) {
            if (record.getReader().equals(reader) && record.getBook().equals(book)) {
                recordToRemove = record;
                break; //eslesildi, kayit bulundu
            }
        }

        //silindi veya bulunduysa güncelle
        if (recordToRemove != null) {
            borrowRecords.remove(recordToRemove);//sistemden silindi
            System.out.println("Kitap başarıyla iade edildi.");
        } else {
            System.out.println("Ödünç alınan kitap bulunamadı.");
        }
    }

    public void borrowBook(model.Reader reader, Book book1) {
    }

    public void returnBook(model.Reader reader, Book book1) {
    }
}