package books;

import abstracts.Book;
import java.time.LocalDate;

/**
 * Represents a Non-Fiction book that inherits from the abstract Book class.
 *
 * OOP Concepts Demonstrated:
 * - **Inheritance**: Extends Book to reuse common book properties and methods.
 * - **Polymorphism**: Overrides borrowBook and getBorrowDays to provide
 *   specific borrowing behavior for Non-Fiction books.
 * - **Encapsulation**: Uses inherited private fields with getters and setters.
 */
public class NonFiction extends Book {

    /**
     * Constructor to initialize a Non-Fiction book with title, author, and ISBN.
     *
     * @param title  The title of the book.
     * @param author The author of the book.
     * @param isbn   The ISBN identifier.
     */
    public NonFiction(String title, String author, String isbn) {
        super(title, author, isbn);
    }

    /**
     * Allows borrowing of Non-Fiction books.
     * Sets availability to false and assigns a due date 10 days from today.
     */
    @Override
    public void borrowBook() {
        System.out.println("Borrowed non-fiction: " + getTitle());
        setAvailable(false);
        setDueDate(LocalDate.now().plusDays(getBorrowDays()));
    }

    /**
     * Returns the number of days this book can be borrowed.
     * Non-Fiction books can be borrowed for 10 days.
     *
     * @return 10 days borrowing period.
     */
    @Override
    public int getBorrowDays() {
        return 10;
    }
}
