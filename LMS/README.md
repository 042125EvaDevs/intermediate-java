# 📚 Library Management System (LMS)

## Overview

The **Library Management System** is a simple Java-based console application designed to demonstrate core **Object-Oriented Programming (OOP)** principles such as:

- ✅ **Classes and Objects**
- 🔁 **Inheritance**
- 🎭 **Polymorphism**
- 🔒 **Encapsulation**
- 🔍 **Abstraction**

This system allows **library members** to borrow books, with different behaviors for **Fiction** and **Non-Fiction** books.

---

## 🛠️ Features

- Manage general book information (title, author, ISBN)
- Handle specialized book types:
    - 📖 **Fiction books** (e.g., genre-based)
    - 📘 **Non-fiction books** (e.g., subject-based)
- Borrow books with behavior specific to book type
- Maintain member information and borrowing actions

---

## 🧩 OOP Concepts Implemented

| Concept        | Description |
|----------------|-------------|
| **Class & Object** | Used to create `Book`, `Member`, and book types |
| **Inheritance** | `FictionBook` and `NonFictionBook` inherit from `Book` |
| **Polymorphism** | Borrowing behavior changes depending on book type |
| **Encapsulation** | All class fields are private with getters/setters |
| **Abstraction** | Borrow behavior abstracted via method overriding |

---

## 📂 Project Structure

LibraryManagementSystem/
│
├── Book.java # Base class for all book types
├── FictionBook.java # Subclass of Book, adds 'genre'
├── NonFictionBook.java # Subclass of Book, adds 'subject'
├── Member.java # Represents a library member
└── Library.java # Main class to run the program


---

## ▶️ How to Run

1. Ensure you have **Java 8+** installed.
2. Compile the files:

   ```bash
   javac *.java

3. Run the program:
   java Library

🧪 Sample Output

John Doe is borrowing the book:
Title: The Great Gatsby
Author: F. Scott Fitzgerald
ISBN: 1234567890
Genre: Personal Development
Fiction book borrowed.

John Doe is borrowing the book:
Title: The Let Them Theory
Author: Mel Robbins
ISBN: 0987654321
Subject: Personal Development
Non-fiction book borrowed.
