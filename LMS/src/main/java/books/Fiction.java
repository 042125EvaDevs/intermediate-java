package books;

import abstracts.Book;
import java.time.LocalDate;

/**
 * Represents a Fiction book that inherits from the abstract Book class.
 *
 * OOP Concepts Demonstrated:
 * - **Inheritance**: Inherits common properties and methods from Book.
 * - **Polymorphism**: Overrides borrowBook and getBorrowDays to define
 *   borrowing behavior specific to fiction books.
 * - **Encapsulation**: Utilizes inherited private fields with getters/setters.
 */
public class Fiction extends Book {

    /**
     * Constructor to initialize a Fiction book with title, author, and ISBN.
     *
     * @param title  The title of the fiction book.
     * @param author The author of the fiction book.
     * @param isbn   The ISBN identifier.
     */
    public Fiction(String title, String author, String isbn) {
        super(title, author, isbn);
    }

    /**
     * Allows borrowing of Fiction books.
     * Marks the book as unavailable and sets the due date 14 days from today.
     */
    @Override
    public void borrowBook() {
        System.out.println("Borrowed fiction: " + getTitle());
        setAvailable(false);
        setDueDate(LocalDate.now().plusDays(getBorrowDays()));
    }

    /**
     * Returns the number of days this book can be borrowed.
     * Fiction books can be borrowed for 14 days.
     *
     * @return 14 days borrowing period.
     */
    @Override
    public int getBorrowDays() {
        return 14;
    }
}
