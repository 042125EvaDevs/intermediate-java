package com.example.collections.students;

import java.util.HashMap;

public class StudentRecords {

  final private HashMap<Long, Student> students = new HashMap<>();

  public void add(Student student) throws InvalidStudentException{
    student.setId(generateId());

    if (isValidStudent(student)) {

      /* Add student to students map */
      students.put(
        student.getId(),
        student
      );
    } else {
      throw new InvalidStudentException(student);
    }

  }

  private boolean isValidStudent(Student student) {
    boolean doesNotContainId = !students.containsKey(student.getId());
    boolean anotherCheck = true;
    return doesNotContainId && anotherCheck;
  }

  private long generateId() {
    long studentId = 0L;


    for (long i = 0; i < students.size(); i++) {
         studentId = 1L + i;
    }
//    return studentId;
    return students.size() + 1;
  }

  public Student retrieve(long studentId) {
    return students.get(studentId);
  }
}

