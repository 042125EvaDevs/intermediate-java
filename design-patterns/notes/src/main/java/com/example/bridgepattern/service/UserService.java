package com.example.bridgepattern.service;

public interface UserService<T> {
  T createUser(String info);
}
