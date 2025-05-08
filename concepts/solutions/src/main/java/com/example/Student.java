package com.example;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Student implements Comparator<Student> {

    private String name;
    private double gpa;
    private List<Student> listOfStudents;


    public Student(String name, double gpa) {
        this.name = name;
        this.gpa = gpa;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    public List<Student> addStudent(){
        Student john = new Student("John", 3.6);
        Student kim = new Student("Kim", 3.8);
        Student tony = new Student("Tony", 2.5);
        Student rachel = new Student("Rachel", 4.0);
        listOfStudents.add(john);
        listOfStudents.add(kim);
        listOfStudents.add(tony);
        listOfStudents.add(rachel);


        List<Student> topThree = listOfStudents.stream().sorted().collect(Collectors.toList());
        return topThree;
    }


    @Override
    public int compare(Student o1, Student o2) {


        Integer nameComparison = o1.getName().compareTo(o2.getName());
        Integer gpaComparison = Double.compare(o1.getGpa(), o2.getGpa());
        return Integer.compare(nameComparison, gpaComparison);
    }
}
