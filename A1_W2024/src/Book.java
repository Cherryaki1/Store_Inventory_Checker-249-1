public class Book {

    // Attributes:

    private String title;
    private String author;
    private long ISBN;
    private double price;

    // Constructors:

    public Book() {
        this.title = "";
        this.author = "";
        this.ISBN = 0;
        this.price = 0.0;
    }

    public Book(String title, String author, long ISBN, double price) {
        this.title = title;
        this.author = author;
        this.ISBN = ISBN;
        this.price = price;
    }

    // Getters:

    public String getTitle() {
        return this.title;
    }

    public String getAuthor() {
        return this.author;
    }

    public long getISBN() {
        return this.ISBN;
    }

    public double getPrice() {
        return this.price;
    }

    // Setters:

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author; 
    }

    public void setISBN(long ISBN) {
        this.ISBN = ISBN;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    
    
}
