package interfaces;

import abstracts.Book;
import java.time.LocalDate;

/**
 * The Borrowable interface defines the contract for any entity (e.g., Member)
 * that can borrow and return books.
 *
 * OOP Concepts Demonstrated:
 * - **Abstraction**: Hides the borrowing logic details; only declares required behaviors.
 * - **Polymorphism**: Different classes (like Member) can implement this interface
 *   in their own way, allowing flexible and extendable code.
 */
public interface Borrowable {

    /**
     * Borrow a book from the library.
     *
     * @param book The book to borrow.
     */
    void borrow(Book book);

    /**
     * Return a previously borrowed book to the library.
     *
     * @param book The book to return.
     */
    void returnBook(Book book);
}
