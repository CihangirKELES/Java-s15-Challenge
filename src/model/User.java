package model;

public abstract class User {
    private String name;
    private String email;
    private String phone;
    private int borrowedBooksCount = 0;
    private static final int MAX_BORROW_LIMIT = 1;

    public User(String name, String email, String phone) {
    }

    //ödünç al
    public void borrowBook(Book book) {
        if (borrowedBooksCount < MAX_BORROW_LIMIT && book.isAvailable()) {
            borrowedBooksCount++;
            book.setAvailable(false);
        } else {
            System.out.println("Bu kitap ödünç alınamaz!");
        }
    }

    //iade
    public void returnBook(Book book) {
        borrowedBooksCount--;
        book.setAvailable(true);
    }

    public int getBorrowedBooksCount() {
        return borrowedBooksCount;
    }

    public String getEmail() {
        return email;
    }

    public String getName() {
        return name;
    }

    public String getPhone() {
        return phone;
    }

    public void setBorrowedBooksCount(int borrowedBooksCount) {
        this.borrowedBooksCount = borrowedBooksCount;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

}
