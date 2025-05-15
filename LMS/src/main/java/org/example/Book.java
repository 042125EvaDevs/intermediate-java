// Book class (Parent class) - Represents a generic Book in the library
// The Book class contains common attributes and methods for all book types
class Book {
    private String title;  // Title of the book
    private String author; // Author of the book
    private String isbn;   // ISBN number of the book

    // Constructor to initialize a new Book
    public Book(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
    }

    // Getter and Setter methods for encapsulation (Access control for private fields)
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    // Method to display the details of the book
    public void displayBookInfo() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("ISBN: " + isbn);
    }
}