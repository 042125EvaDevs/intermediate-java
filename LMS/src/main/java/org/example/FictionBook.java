package org.example;

// FictionBook class (Subclass of Book - Inheritance) - Represents a Fiction book
// FictionBook has an additional attribute "genre" that distinguishes it from other book types
class FictionBook extends Book {
    private String genre; // Genre of the fiction book (e.g., Mystery, Drama)

    // Constructor to initialize a new FictionBook
    public FictionBook(String title, String author, String isbn, String genre) {
        super(title, author, isbn); // Call the parent class constructor
        this.genre = genre;
    }

    // Getter and Setter for genre (Encapsulation)
    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    // Polymorphism: Display the details of FictionBook and genre
    @Override
    public void displayBookInfo() {
        super.displayBookInfo(); // Call the parent class method
        System.out.println("Genre: " + genre); // Display additional attribute for FictionBook
    }

    // Borrow behavior for FictionBook (Polymorphism)
    // This method demonstrates how borrowing a FictionBook behaves differently from other books
    public void borrowBook() {
        System.out.println("Fiction book borrowed.");
    }
}