package com.example.exceptionhandling.generics;

import com.example.collections.challenge1.Student;

import java.util.*;

public class Repository<Entity extends RepositoryEntity<ID>, ID> {

  private final Map<ID, Entity> entities = new HashMap<>();

  public static void main(String[] args) {
    Repository<Student, Long> studentRepository = new Repository<>();

    studentRepository.save(new Student(1L, "John"));

    List<Student> allStudents = studentRepository.findAll();
    System.out.println("allStudents = " + allStudents);

    Optional<Student> optional = studentRepository.findById(1L);
    System.out.println("optional = " + optional);

    studentRepository.findById(33333L)
      .orElseThrow(EntityNotFoundException::new);

  }

  private Optional<Entity> findById(ID id) {
    /* use entities to find a key with the id */
    Entity entity = entities.get(id);

    return Optional.ofNullable(entity);
  }

  public List<Entity> findAll() {
    return entities.values().stream().toList();
  }

  public void save(Entity entity) {
    if (entities.containsKey(entity.getId())) {
      throw new EntityExistsException(entity);
    }


    entities.put(entity.getId(), entity);
  }
}
