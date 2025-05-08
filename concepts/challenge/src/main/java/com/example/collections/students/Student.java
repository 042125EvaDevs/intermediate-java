package com.example.collections.students;

import com.example.exceptionhandling.generics.RepositoryEntity;

import java.util.Objects;

public class Student implements RepositoryEntity<Long> {

  private String name;
  private long id;

  public Student(long id,String name) {
    this.id = id;
    this.name = name;

  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Student student = (Student) o;
    return id == student.id && Objects.equals(name, student.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, id);
  }

  public String getName() {
    return name;
  }

  public Long getId() {
    return id;
  }

  public void setId(long id){
    this.id = id;
  }

  public void setName(String name){
    this.name = name;
  }

  @Override
  public String toString() {
    return "Student{" +
      "name='" + name + '\'' +
      ", id=" + id +
      '}';
  }
}

