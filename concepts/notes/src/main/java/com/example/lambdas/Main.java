package com.example.lambdas;

import com.example.collections.Student;

import java.util.*;
import java.util.function.Predicate;

public class Main {

  public static void main(String[] args) {

    Predicate<Student> isAdult = (student) -> student.getAge() >= 18;


    Collection<Student> students = Student.initializeStudents();



    List<Student> adultStudents = students.stream().filter(isAdult).toList();

    System.out.println("adultStudents: " + adultStudents);

//    Double averageAdultGrade = adultStudents.stream()
//      .collect(StudentGpaCollector.averageGpa());

  }
}
