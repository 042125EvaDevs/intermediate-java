package com.example.collections.challenge1;

public class Challenge {

    public static void main(String[] args)  {

      /**
       * Design a system to manage student records using `HashMap` to store student IDs and their
       * corresponding details.
       *
       * Implement functionalities to add, update, delete, and retrieve records.
       */

      StudentRecords records = new StudentRecords();

      long firstStudentId = 1L;
      String firstStudentName = "John";

      Student firstStudent = new Student(firstStudentId, firstStudentName);


      try {
        records.add(firstStudent);
      } catch (InvalidStudentException e) {
        throw new RuntimeException(e);
      }

      Student retrieved = records.retrieve(firstStudentId);

      boolean isSameStudent = retrieved.equals(firstStudent);

      System.out.println("isSameStudent = " + isSameStudent);


    }
}
