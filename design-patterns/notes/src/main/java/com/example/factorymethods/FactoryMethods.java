package com.example.factorymethods;

import com.example.builderpattern.Student;

import java.util.stream.Collectors;

public class FactoryMethods {



  public static void main(String[] args) {

    /**
     * Collectors factory methods
     */
//    Collectors

     Student john = Student.builder("John")
       .age(23)
      .build();

     Student ashley = new Student.StudentBuilder("Ashley")
       .build();
  }

  public static FactoryMethods getInstance() {
    return new FactoryMethods();

  }
}

