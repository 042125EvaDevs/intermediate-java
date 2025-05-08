package com.example.builderpattern;

import java.util.ArrayList;
import java.util.List;

public class Student {

  private final String name;
  private  Integer age;
  private  List<Integer> grades;

  public static void main(String[] args) {
    Student student = new StudentBuilder("John")
      .grades(List.of(95, 100))
      .build();

    Student.builder("Ashley")
      .build();
  }

  public static StudentBuilder builder(String name) {
    return new StudentBuilder(name);
  }

  public Student(String name, String age, List<Integer> grades) {
    this.name = name;
    this.age = age;
    this.grades = grades;
  }

  public static class StudentBuilder {

    private final String name;
    private  Integer age;
    private  List<Integer> grades;

    public StudentBuilder(String name) {
      this.name = name;
      this.age = 1;
      this.grades = new ArrayList<>();
    }

    public Student build() {
      return new Student(
        this.name,
        this.age,
        this.grades
      );

      return null;
    }


    public StudentBuilder name(String name) {
      this.name = name;
      return this;
    }

    public StudentBuilder age(Integer age) {
      this.age = age;
      return this;
    }

  }
}
