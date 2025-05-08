package com.example.collections.challenge1;

public class InvalidStudentException extends Exception {
  public InvalidStudentException(Student student) {
    super( "Invalid student: " + student.toString());
  }

  /**
   * Constructs a new exception with the specified detail message.  The
   * cause is not initialized, and may subsequently be initialized by
   * a call to {@link #initCause}.
   *
   * @param message the detail message. The detail message is saved for
   *                later retrieval by the {@link #getMessage()} method.
   */
  public InvalidStudentException(String message) {
    super(message);
  }
}
