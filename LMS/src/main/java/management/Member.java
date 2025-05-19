package management;

import abstracts.Book;

import java.util.ArrayList;
import java.util.List;

/**
 * Represents a library member who can borrow and return books.
 *
 * OOP Concepts Demonstrated:
 * - **Encapsulation**: Private fields with public getter methods.
 * - **Abstraction**: Implements the Borrowable interface.
 * - **Polymorphism**: Uses the Book superclass to work with different book types.
 * - **Single Responsibility**: Handles only member-related logic.
 */
public class Member implements Borrowable {

    // Private fields for encapsulation
    private String name;
    private String memberId;
    private List<Book> borrowedBooks = new ArrayList<>();

    /**
     * Constructor to initialize a Member with a name and ID.
     *
     * @param name     Member's name.
     * @param memberId Unique ID for the member.
     */
    public Member(String name, String memberId) {
        this.name = name;
        this.memberId = memberId;
    }

    /**
     * Gets the name of the member.
     *
     * @return Name of the member.
     */
    public String getName() {
        return name;
    }

    /**
     * Allows the member to borrow a book if it's available.
     *
     * @param book The book to be borrowed.
     */
    @Override
    public void borrow(Book book) {
        if (book.isAvailable()) {
            book.borrowBook();  // Changes the book's availability and sets due date
            borrowedBooks.add(book);
        } else {
            System.out.println(book.getTitle() + " is already borrowed.");
        }
    }

    /**
     * Allows the member to return a book.
     *
     * @param book The book to be returned.
     */
    @Override
    public void returnBook(Book book) {
        if (borrowedBooks.contains(book)) {
            book.setAvailable(true);
            borrowedBooks.remove(book);
            System.out.println("Returned book: " + book.getTitle());
        } else {
            System.out.println("You didn't borrow this book.");
        }
    }

    /**
     * Displays the list of books borrowed by the member along with due dates.
     */
    public void showBorrowedBooks() {
        System.out.println("Books borrowed by " + name + ":");
        for (Book b : borrowedBooks) {
            System.out.println("- " + b.getTitle() + " (Due: " + b.getDueDate() + ")");
        }
    }
}
