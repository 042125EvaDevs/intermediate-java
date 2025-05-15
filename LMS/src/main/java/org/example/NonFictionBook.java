package org.example;

// NonFictionBook class (Subclass of Book - Inheritance) - Represents a Non-Fiction book
// NonFictionBook has an additional attribute "subject" to categorize the book type (e.g., History, Science)
class NonFictionBook extends Book {
    private String subject; // Subject of the non-fiction book

    // Constructor to initialize a new NonFictionBook
    public NonFictionBook(String title, String author, String isbn, String subject) {
        super(title, author, isbn); // Call the parent class constructor
        this.subject = subject;
    }

    // Getter and Setter for subject (Encapsulation)
    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    // Polymorphism: Display the details of NonFictionBook and subject
    @Override
    public void displayBookInfo() {
        super.displayBookInfo(); // Call the parent class method
        System.out.println("Subject: " + subject); // Display additional attribute for NonFictionBook
    }

    // Borrow behavior for NonFictionBook (Polymorphism)
    // This method demonstrates how borrowing a NonFictionBook behaves differently from other books
    public void borrowBook() {
        System.out.println("Non-fiction book borrowed.");
    }
}