package com.example.collections;

import java.util.*;

public class Student implements Comparator<Student> {

  private String name;

  private int grade;

  private int age;

  public Student(String name, int grade, int age) {
    this.name = name;
    this.grade = grade;
    this.age = age;
  }

  public static void main(String[] args) {
    Collection<Student> students = initializeStudents();

    System.out.println(String.format("There are %d students: ", students.size(), students));
  }

  public static Collection<Student> initializeStudents() {
    Set<Student> students = new HashSet<>();

    students.add(new Student("a", 12, 18));
    students.add(new Student("b", 9, 13));
    students.add(new Student("c", 11, 15));
    students.add(new Student("d", 11, 15));
    students.add(new Student("d", 11, 15));
    students.add(new Student("d", 11, 15));
    students.add(new Student("d", 11, 15));
    students.add(new Student("d", 11, 15));
    students.add(new Student("d", 11, 15));
    students.add(new Student("d", 11, 15));
    students.add(new Student("e", 10, 17));
    students.add(new Student("f", 8, 14));

    return  students;
  }

  /**
   * Compares its two arguments for order.  Returns a negative integer,
   * zero, or a positive integer as the first argument is less than, equal
   * to, or greater than the second.<p>
   * <p>
   * The implementor must ensure that {@link Integer#signum
   * signum}{@code (compare(x, y)) == -signum(compare(y, x))} for
   * all {@code x} and {@code y}.  (This implies that {@code
   * compare(x, y)} must throw an exception if and only if {@code
   * compare(y, x)} throws an exception.)<p>
   * <p>
   * The implementor must also ensure that the relation is transitive:
   * {@code ((compare(x, y)>0) && (compare(y, z)>0))} implies
   * {@code compare(x, z)>0}.<p>
   * <p>
   * Finally, the implementor must ensure that {@code compare(x,
   * y)==0} implies that {@code signum(compare(x,
   * z))==signum(compare(y, z))} for all {@code z}.
   *
   * @param o1 the first object to be compared.
   * @param o2 the second object to be compared.
   * @return a negative integer, zero, or a positive integer as the
   * first argument is less than, equal to, or greater than the
   * second.
   * @throws NullPointerException if an argument is null and this
   *                              comparator does not permit null arguments
   * @throws ClassCastException   if the arguments' types prevent them from
   *                              being compared by this comparator.
   * @apiNote It is generally the case, but <i>not</i> strictly required that
   * {@code (compare(x, y)==0) == (x.equals(y))}.  Generally speaking,
   * any comparator that violates this condition should clearly indicate
   * this fact.  The recommended language is "Note: this comparator
   * imposes orderings that are inconsistent with equals."
   */
  @Override
  public int compare(Student o1, Student o2) {
    int gradeComparison = Integer.compare(o1.grade, o2.grade);
    int ageComparison = Integer.compare(o1.age, o2.age);

    return Integer.compare(gradeComparison, ageComparison);
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Student student = (Student) o;
    return grade == student.grade && age == student.age;
  }

  @Override
  public int hashCode() {
    return Objects.hash(grade, age);
  }

  @Override
  public String toString() {
    return "Student{" +
      "name='" + name + '\'' +
      ", grade=" + grade +
      ", age=" + age +
      '}';
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getGrade() {
    return grade;
  }

  public void setGrade(int grade) {
    this.grade = grade;
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }
}
