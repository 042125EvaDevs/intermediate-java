# 📚 Library Management System - OOP Project

## Overview

This Java project is a fully functional **Library Management System** built using core **Object-Oriented Programming (OOP)** principles. It allows for managing books, members, and borrow/return operations with clear class design and real-world logic.

---

## 🧰 Features

- 📖 Add/remove different types of books (Fiction, Non-Fiction, Reference)
- 👥 Register library members
- 📚 Borrow and return books
- 📅 Track due dates and calculate late return fees
- 🔒 Proper encapsulation and abstraction of data and behavior

---

## 💡 OOP Concepts Applied

| OOP Principle   | Description |
|----------------|-------------|
| **Classes & Objects** | Classes like `Book`, `Library`, `Member` are used to create objects that represent real-world entities |
| **Encapsulation** | Private variables with getters/setters control data access inside classes |
| **Inheritance** | `Fiction`, `NonFiction`, and `Reference` extend the abstract class `Book` |
| **Polymorphism** | Each book type overrides `borrowBook()` and `getBorrowDays()` differently |
| **Abstraction** | Abstract class `Book` and interface `Borrowable` define a blueprint for functionality |

---

## 📁 Project Structure

EnhancedLibrarySystem/
├── abstracts/
│ └── Book.java
├── books/
│ ├── Fiction.java
│ ├── NonFiction.java
│ └── Reference.java
├── interfaces/
│ └── Borrowable.java
├── management/
│ ├── Library.java
│ └── Member.java
├── util/
│ └── DateUtil.java
├── Main.java
└── README.md



---

## ▶️ How to Run

### 1. Compile
Make sure you're inside the root project directory, then run:

```bash
javac abstract/*.java books/*.java interfaces/*.java management/*.java util/*.java Main.java

2. Run
java Main

📝 Sample Output
Added book: The Hobbit
Added book: Educated
Added book: Oxford Dictionary
Registered member: Elsha Fantaye

Library Catalog:
- The Hobbit by J.R.R. Tolkien | Available: true
- Educated by Tara Westover | Available: true
- Oxford Dictionary by Oxford Press | Available: true

Borrowed fiction: The Hobbit
Reference books cannot be borrowed!
Books borrowed by Elsha Fantaye:
- The Hobbit (Due: 2025-06-02)

Returning book and checking fine:
Returned book: The Hobbit
Late fee: $0.0



