package abstracts;

import java.time.LocalDate;

/**
 * Abstract base class representing a generic Book.
 *
 * OOP Concepts Demonstrated:
 * - **Abstraction**: Defines common properties and abstract methods
 *   that concrete book types must implement, hiding implementation details.
 * - **Encapsulation**: Uses private fields with public getters/setters
 *   to protect and control access to the book's state.
 * - **Inheritance**: Serves as the superclass for specialized book types
 *   like Fiction, NonFiction, and Reference.
 * - **Polymorphism**: Enables subclasses to provide specific implementations
 *   of borrowing behavior via abstract methods.
 */
public abstract class Book {

    // Encapsulated fields representing book details
    private final String title;
    private final String author;
    private final String isbn;
    private boolean isAvailable = true;  // Book availability status
    private LocalDate dueDate;            // Due date if the book is borrowed

    /**
     * Constructor to initialize a Book with title, author, and ISBN.
     *
     * @param title  The title of the book
     * @param author The author of the book
     * @param isbn   The ISBN identifier
     */
    public Book(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
    }

    // Getter methods for encapsulated fields

    /**
     * @return The book's title.
     */
    public String getTitle() {
        return title;
    }

    /**
     * @return The book's author.
     */
    public String getAuthor() {
        return author;
    }

    /**
     * @return The book's ISBN.
     */
    public String getIsbn() {
        return isbn;
    }

    /**
     * @return true if the book is available for borrowing; false otherwise.
     */
    public boolean isAvailable() {
        return isAvailable;
    }

    /**
     * @return The due date of the borrowed book.
     */
    public LocalDate getDueDate() {
        return dueDate;
    }

    // Setter methods to update mutable properties

    /**
     * Set the availability status of the book.
     *
     * @param available true if book is available; false if borrowed.
     */
    public void setAvailable(boolean available) {
        this.isAvailable = available;
    }

    /**
     * Set the due date when the book is borrowed.
     *
     * @param dueDate The due date to be set.
     */
    public void setDueDate(LocalDate dueDate) {
        this.dueDate = dueDate;
    }

    /**
     * Abstract method forcing subclasses to implement how the book is borrowed.
     * Different book types can define their own borrowing rules.
     */
    public abstract void borrowBook();

    /**
     * Abstract method forcing subclasses to specify borrowing period in days.
     *
     * @return The number of days the book can be borrowed.
     */
    public abstract int getBorrowDays();
}
