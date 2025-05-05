# 📘 Concepts + Practice

This guide is designed to help you learn through the development of a project.
Each concept is explained clearly and followed by targeted practice challenges and mini-projects.

---

[//]: # 'concepts-start'


##  [Exception Handling](notes/src/main/java/com/example/exceptionhandling/Main.java):

Exception handling in Java helps manage runtime errors, ensuring the program
can recover and continue running. 

It uses keywords like `try`, `catch`, `finally`, `throw`, and `throws` 
to handle errors gracefully. Mastering exception handling is key to 
building robust and fault-tolerant applications.

### Concepts

- **What is an Exception?**  
  An exception disrupts the normal flow of execution. Java exceptions are categorized into `Checked` (compile-time) and `Unchecked` (runtime).

- **Checked vs. Unchecked Exceptions**
  - **Checked**: Must be explicitly handled (e.g., `IOException`).
  - **Unchecked**: Occur during runtime and don't require explicit handling (e.g., `NullPointerException`).

- **try, catch, finally Blocks**
  - `try`: Code that may throw an exception.
  - `catch`: Catches and handles the exception.
  - `finally`: Always executes, regardless of an exception.

- **throw Keyword**  
  Explicitly throws an exception, typically for custom errors.

- **throws Keyword**  
  Declares that a method may throw an exception, passing the responsibility to the calling method.

- **Custom Exception Handling**  
  Create custom exceptions by extending `Exception` or `RuntimeException`.

- **Exception Hierarchy**  
  `Throwable` is the root class for all errors and exceptions.

- **Best Practices**
  - Catch specific exceptions.
  - Avoid empty `catch` blocks.
  - Use `finally` for resource management.

### Practice

1. **Basic try-catch Block**  
   Divide two numbers and handle any arithmetic exceptions (e.g., division by zero).

2. **Handling Multiple Exceptions**  
   Handle both `ArithmeticException` and `NullPointerException` using multiple `catch` blocks.

3. **Using the finally Block**  
   Open and close a file using `finally` to ensure it is always closed.

4. **Throwing Custom Exceptions**  
   Create a `InvalidAgeException` and throw it for ages under 18.

5. **Method Declaration with throws**  
   Declare a method that throws `FileNotFoundException`.

6. **Nested try-catch Blocks**  
   Handle multiple exceptions using nested `try-catch` blocks.

7. **Handling Multiple Exceptions with Multi-catch**  
   Use multi-catch to handle both `ArrayIndexOutOfBoundsException` and `NumberFormatException`.

8. **Best Practices**  
   Refactor code to follow best practices in exception handling.


---

[//]: # 'concepts-end'

---

## [Collections Framework]()

The Collections Framework in Java provides a set of classes and 
interfaces for working with groups of objects. It includes a variety 
of data structures like lists, sets, queues, and maps, which are 
essential for storing and manipulating data efficiently. 

Understanding the Collections Framework helps in choosing the right
data structure for different scenarios.

### Concepts

- **Collection Interface**  
  The root interface of the collections hierarchy, representing a group of objects. The main sub-interfaces are `List`, `Set`, and `Queue`.

- **List Interface**  
  An ordered collection that allows duplicate elements. Common implementations include `ArrayList`, `LinkedList`, and `Vector`.

- **Set Interface**  
  A collection that doesn't allow duplicate elements. Common implementations include `HashSet`, `LinkedHashSet`, and `TreeSet`.

- **Queue Interface**  
  A collection designed for holding elements in a FIFO (First In, First Out) order. Common implementations include `LinkedList` and `PriorityQueue`.

- **Map Interface**  
  A collection that stores key-value pairs. Common implementations include `HashMap`, `TreeMap`, and `LinkedHashMap`.

- **Iterator Interface**  
  Provides a way to iterate over elements in a collection. The `hasNext()`, `next()`, and `remove()` methods are key to its functionality.

- **Generics in Collections**  
  Java collections are generic, meaning they can store objects of any type, making them more type-safe and flexible.

- **Common Methods in Collections**
  - `add()`, `remove()`, `contains()`, `size()`, `clear()`, and `isEmpty()` are commonly used methods across different collection types.

- **Sorting Collections**  
  Collections can be sorted using `Collections.sort()` for lists or by using the `Comparator` interface.

- **Concurrent Collections**  
  Specialized collections that are thread-safe, such as `CopyOnWriteArrayList` and `ConcurrentHashMap`.

### Practice

1. **List Operations**  
   Create an `ArrayList` and perform basic operations: add, remove, and access elements by index.

2. **Set Operations**  
   Create a `HashSet` and perform operations like checking for duplicates, adding, and removing elements.

3. **Queue Operations**  
   Implement a `LinkedList` as a queue and simulate enqueue and dequeue operations.

4. **Map Operations**  
   Create a `HashMap` to store key-value pairs and demonstrate basic operations like adding, removing, and accessing elements by key.

5. **Using Iterator**  
   Use an `Iterator` to traverse through a `List` and remove elements conditionally.

6. **Sorting a List**  
   Create a `List` of integers, sort it in ascending and descending order, and display the results.

7. **Thread-safe Collections**  
   Implement a `ConcurrentHashMap` and demonstrate thread-safe operations like adding and removing entries in a multi-threaded environment.

8. **Custom Sorting with Comparator**  
   Create a custom class and sort a `List` of objects using a `Comparator` based on specific fields.

9. **List vs Set**  
   Compare the behavior of `List` and `Set` with examples that highlight duplicates, order, and performance.



# 🧩 Mini Challenges

[//]: # 'challenges-start'


## Challenge: [Exception Handling](./challenge/src/main/java/com/example/exceptionhandling/Main.java):

### [Goal](challenge/src/main/java/com/example/exceptionhandling/Calculator.java):
Create a set of custom exceptions (e.g., `InvalidInputException`, `OperationFailedException`)
and implement them in a calculator application. 

### Goal:
Develop a file reader application that reads data from a file and processes it. 
Implement the try-with-resources statement to ensure that file streams are closed
automatically, highlighting proper resource management

---

## Challenge: [Collections Framework](./challenge/src/main/java/com/example/collections/Main.java):

### Goal:
Design a system to manage student records using HashMap to store student IDs 
and their corresponding details. 
Implement functionalities to add, update, delete, and retrieve records.

### Goal:
Develop a file reader application that reads data from a file and processes it. 
Implement the try-with-resources statement to ensure that file streams are closed
automatically.


---

[//]: # 'challenges-end'

---

✅ **Tip:** Tackle each section during a Sprint to align learning with development goals.
