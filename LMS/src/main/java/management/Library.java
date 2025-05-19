package management;

import abstracts.Book;
import java.util.ArrayList;
import java.util.List;

/**
 * The Library class manages the collection of books and registered members.
 *
 * OOP Concepts Demonstrated:
 * - **Encapsulation**: Keeps book and member lists private and provides public methods for access.
 * - **Composition**: Uses objects of Book and Member classes within the Library.
 * - **Responsibility Delegation**: This class only handles library-level operations (single responsibility).
 */
public class Library {

    // Private lists for books and members (encapsulation)
    private List<Book> catalog = new ArrayList<>();
    private List<Member> members = new ArrayList<>();

    /**
     * Adds a book to the library's catalog.
     *
     * @param book The book to be added.
     */
    public void addBook(Book book) {
        catalog.add(book);
        System.out.println("Added book: " + book.getTitle());
    }

    /**
     * Removes a book from the catalog.
     *
     * @param book The book to be removed.
     */
    public void removeBook(Book book) {
        catalog.remove(book);
        System.out.println("Removed book: " + book.getTitle());
    }

    /**
     * Registers a new member with the library.
     *
     * @param member The member to be added.
     */
    public void registerMember(Member member) {
        members.add(member);
        System.out.println("Registered member: " + member.getName());
    }

    /**
     * Displays all books in the catalog with their availability status.
     */
    public void showAllBooks() {
        System.out.println("\nLibrary Catalog:");
        for (Book b : catalog) {
            System.out.println("- " + b.getTitle() + " by " + b.getAuthor() +
                    " | Available: " + b.isAvailable());
        }
    }
}
