package com.example.exceptionhandling.generics;

public class EntityExistsException extends RuntimeException {
  public <T extends RepositoryEntity> EntityExistsException(T entity) {
    super("Entity with id " + entity.getId() + " already exists");
  }

  public <T extends RepositoryEntity> EntityExistsException() {
    super("Entity already exists");
  }
}
