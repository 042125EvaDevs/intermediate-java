// Member class - Represents a library member who can borrow books
// A member has a name and a member ID, which are required to borrow books from the library
class Member {
    private String name;      // Name of the member
    private String memberId;  // Unique ID for the member

    // Constructor to initialize a new member
    public Member(String name, String memberId) {
        this.name = name;
        this.memberId = memberId;
    }

    // Getter and Setter for Member's details (Encapsulation)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMemberId() {
        return memberId;
    }

    public void setMemberId(String memberId) {
        this.memberId = memberId;
    }

    // Method that allows a member to borrow a book
    public void borrowBook(Book book) {
        System.out.println(name + " is borrowing the book:");
        book.displayBookInfo(); // Display book details
        if (book instanceof FictionBook) {
            // If the book is of type FictionBook, call the borrowBook method specific to FictionBook
            ((FictionBook) book).borrowBook();
        } else if (book instanceof NonFictionBook) {
            // If the book is of type NonFictionBook, call the borrowBook method specific to NonFictionBook
            ((NonFictionBook) book).borrowBook();
        }
    }
}