package books;

import abstracts.Book;

/**
 * Represents a Reference book, which inherits from the abstract Book class.
 *
 * OOP Concepts Demonstrated:
 * - **Inheritance**: Extends the Book superclass to inherit common properties.
 * - **Polymorphism**: Overrides the borrowBook and getBorrowDays methods to
 *   define specific behavior for Reference books (cannot be borrowed).
 * - **Encapsulation**: Uses inherited private fields and public getters/setters
 *   from Book.
 */
public class Reference extends Book {

    /**
     * Constructor to initialize Reference book with title, author, and ISBN.
     *
     * @param title  The title of the reference book.
     * @param author The author of the reference book.
     * @param isbn   The ISBN number.
     */
    public Reference(String title, String author, String isbn) {
        super(title, author, isbn);
    }

    /**
     * Overrides the borrowBook method to disallow borrowing of reference books.
     */
    @Override
    public void borrowBook() {
        System.out.println("Reference books cannot be borrowed!");
    }

    /**
     * Overrides getBorrowDays to return 0 since reference books can't be borrowed.
     *
     * @return 0 indicating no borrowing period.
     */
    @Override
    public int getBorrowDays() {
        return 0;
    }
}
