package com.example.exceptionhandling;

import java.util.Scanner;

public class Prompter {


  public static void main(String[] args) {

    Prompter prompter = new Prompter();

    String response;

    try {

      response = prompter.prompt("How many days in a year?");

      System.out.println("You said: " + response);

    } catch (InvalidResponseException e) {

      System.out.println(e);

    } finally {

      System.out.println("The program has reached the finally block");
    }


  }

  public String prompt(String question) throws InvalidResponseException {
    Scanner scanner = new Scanner(System.in);

    System.out.println(question);

    String response = scanner.nextLine();

    if (response.isEmpty()) {
      throw new InvalidResponseException("The response should not be empty");
    }

    return response;
  }


}
