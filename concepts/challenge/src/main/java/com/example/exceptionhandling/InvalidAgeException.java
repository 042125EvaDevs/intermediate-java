package com.example.exceptionhandling;

public class InvalidAgeException extends Exception {

  public InvalidAgeException(int age){
    super("Age [" + age + "] can not be less than 18. ");

  }


}
