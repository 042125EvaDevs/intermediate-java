package org.example;

// Library class - Main class that simulates borrowing books from the library
class Library {
    public static void main(String[] args) {

        // FictionBook and NonFictionBook inherit from the Book base class.
        Book fictionBook = new FictionBook("The Great Gatsby", "F. Scott Fitzgerald", "1234567890", "Personal Development");
        Book nonFictionBook = new NonFictionBook("The Let Them Theory", "Mel Robbins", "0987654321", "Personal Development");

        // Create a library member
        Member member = new Member("Andrew Knote", "M001");

        // Member borrowing both Fiction and NonFiction books
        member.borrowBook(fictionBook);   // Borrow a FictionBook
        member.borrowBook(nonFictionBook); // Borrow a NonFictionBook
    }
}
