import abstracts.Book;
import books.Fiction;
import books.NonFiction;
import books.Reference;
import management.Library;
import management.Member;
import util.DateUtil;

/**
 * Main class to run and test the Library Management System.
 *
 * Demonstrates:
 * - Creation of book objects from different subclasses of Book (polymorphism and inheritance).
 * - Adding books to the library.
 * - Registering a member and performing borrowing/returning actions.
 * - Using the utility class to calculate late fees.
 *
 * OOP Concepts Demonstrated:
 * - Classes and Objects: Instantiation of Library, Book, Member.
 * - Inheritance & Polymorphism: Book subclasses (Fiction, NonFiction, Reference).
 * - Encapsulation: Using public methods to interact with private member/book data.
 * - Abstraction: Abstract Book class and separation of utility functions.
 */
public class Main {

    public static void main(String[] args) {
        // Create the library instance
        Library library = new Library();

        // Create different types of books (polymorphism + inheritance)
        Book f1 = new Fiction("The Hobbit", "J.R.R. Tolkien", "123");
        Book nf1 = new NonFiction("Educated", "Tara Westover", "456");
        Book ref1 = new Reference("Oxford Dictionary", "Oxford Press", "789");

        // Add books to the library collection
        library.addBook(f1);
        library.addBook(nf1);
        library.addBook(ref1);

        // Register a new library member
        Member elsha = new Member("Elsha Fantaye", "M001");
        library.registerMember(elsha);

        // Display the library catalog
        library.showAllBooks();

        // Member tries to borrow a fiction book and a reference book
        elsha.borrow(f1);           // Successful
        elsha.borrow(ref1);         // Should fail (reference books can't be borrowed)

        // Display all currently borrowed books
        elsha.showBorrowedBooks();

        // Simulate book return and calculate fine
        System.out.println("\nReturning book and checking fine:");
        elsha.returnBook(f1);

        // Use the DateUtil class to calculate a fine (if any)
        double fine = DateUtil.calculateFine(f1.getDueDate());
        System.out.println("Late fee: $" + fine);
    }
}
