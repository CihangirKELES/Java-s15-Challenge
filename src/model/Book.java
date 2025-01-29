package model;

public class Book {
    private int id;
    private String title;
    private Author author;
    private double price;
    private String category;
    private boolean isAvailable = true;

    public Book(Author author, String category, int id, boolean isAvailable, double price, String title) {
        this.author = author;
        this.category = category;
        this.id = id;
        this.isAvailable = isAvailable;
        this.price = price;
        this.title = title;
    }

    public Book(int i, String javaProgramming, String johnDoe, String technology, boolean b) {
    }

    public Author getAuthor() {
        return author;
    }

    public String getCategory() {
        return category;
    }

    public int getId() {
        return id;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public double getPrice() {
        return price;
    }

    public String getTitle() {
        return title;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
